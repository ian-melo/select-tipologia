/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminGeral;

import java.util.Date;
import st.tipologia.Tipologia;


/**
 *
 * @author Fábio
 */
public class Pedido {
    private Date data;

    /**
     *
     * @return retorna a tipologia atual
     */
    public Tipologia obterTipologia(){
      
        return null;
    }
    
    /**
     *
     * @return retorna o cliente atual
     */
    public Cliente obterCliente(){
        return null;
    }
    
    /**
     *
     * @return retorna uma lista com todos os pedidos
     */
    public Pedido[] ListarPedidos(){
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
