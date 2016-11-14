package AdminGeral;

import java.util.ArrayList;
import st.tipologia.Tipologia;


/**
 *
 * @author Fábio
 */
public class AdminGeral {

    /**
     *
     * @param cli utiliza o cliente para seta-la ao pedido 
     * @param t utiliza a tipologia para seta-la ao pedido  
     * @return retorna se o bedido foi gerado com sucesso
     */
    public boolean gerarPedido(Cliente cli, Tipologia t) {
        Pedido p = new Pedido();
        p.obterTipologia();
        
        
        return false;
    }

    /**
     *
     * @return retorna um Array com todos os pedidos
     */
    public ArrayList<Object> gerarRelatorioConsumidor() {

      
        return null;
    }
}
