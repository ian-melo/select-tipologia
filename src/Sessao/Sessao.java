package Sessao;

/**
 *
 * @author Fábio
 */
public class Sessao {

    private static Funcionario funcionario;

    public static Funcionario getFuncionario() {
        return funcionario;
    }

    public static void setFuncionario(Funcionario funcionario) {
        Sessao.funcionario = funcionario;
    }
    /**
     *
     * @param f entrar com o nomeLogin e senha do usuario/funcionario
     */
    public static void logar(Funcionario f) {
        String senha = f.getSenha();
        String login = f.getNomeLogin();

        if("adm".equals(login) && "123".equals(senha)){
            Sessao.setFuncionario(f);
        }
    }

    /**
     * função que efetuará o deslogue
     */
    public static void deslogar() {

    }

    /**
     * Função qu ira autenticar o funcionario/usuario
     */
    public static void autenticar() {
        

    }
}
