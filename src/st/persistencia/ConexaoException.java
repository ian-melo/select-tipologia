package st.persistencia;

/**
 * Classe de exceção de conexão
 * @author SCS214
 */
class ConexaoException extends java.io.IOException {
    /**
     * Cria uma nova exceção de conexão, definindo a mensagem
     * @param mensagem 
     */
    public ConexaoException(String mensagem) {
        super(mensagem);
    }
}
