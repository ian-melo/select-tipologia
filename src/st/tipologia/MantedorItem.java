package st.tipologia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import st.persistencia.BancoDados;
import st.persistencia.ConexaoException;

/**
 * Classe de MantedorItem, que representa o mantimentos dos componentes
 * e tipologias na base de dados
 * @author SCS214
 */
public class MantedorItem {
    /**
     * Insere um componente na base de dados
     * @param c Componente a ser inserido
     * @return true, se houve sucesso<br/>false, se não houve
     */
    public boolean inserirComponente(Componente c) {
        BancoDados bd = new BancoDados();
        PreparedStatement ps;
        String sql;
        //Impede de inserir componente existente
        if(buscarItem(c,false) != 0)
            return false;
        
        try {
            //Define String
            sql = "INSERT INTO Componente VALUES "
                    + "(NULL,?,?,?,?,?,?,?,?,?,?,FALSE)";
            //Abre conexao e prepara gatilho
            ps = bd.abrirConexao().prepareStatement(sql);
            //Atrubui os dados
            ps.setString(1, c.getNome());
            ps.setFloat(2, c.getAltura());
            ps.setFloat(3, c.getLargura());
            ps.setFloat(4, c.getMassa());
            ps.setFloat(5, c.getPreco());
            ps.setString(6, c.getTipo().toString());
            ps.setInt(7, c.getAmbiente().getFatorFogo());
            ps.setInt(8, c.getAmbiente().getFatorSom());
            ps.setInt(9, c.getAmbiente().getFatorUmidade());
            ps.setInt(10, c.getAmbiente().getFatorMecanico());
            //Executa
            ps.executeUpdate();
            //Fecha conexão
            bd.fecharConexao();
        } catch(SQLException ex) {
            return false;
        } catch(ConexaoException ex) {
            return false;
        }
        return true;
    }
    /**
     * Exclui um componente na base de dados
     * @param c Componente a ser excluído
     * @return true, se houve sucesso<br/>false, se não houve
     */
    public boolean excluirComponente(Componente c) {
        BancoDados bd = new BancoDados();
        PreparedStatement ps;
        String sql;
        int codigo = buscarItem(c,false);
        //Impede de excluir componente não existente
        if(codigo == 0)
            return false;
        
        try {
            //Define String
            sql = "UPDATE Componente SET XDEAD=TRUE WHERE CodComponente=" + codigo;
            //Abre conexao e prepara gatilho
            ps = bd.abrirConexao().prepareStatement(sql);
            //Executa
            ps.executeUpdate();
            //Fecha conexão
            bd.fecharConexao();
        } catch(SQLException ex) {
            return false;
        } catch(ConexaoException ex) {
            return false;
        }
        return true;
    }
    /**
     * Insere uma tipologia na base de dados
     * @param t Tipologia a ser inserida
     * @return true, se houve sucesso<br/>false, se não houve
     */
    public boolean inserirTipologia(Tipologia t) {
        BancoDados bd = new BancoDados();
        PreparedStatement ps;
        String sql;
        int codTip = 0;
        List codsCom = new ArrayList();
        //Impede de inserir tipologia existente
        if(buscarItem(t,true) != 0)
            return false;
        
        //Insere componentes da tipologia não existentes no BD e busca respectivos códigos
        for(Componente c : t.getListaComponentes()) {
            inserirComponente(c);
            codsCom.add(buscarItem(c,false));
        }
        
        try {
            //Insere tipologia
            //Define String
            sql = "INSERT INTO Tipologia VALUES "
                    + "(NULL,?,?,?,?,?,?,?,FALSE)";
            //Abre conexao e prepara gatilho
            ps = bd.abrirConexao().prepareStatement(sql);
            //Atrubui os dados
            ps.setFloat(1, t.getAltura());
            ps.setFloat(2, t.getLargura());
            ps.setFloat(3, t.getPreco());
            ps.setInt(4, t.getAmbiente().getFatorFogo());
            ps.setInt(5, t.getAmbiente().getFatorSom());
            ps.setInt(6, t.getAmbiente().getFatorUmidade());
            ps.setInt(7, t.getAmbiente().getFatorMecanico());
            //Executa
            ps.executeUpdate();
            //Fecha conexão
            bd.fecharConexao();
            
            //Procura por código de tipologia
            codTip = buscarItem(t,true);
            
            //Insere relação tipologia x componente
            for (Object codCom : codsCom) {
                //Define String
                sql = "INSERT INTO TipologiaComponente VALUES "
                        + "(?,?,FALSE)";
                //Abre conexao e prepara gatilho
                ps = bd.abrirConexao().prepareStatement(sql);
                //Atrubui os dados
                ps.setInt(1, codTip);
                ps.setInt(2, (int) codCom);
                //Executa
                ps.executeUpdate();
                //Fecha conexão
                bd.fecharConexao();
            }
        } catch(SQLException ex) {
            return false;
        } catch(ConexaoException ex) {
            return false;
        }
        return true;
    }
    /**
     * Exclui uma tipologia na base de dados
     * @param t Tipologia a ser excluída
     * @return true, se houve sucesso<br/>false, se não houve
     */
    public boolean excluirTipologia(Tipologia t) {
        BancoDados bd = new BancoDados();
        PreparedStatement ps;
        String sql;
        int codTip = buscarItem(t,true);
        List codsCom = new ArrayList();
        //Impede de excluir componente não existente
        if((codTip) == 0)
            return false;
        
        //Busca respectivos códigos
        for(Componente c : t.getListaComponentes()) {
            codsCom.add(buscarItem(c,false));
        }
        
        try {
            //Insere tipologia
            //Define String
            sql = "UPDATE Tipologia SET XDEAD=TRUE WHERE CodTipologia=" + codTip;
            //Abre conexao e prepara gatilho
            ps = bd.abrirConexao().prepareStatement(sql);
            //Executa
            ps.executeUpdate();
            //Fecha conexão
            bd.fecharConexao();
            
            //Exclui relação tipologia x componente
            for (Object codCom : codsCom) {
                //Define String
                sql = "UPDATE TipologiaComponente SET XDEAD=TRUE "
                        + "WHERE CodTipologia="+codTip+" AND CodComponente="+((int)codCom);
                //Abre conexao e prepara gatilho
                ps = bd.abrirConexao().prepareStatement(sql);
                //Executa
                ps.executeUpdate();
                //Fecha conexão
                bd.fecharConexao();
            }
        } catch(SQLException ex) {
            return false;
        } catch(ConexaoException ex) {
            return false;
        }
        return true;
    }
    /**
     * Busca pelo item de características definidas na base de dados
     * @param item Item a ser buscado
     * @param isTipologia Define se é tipologia (componente, caso falso)
     * @return Código do item (0, se não existir)
     */
    private int buscarItem(Object item, boolean isTipologia) {
        BancoDados bd = new BancoDados();
        PreparedStatement ps;
        ResultSet rs;
        String sql;
        int codigo = 0;
        //Converte item
        Componente c = null;
        Tipologia t = null;
        if(isTipologia)
            t = (Tipologia) item;
        else
            c = (Componente) item;
        //Realiza busca
        try {
            //Define String
            if(isTipologia) {
                sql = "SELECT * FROM Tipologia WHERE Altura=? AND Largura=? AND Preco=? "
                        + "AND FatorFogo=? AND FatorSom=? AND FatorUmidade=? AND FatorMecanico=? AND XDEAD=FALSE";
            } else {
                sql = "SELECT * FROM Componente WHERE Nome=? AND Altura=? AND Largura=? AND Massa=? AND Preco=? AND Tipo=? "
                        + "AND FatorFogo=? AND FatorSom=? AND FatorUmidade=? AND FatorMecanico=? AND XDEAD=FALSE";
            }
            //Abre banco e prepara gatilho
            ps = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            if(isTipologia) {
                ps.setFloat(1, t.getAltura());
                ps.setFloat(2, t.getLargura());
                ps.setFloat(3, t.getPreco());
                ps.setInt(4, t.getAmbiente().getFatorFogo());
                ps.setInt(5, t.getAmbiente().getFatorSom());
                ps.setInt(6, t.getAmbiente().getFatorUmidade());
                ps.setInt(7, t.getAmbiente().getFatorMecanico());
            } else {
                ps.setString(1, c.getNome());
                ps.setFloat(2, c.getAltura());
                ps.setFloat(3, c.getLargura());
                ps.setFloat(4, c.getMassa());
                ps.setFloat(5, c.getPreco());
                ps.setString(6, c.getTipo().toString());
                ps.setInt(7, c.getAmbiente().getFatorFogo());
                ps.setInt(8, c.getAmbiente().getFatorSom());
                ps.setInt(9, c.getAmbiente().getFatorUmidade());
                ps.setInt(10, c.getAmbiente().getFatorMecanico());
            }
            //Executa e puxa a busca
            rs = ps.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            if(rs.next()) {
                if(isTipologia) {
                    codigo = rs.getInt("CodTipologia");
                } else {
                    codigo = rs.getInt("CodComponente");
                }
            }
            //Prossegue procedimento, caso tenha encontrado
            bd.fecharConexao();
        } catch(SQLException ex) {
            return 0;
        } catch(ConexaoException ex) {
            return 0;
        }
        return codigo;
    }
}