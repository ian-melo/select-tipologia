//TODO: Implementar
//TODO: Testar
package st.tipologia;

import javax.swing.JOptionPane;

/**
 * Classe de controle da manutenção de itens, feita através de MantedorItem
 * @author SCS214
 */
public class ControleMantedor {
    /**
     * Realiza a inserção de um componente
     * @param c Componente a ser inserido
     */
    public void inserirComponente(Componente c) {
        MantedorItem mant = new MantedorItem();
        if(!mant.inserirComponente(c))
            JOptionPane.showMessageDialog(null, "Não foi possível inserir o componente.");
    }
    /**
     * Realiza a exclusão de um componente
     * @param c Componente a ser inserido
     */
    public void excluirComponente(Componente c) {
        MantedorItem mant = new MantedorItem();
        if(!mant.excluirComponente(c))
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o componente.");
    }
    /**
     * Realiza a inserção de uma tipologia
     * @param t Tipologia a ser inserida
     */
    public void inserirTipologia(Tipologia t) {
        MantedorItem mant = new MantedorItem();
        if(!mant.inserirTipologia(t))
            JOptionPane.showMessageDialog(null, "Não foi possível inserir a tipologia.");
    }
    /**
     * Realiza a exclusão de uma tipologia
     * @param t Tipologia a ser inserida
     */
    public void excluirTipologia(Tipologia t) {
        MantedorItem mant = new MantedorItem();
        if(!mant.excluirTipologia(t))
            JOptionPane.showMessageDialog(null, "Não foi possível excluir a tipologia.");
    }
}