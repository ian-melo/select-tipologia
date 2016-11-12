package Sessao;

import java.util.Date;

/**
 *
 * @author Fábio
 */
public class Funcionario {

    private String nomeLogin;
    private String senha;
    private Date dataHoraAcesso;
    private Date dataHoraSaida;

    /**
     *
     * @return retorna o nome do usuario
     */
    public String getNomeLogin() {
        return nomeLogin;
    }

    /**
     *
     * @param nomeLogin atribui o nome do usuario
     */
    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    /**
     *
     * @return devolve a senha do usuario
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha seta a senha do usuario
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataHoraAcesso() {
        return dataHoraAcesso;
    }

    public void setDataHoraAcesso(Date dataHoraAcesso) {
        this.dataHoraAcesso = dataHoraAcesso;
    }

    public Date getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Date dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

}
