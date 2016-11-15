package st.tipologia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import st.persistencia.BancoDados;
import st.persistencia.ConexaoException;

/**
 * Classe de Componente, que representa um material usado na fabricação
 * do produto final do drywall
 * @author SCS214
 */
public class Componente {
    /*ENUMS*/
    /**
     * Tipo de componente que um componente está sujeito a ser
     */
    public enum Tipo {
        /** Chapa da tipologia */ CHAPA,
        /** Parafuso, grampo, etc. da tipologia */ PARAFUSO,
        /** Forro da tipologia */ FORRO
    }
    
    /*ATRIBUTOS*/
    /**
     * Nome do componente
     */
    private String nome;
    /**
     * Altura do componente, em centímetros
     */
    private float altura;
    /**
     * Largura do componente, em centímetros
     */
    private float largura;
    /**
     * Massa do componente, em gramas
     */
    private float massa;
    /**
     * Preço do componente, em R$
     */
    private float preco;
    /**
     * Tipo do componente
     */
    private Tipo tipo;
    /**
     * Ambiente do componente
     */
    private Ambiente ambiente;
    
    /*GETTERS SETTERS*/
    /**
     * Retorna o nome do componente
     * @return Nome do componente
     */
    public String getNome() {
        return nome;
    }
    /**
     * Define o nome do componente
     * @param nome Nome do componente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Retorna a altura do componente, em centímetros
     * @return Altura do componente
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Define a altura do componente, em centímetros
     * @param altura Altura do componente
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Retorna a largura do componente, em centímetros
     * @return Largura do componente
     */
    public float getLargura() {
        return largura;
    }
    /**
     * Define a largura do componente, em centímetros
     * @param largura Largura do componente
     */
    public void setLargura(float largura) {
        this.largura = largura;
    }
    /**
     * Retorna a massa do componente, em gramas
     * @return Massa do componente
     */
    public float getMassa() {
        return massa;
    }
    /**
     * Define a massa do componente, em gramas
     * @param massa Massa do componente
     */
    public void setMassa(float massa) {
        this.massa = massa;
    }
    /**
     * Retorna o preço do componente, em R$
     * @return Preço do componente
     */
    public float getPreco() {
        return preco;
    }
    /**
     * Define o preço do componente, em R$
     * @param preco Preço do componente
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    /**
     * Retorna o tipo do componente
     * @return Tipo do componente
     */
    public Tipo getTipo() {
        return tipo;
    }
    /**
     * Define o tipo do componente
     * @param tipo Tipo do componente
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    /**
     * Retorna o ambiente do componente
     * @return Ambiente do componente
     */
    public Ambiente getAmbiente() {
        return ambiente;
    }
    /**
     * Define o ambinte do componente
     * @param ambiente do componente
     */
    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }
    
    /*ESTATICOS*/
    /**
     * Retorna uma lista com todos os componentes armazenados na base de dados
     * @return Lista de componentes
     */
    public static List<Componente> listarComponentes() {
        BancoDados bd = new BancoDados();
        PreparedStatement ps;
        ResultSet rs;
        String sql;
        Ambiente a = null;
        Componente c = null;
        ArrayList<Componente> lc = new ArrayList<>();
        int codTip = 0;
        
        try {
            //Define String
            sql = "SELECT * FROM Componente WHERE XDEAD = FALSE";
            //Prepara gatilho
            ps = bd.abrirConexao().prepareStatement(sql);
            //Executa e puxa a busca
            rs = ps.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            while(rs.next()){
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
            //Fecha conexão
            bd.fecharConexao();
        } catch(SQLException ex) {
            return null;
        } catch(ConexaoException ex) {
            return null;
        }
        return lc;
    }
}