/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.admin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FormRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form FormiRelatorio
     */
    public FormRelatorio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_relatorio = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jButton1.setText("Visualizar Relatório");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pré-Visualização do relatório");

        tb_relatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_relatorio);

        jScrollPane2.setViewportView(jScrollPane1);

        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        preencherTabela();
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        preencherTabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void preencherTabela() {
        this.setTitle("Relatório");
        //Cabeçalho
        Vector cabecalho = new Vector();
        cabecalho.add("Tipologia");//0
        cabecalho.add("Componente");//1
        cabecalho.add("Ambiente");//2
        cabecalho.add("Data do pedido");//3
        cabecalho.add("Nome Cliente");//4
        cabecalho.add("Telefone");//5
        cabecalho.add("Funcionario");//6
        //Fim

        Vector dados = new Vector();
        Vector item = new Vector();
        //item.clear();
        item.add("ST 1200X1800");//0
        item.add("Chapa ST 1200x1800");//1
        item.add("Ambiente Secos");//2
        item.add("21/06/2106");//3
        item.add("Felipe Martins");//4
        item.add("42217671");//5
        item.add("ADM");//6
        dados.add(item);
        item = new Vector();
        item.add("RU 1200X1800");//0
        item.add("Chapa RU 1200x1800");//1
        item.add("Ambiente Umidos");//2
        item.add("2/02/2106");//3
        item.add("Felipe Da Silva");//4
        item.add("4223-5453");//5
        item.add("ADM");//6
        dados.add(item);
        
        

        //For(){} e BD
        //dados.add(item);
        DefaultTableModel modeloTabela = new DefaultTableModel();
        modeloTabela.setDataVector(dados, cabecalho);
        
        tb_relatorio.setModel(modeloTabela);
        //muda tamanho das colunas
        tb_relatorio.getColumnModel().getColumn(0).setMaxWidth(110);
        tb_relatorio.getColumnModel().getColumn(1).setMaxWidth(110);
        tb_relatorio.getColumnModel().getColumn(2).setMaxWidth(90);
        tb_relatorio.getColumnModel().getColumn(3).setMaxWidth(110);
        tb_relatorio.getColumnModel().getColumn(4).setMaxWidth(90);
        tb_relatorio.getColumnModel().getColumn(5).setMaxWidth(70);
        tb_relatorio.getColumnModel().getColumn(6).setMaxWidth(85);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_relatorio;
    // End of variables declaration//GEN-END:variables
}
