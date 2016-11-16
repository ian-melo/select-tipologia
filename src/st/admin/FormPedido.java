/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.admin;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FormPedido extends javax.swing.JFrame {

    /**
     * Creates new form FormPedido
     */
    public FormPedido() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_pedido = new javax.swing.JTable();
        btn_atualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tb_pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_pedido);

        btn_atualizar.setText("Atualizar");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Pedidos");

        btn_fechar.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_fechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atualizar)
                    .addComponent(btn_fechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        preencherTabela();
    }//GEN-LAST:event_formWindowActivated

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        preencherTabela();
    }//GEN-LAST:event_btn_atualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPedido().setVisible(true);
            }
        });
    }

    public void preencherTabela() {
        this.setTitle("Pedido");//melhorar
        //Cabeçalho
        Vector cabecalho = new Vector();
        cabecalho.add("Altura");//0
        cabecalho.add("Largura");//1
        cabecalho.add("Preço");//2
        cabecalho.add("Fogo");//3
        cabecalho.add("Som");//4
        cabecalho.add("Umidade");//5
        cabecalho.add("Mecanico");//6

        cabecalho.add("Nome do Cliente");//7
        cabecalho.add("Endereço");//8
        cabecalho.add("Telefone");//9
        cabecalho.add("Data");//10
        //Fim

        Vector dados = new Vector();
        Vector item = new Vector();

        //apagar apartir desta linha
        //apenas para teste e manual do usuario
        item.add("1,5");//temporario todos
        item.add("1,5");//temporario
        item.add("R$ 10,5");//temporario
        item.add("1");//temporario
        item.add("5");
        item.add("1");
        item.add("1");//
        item.add("Fernando J.");
        item.add("Rua 3");
        item.add("(11)9-1234-5678");
        item.add("10/11/2016");//temporario
        dados.add(item);

        item = new Vector();
        //apenas para teste e manual do usuario
        item.add("1,75");//temporario todos
        item.add("1,20");//temporario
        item.add("R$ 7,5");//temporario
        item.add("2");//temporario
        item.add("6");
        item.add("1");
        item.add("1");//
        item.add("Leticia Silva");
        item.add("Rua Vinte");
        item.add("(11)9-9876-5432");
        item.add("11/11/2016");//temporario
        dados.add(item);
        //apagar até aqui

        DefaultTableModel modeloTabela = new DefaultTableModel();
        modeloTabela.setDataVector(dados, cabecalho);

        tb_pedido.setModel(modeloTabela);
        //muda tamanho das colunas
        tb_pedido.getColumnModel().getColumn(0).setMaxWidth(50);
        tb_pedido.getColumnModel().getColumn(1).setMaxWidth(60);
        tb_pedido.getColumnModel().getColumn(2).setMaxWidth(70);
        tb_pedido.getColumnModel().getColumn(3).setMaxWidth(50);
        tb_pedido.getColumnModel().getColumn(4).setMaxWidth(50);
        tb_pedido.getColumnModel().getColumn(5).setMaxWidth(70);
        tb_pedido.getColumnModel().getColumn(6).setMaxWidth(70);
        tb_pedido.getColumnModel().getColumn(7).setMaxWidth(140);
        tb_pedido.getColumnModel().getColumn(8).setMaxWidth(120);
        tb_pedido.getColumnModel().getColumn(9).setMaxWidth(100);
        tb_pedido.getColumnModel().getColumn(10).setMaxWidth(80);

        //tb_pedido.getColumnModel().getColumn(0).setMinWidth(40);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_pedido;
    // End of variables declaration//GEN-END:variables
}
