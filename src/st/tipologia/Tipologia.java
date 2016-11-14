//TODO: Testar
//TODO: função listarTipologias
package st.tipologia;

import java.util.ArrayList;
import java.util.List;
import st.persistencia.BancoDados;

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
     * Ambiente da tipologia
     */
    private Ambiente ambiente;
    /**
     * Lista de componentes da tipologia
     */
    private ArrayList<Tipologia> listaComponentes;
    
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
    public List<Tipologia> getListaComponentes() {
        return listaComponentes;
    }
    /**
     * Define a lista de componentes da tipologia
     * @param listaComponentes Lista de componentes da tipologia
     */
    public void setListaComponentes(ArrayList<Tipologia> listaComponentes) {
        this.listaComponentes = listaComponentes;
    }
    
    /*ESTATICOS*/
    /**
     * Retorna uma lista com todas as tipologias armazenados na base de dados
     * @return Lista de tipologias
     */
    public static List<Tipologia> listarTipologias() {
        BancoDados con;
        
        return null;
    }
}