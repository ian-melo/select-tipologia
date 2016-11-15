package testes;

import st.persistencia.BancoDados;
import st.persistencia.ConexaoException;

/**
 * Classe de teste de conexão
 * @author SCS214
 */
public class TesteConexao {
    public static void main(String[] args) throws ConexaoException {
        BancoDados bd = new BancoDados();
        bd.abrirConexao();
        bd.fecharConexao();
        
        bd = new BancoDados("tipologia","root","root");
        bd.abrirConexao();
        
        bd.fecharConexao();
    }
}
