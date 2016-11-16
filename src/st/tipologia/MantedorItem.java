//TODO: Fazer MantedorItem
//TODO: Testar
package st.tipologia;

/**
 * Classe de MantedorItem, que representa o mantimentos dos componentes
 * e tipologias na base de dados
 * @author SCS214
 */
public class MantedorItem {
    /**
     * Código de um item
     */
    private int codBusca;
    
    /**
     * Insere um componente na base de dados
     * @param c Componente a ser inserido
     * @return true, se houve sucesso<br/>false, se não houve
     */
    public boolean inserirComponente(Componente c) {
        return false;
    }
    /**
     * Exclui um componente na base de dados
     * @param c Componente a ser excluído
     * @return true, se houve sucesso<br/>false, se não houve
     */
    public boolean excluirComponente(Componente c) {
        return false;
    }
    /**
     * Insere uma tipologia na base de dados
     * @param t Tipologia a ser inserida
     * @return true, se houve sucesso<br/>false, se não houve
     */
    public boolean inserirTipologia(Tipologia t) {
        return false;
    }
    /**
     * Exclui uma tipologia na base de dados
     * @param t Tipologia a ser excluída
     * @return true, se houve sucesso<br/>false, se não houve
     */
    public boolean excluirTipologia(Tipologia t) {
        return false;
    }
    /**
     * Busca pelo item de um código definido na base de dados
     * @param isTipologia Define se é tipologia (componente, caso falso)
     * @return Resultado da busca
     */
    private Object buscarItem(boolean isTipologia) {
        return null;
    }
}