package st.tipologia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import st.persistencia.BancoDados;
import st.persistencia.ConexaoException;
import st.tipologia.Componente.Tipo;

/**
 * Classe de Tipologia, que descreve o conjunto total de componentes
 * que faz parte do produto final
 * @author SCS214
 */
public class Tipologia {
    
    /*ATRIBUTOS*/
    /**
     * Altura da tipologia, em centímetros
     */
    private float altura;
    /**
     * Largura da tipologia, em centímetros
     */
    private float largura;
    /**
     * Preço da tipologia
     */
    private float preco;
    /**
     * Ambiente da tipologia
     */
    private Ambiente ambiente;
    /**
     * Lista de componentes da tipologia
     */
    private ArrayList<Componente> listaComponentes;
    
    /*GETTERS SETTERS*/
    /**
     * Retorna a altura da tipologia, em centímetros
     * @return Altura da tipologia, em centímetros
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Define a altura da tipologia, em centímetros
     * @param altura Altura da tipologia, em centímetros
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Retorna a largura da tipologia, em centímetros
     * @return Largura da tipologia, em centímetros
     */
    public float getLargura() {
        return largura;
    }
    /**
     * Define a largura da tipologia, em centímetros
     * @param largura Largura da tipologia, em centímetros
     */
    public void setLargura(float largura) {
        this.largura = largura;
    }
    /**
     * Retorna o preço da tipologia
     * @return Preço da tipologia
     */
    public float getPreco() {
        return preco;
    }
    /**
     * Define o preço da tipologia
     * @param preco Preço da tipologia
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    /**
     * Retorna o ambiente da tipologia
     * @return Ambiente da tipologia
     */
    public Ambiente getAmbiente() {
        return ambiente;
    }
    /**
     * Define o ambiente da tipologia
     * @param ambiente Ambiente da tipologia
     */
    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }
    /**
     * Retorna a lista de componentes da tipologia
     * @return Lista de componentes da tipologia
     */
    public List<Componente> getListaComponentes() {
        return listaComponentes;
    }
    /**
     * Define a lista de componentes da tipologia
     * @param listaComponentes Lista de componentes da tipologia
     */
    public void setListaComponentes(ArrayList<Componente> listaComponentes) {
        this.listaComponentes = listaComponentes;
    }
    
    /*ESTATICOS*/
    /**
     * Retorna uma lista com todas as tipologias armazenados na base de dados
     * @return Lista de tipologias
     */
    public static List<Tipologia> listarTipologias() {
        BancoDados bd = new BancoDados();
        PreparedStatement ps;
        ResultSet rs;
        String sql;
        Tipologia t = null;
        Ambiente a = null;
        Componente c = null;
        ArrayList<Tipologia> lt = new ArrayList<>();
        ArrayList<Componente> lc = null;
        int codTip = 0;
        
        try {
            //Define String
            sql = "SELECT * FROM Tudo_Tipologia";
            //Prepara gatilho
            ps = bd.abrirConexao().prepareStatement(sql);
            //Executa e puxa a busca
            rs = ps.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            while(rs.next()){
                //Verifica se é nova tipologia
                if(t == null || codTip != rs.getInt("CodTipologia")) {
                    //Adiciona tipologia anterior (se houver)
                    if(t != null && lc != null) {
                        t.setListaComponentes(lc); //Adiciona lista de componentes
                        lt.add(t);
                        lc = null; //Limpa lista para próxima iteração
                    }
                    //Define código de controle da tipologia
                    codTip = rs.getInt("CodTipologia");
                    //Configura nova tipologia
                    t = new Tipologia();
                    t.setAltura(rs.getFloat("TipAltura"));
                    t.setLargura(rs.getFloat("TipLargura"));
                    t.setPreco(rs.getFloat("TipPreco"));
                    a = new Ambiente();
                    a.setFatorFogo(rs.getInt("TipFatorFogo"));
                    a.setFatorSom(rs.getInt("TipFatorSom"));
                    a.setFatorUmidade(rs.getInt("TipFatorUmidade"));
                    a.setFatorMecanico(rs.getInt("TipFatorMecanico"));
                    t.setAmbiente(a);
                }
                //Cria nova lista de componentes (se não houver)
                if(lc == null)
                    lc = new ArrayList<>();
                //Configura novo componente da tipologia
                c = new Componente();
                c.setNome(rs.getString("Nome"));
                c.setAltura(rs.getFloat("Altura"));
                c.setLargura(rs.getFloat("Largura"));
                c.setMassa(rs.getFloat("Massa"));
                c.setPreco(rs.getFloat("Preco"));
                c.setTipo(Tipo.valueOf(rs.getString("Tipo")));
                a = new Ambiente();
                a.setFatorFogo(rs.getInt("FatorFogo"));
                a.setFatorSom(rs.getInt("FatorSom"));
                a.setFatorUmidade(rs.getInt("FatorUmidade"));
                a.setFatorMecanico(rs.getInt("FatorMecanico"));
                c.setAmbiente(a);
                //Adiciona componente à lista
                lc.add(c);
            }
            //Adiciona tipologia pendente (se houver)
            if(t != null && lc != null) {
                t.setListaComponentes(lc); //Adiciona lista de componentes
                lt.add(t);
                lc = null;
            }
            //Fecha conexão
            bd.fecharConexao();
        } catch(SQLException ex) {
            System.out.println("Erro em execução: " + ex.getMessage());
        } catch(ConexaoException ex) {
            System.out.println("Erro na conexão: " + ex.getMessage());
        }
        return lt;
    }
}