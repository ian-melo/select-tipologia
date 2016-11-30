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
        else
            JOptionPane.showMessageDialog(null, "Componente inserido com sucesso.");
    }
    /**
     * Realiza a exclusão de um componente
     * @param c Componente a ser inserido
     */
    public void excluirComponente(Componente c) {
        if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o componente?") != JOptionPane.OK_OPTION)
            return;
        
        MantedorItem mant = new MantedorItem();
        if(!mant.excluirComponente(c))
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o componente.");
        else
            JOptionPane.showMessageDialog(null, "Componente excluído com sucesso.");
    }
    /**
     * Realiza a inserção de uma tipologia
     * @param t Tipologia a ser inserida
     */
    public void inserirTipologia(Tipologia t) {
        MantedorItem mant = new MantedorItem();
        if(!mant.inserirTipologia(t))
            JOptionPane.showMessageDialog(null, "Não foi possível inserir a tipologia.");
        else
            JOptionPane.showMessageDialog(null, "Tipologia inserida com sucesso.");
    }
    /**
     * Realiza a exclusão de uma tipologia
     * @param t Tipologia a ser inserida
     */
    public void excluirTipologia(Tipologia t) {
        if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a tipologia?") != JOptionPane.OK_OPTION)
            return;
        
        MantedorItem mant = new MantedorItem();
        if(!mant.excluirTipologia(t))
            JOptionPane.showMessageDialog(null, "Não foi possível excluir a tipologia.");
        else
            JOptionPane.showMessageDialog(null, "Tipologia excluída com sucesso.");
    }
}