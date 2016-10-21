package st.tipologia;

/**
 *
 * @author SCS214
 */
public class Componente {
    /**
     * Tipos de componente que compõe uma tipologia
     */
    public enum Tipo {
        /** Chapa da tipologia */ CHAPA,
        /** Parafuso, grampo, etc. da tipologia */ PARAFUSO,
        /** Forro da tipologia */ FORRO
    }
    
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
     * Tipo do componente
     */
    private Tipo tipo;
    /**
     * Preço do componente, em R$
     */
    private float preco;
    
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
}
