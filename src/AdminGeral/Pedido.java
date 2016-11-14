package AdminGeral;

import java.util.ArrayList;
import java.util.Date;
import st.tipologia.Tipologia;


/**
 *
 * @author Fábio
 */
public class Pedido {

    private Date data;
    private Tipologia tipologia;//vem da agregação
    private Cliente cliente;//vem da composição

    /**
     *
     * @return retorna a tipologia atual
     */
    public Tipologia obterTipologia() {

        return null;
    }

    /**
     *
     * @return retorna o cliente atual
     */
    public Cliente obterCliente() {
        return null;
    }

    /**
     *
     * @return retorna uma lista com todos os pedidos
     */
    public ArrayList<Pedido> ListarPedidos() {
        return null;
    }

    /**
     *
     * @return
     */
    public Date getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(Date data) {
        this.data = data;
    }
}
