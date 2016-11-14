package Sessao;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

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

        if ("adm".equals(login) && "123".equals(senha)) {
            //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            f.setDataHoraAcesso(new Date(System.currentTimeMillis()));//Pega a hora do sistema q iniciou

            Sessao.setFuncionario(f);
            //JOptionPane.showMessageDialog(null, sdf.format(new Date(System.currentTimeMillis())));
            //JOptionPane.showMessageDialog(null, new Date(System.currentTimeMillis()));

        }
    }

    /**
     * função que efetuará o deslogue
     */
    public static void deslogar() {
        funcionario.setDataHoraSaida(new Date(System.currentTimeMillis()));
        //Salvar no BD
        Sessao.funcionario = null;//'encerrando sessao'
    }

    /**
     * Função qu ira autenticar o funcionario/usuario
     */
    public static void autenticar() {

    }
}
