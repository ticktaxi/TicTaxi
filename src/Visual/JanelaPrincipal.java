package Visual;

import Controle.Controler_Bluetooth;
import Controle.Controler_Bluetooth;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    Controler_Bluetooth bt;   
    
    public JanelaPrincipal() {
        this.bt = new Controler_Bluetooth("COM12",9600,1);
        initComponents();
        bt.ObterIdDaPorta();
        bt.AbrirPorta();
        bt.HabilitarLeitura();
        bt.LerDados();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonInserirTaxi = new javax.swing.JButton();
        jButtonVisualizarTaxi = new javax.swing.JButton();
        jButtonViUsuario = new javax.swing.JButton();
        jButtonInUsuario = new javax.swing.JButton();
        jButtonViCliente = new javax.swing.JButton();
        jButtonInCliente = new javax.swing.JButton();
        jButtonViServico = new javax.swing.JButton();
        jButtonInServico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonInserirTaxi.setText("Inserir Taxi");
        jButtonInserirTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirTaxiActionPerformed(evt);
            }
        });

        jButtonVisualizarTaxi.setText("Visualizar Taxi");
        jButtonVisualizarTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarTaxiActionPerformed(evt);
            }
        });

        jButtonViUsuario.setText("Visualizar Usuario");
        jButtonViUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViUsuarioActionPerformed(evt);
            }
        });

        jButtonInUsuario.setText("Inserir Usuario");
        jButtonInUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInUsuarioActionPerformed(evt);
            }
        });

        jButtonViCliente.setText("Visualizar Cliente");
        jButtonViCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViClienteActionPerformed(evt);
            }
        });

        jButtonInCliente.setText("Inserir Cliente");
        jButtonInCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInClienteActionPerformed(evt);
            }
        });

        jButtonViServico.setText("Visualizar Serviço");
        jButtonViServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViServicoActionPerformed(evt);
            }
        });

        jButtonInServico.setText("Inserir Serviço");
        jButtonInServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInserirTaxi)
                    .addComponent(jButtonVisualizarTaxi))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInUsuario)
                    .addComponent(jButtonViUsuario))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonInCliente)
                    .addComponent(jButtonViCliente))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonViServico)
                    .addComponent(jButtonInServico))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInserirTaxi)
                    .addComponent(jButtonInUsuario)
                    .addComponent(jButtonInCliente)
                    .addComponent(jButtonInServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVisualizarTaxi)
                    .addComponent(jButtonViUsuario)
                    .addComponent(jButtonViCliente)
                    .addComponent(jButtonViServico))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirTaxiActionPerformed
               InserirTaxi intaxi = new InserirTaxi();
        intaxi.setVisible(true);

    }//GEN-LAST:event_jButtonInserirTaxiActionPerformed

    private void jButtonInUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInUsuarioActionPerformed
        InserirUsuario user = new InserirUsuario();
        user.setVisible(true);

    }//GEN-LAST:event_jButtonInUsuarioActionPerformed

    private void jButtonInClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInClienteActionPerformed
        InserirCliente user = new InserirCliente();
        user.setVisible(true);

    }//GEN-LAST:event_jButtonInClienteActionPerformed

    private void jButtonInServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInServicoActionPerformed
        InserirServico user = new InserirServico();
        user.setVisible(true);
    }//GEN-LAST:event_jButtonInServicoActionPerformed

    private void jButtonVisualizarTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarTaxiActionPerformed
        VisualizarTaxi vtaxi = new VisualizarTaxi();
        vtaxi.setVisible(true);
    }//GEN-LAST:event_jButtonVisualizarTaxiActionPerformed

    private void jButtonViUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViUsuarioActionPerformed
        VisualizarUsuario user = new VisualizarUsuario();
        user.setVisible(true);
    }//GEN-LAST:event_jButtonViUsuarioActionPerformed

    private void jButtonViClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViClienteActionPerformed
        VisualizarCliente user = new VisualizarCliente();
        user.setVisible(true);
    }//GEN-LAST:event_jButtonViClienteActionPerformed

    private void jButtonViServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViServicoActionPerformed
        VisualizarServicos user = new VisualizarServicos();
        user.setVisible(true);
    }//GEN-LAST:event_jButtonViServicoActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInCliente;
    private javax.swing.JButton jButtonInServico;
    private javax.swing.JButton jButtonInUsuario;
    private javax.swing.JButton jButtonInserirTaxi;
    private javax.swing.JButton jButtonViCliente;
    private javax.swing.JButton jButtonViServico;
    private javax.swing.JButton jButtonViUsuario;
    private javax.swing.JButton jButtonVisualizarTaxi;
    // End of variables declaration//GEN-END:variables
}
