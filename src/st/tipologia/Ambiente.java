package st.tipologia;

/**
 * Classe de Ambiente, que representa o ambiente em que um componente
 * ou tipologia drywall em que se está situada
 * @author SCS214
 */
public class Ambiente {
    /*ATRIBUTOS*/
    /**
     * Representa o quanto um item será resistente a fogo
     * Valor de 0 (sem resistência) a 100 (resistência total)
     */
    private int fatorFogo;
    /**
     * Representa o quanto um item será resistente a ondas sonoras
     * Valor de 0 (sem resistência) a 100 (resistência total)
     */
    private int fatorSom;
    /**
     * Representa o quanto um item será resistente a umidade
     * Valor de 0 (sem resistência) a 100 (resistência total)
     */
    private int fatorUmidade;
    /**
     * Representa o quanto um item será resistente a força mecânica
     * Valor de 0 (sem resistência) a 100 (resistência total)
     */
    private int fatorMecanico;
    
    /*GETTERS SETTERS*/
    /**
     * Retorna o quanto um item será resistente a fogo
     * Valor de 0 (sem resistência) a 100 (resistência total)
     * @return Valor de fator fogo
     */
    public int getFatorFogo() {
        return fatorFogo;
    }
    /**
     * Define o quanto um item será resistente a fogo
     * Valor de 0 (sem resistência) a 100 (resistência total)
     * @param fatorFogo Valor de fator fogo
     */
    public void setFatorFogo(int fatorFogo) {
        this.fatorFogo = fatorFogo;
    }
    /**
     * Retorna o quanto um item será resistente a ondas sonoras
     * Valor de 0 (sem resistência) a 100 (resistência total)
     * @return Valor de fator som
     */
    public int getFatorSom() {
        return fatorSom;
    }
    /**
     * Define o quanto um item será resistente a ondas sonoras
     * Valor de 0 (sem resistência) a 100 (resistência total)
     * @param fatorSom Valor de fator som
     */
    public void setFatorSom(int fatorSom) {
        this.fatorSom = fatorSom;
    }
    /**
     * Retorna o quanto um item será resistente a umidade
     * Valor de 0 (sem resistência) a 100 (resistência total)
     * @return Valor de fator umidade
     */
    public int getFatorUmidade() {
        return fatorUmidade;
    }
    /**
     * Define o quanto um item será resistente a umidade
     * Valor de 0 (sem resistência) a 100 (resistência total)
     * @param fatorUmidade Valor de fator umidade
     */
    public void setFatorUmidade(int fatorUmidade) {
        this.fatorUmidade = fatorUmidade;
    }
    /**
     * Retorna o quanto um item será resistente a força mecânica
     * Valor de 0 (sem resistência) a 100 (resistência total)
     * @return Valor de fator mecânico
     */
    public int getFatorMecanico() {
        return fatorMecanico;
    }
    /**
     * Define o quanto um item será resistente a força mecânica
     * Valor de 0 (sem resistência) a 100 (resistência total)
     * @param fatorMecanico Valor de fator mecânico
     */
    public void setFatorMecanico(int fatorMecanico) {
        this.fatorMecanico = fatorMecanico;
    }
    
    /*IGUALDADE*/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.fatorFogo;
        hash = 23 * hash + this.fatorSom;
        hash = 23 * hash + this.fatorUmidade;
        hash = 23 * hash + this.fatorMecanico;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ambiente other = (Ambiente) obj;
        if (this.fatorFogo != other.fatorFogo) {
            return false;
        }
        if (this.fatorSom != other.fatorSom) {
            return false;
        }
        if (this.fatorUmidade != other.fatorUmidade) {
            return false;
        }
        if (this.fatorMecanico != other.fatorMecanico) {
            return false;
        }
        return true;
    }    
}