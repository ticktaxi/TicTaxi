package Visual;

import Controle.Controler_Usuario;
import Objetos.Usuario;
import java.util.ArrayList;
import java.util.Vector;

public class VisualizarUsuario extends javax.swing.JFrame {

    Controler_Usuario con_user = new Controler_Usuario();

    public VisualizarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListUsuarios = new javax.swing.JList();
        jComboBoxCargo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login");

        jLabel2.setText("Cargo");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        ArrayList< Usuario> usuarios = new ArrayList< Usuario>();
        String BuscarS;
        usuarios = con_user.Visualizar_usuario(",,,,");
        Vector t = new Vector();
        String use;

        for (int cont = 0; cont < usuarios.size(); cont++) {
            use = "" + usuarios.get(cont).getLogin() + ", " + usuarios.get(cont).getCargo();
            t.add(use);
        }
        jListUsuarios.setListData(t);
        jButtonExcluir.setEnabled(false);
        jListUsuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUsuariosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListUsuarios);

        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Taxista", "Secretaria", "Gerente" }));
        jComboBoxCargo.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonBuscar)
                    .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        ArrayList< Usuario> usuarios = new ArrayList< Usuario>();

        String BuscarS;
        BuscarS = jTextFieldLogin.getText() + ",";
        if (jComboBoxCargo.getSelectedItem() != " ") {
            BuscarS += jComboBoxCargo.getSelectedItem() + ",";
        } else {
            BuscarS += ",";
        }

        usuarios = con_user.Visualizar_usuario(BuscarS);
        Vector t = new Vector();
        String use;

        for (int cont = 0; cont < usuarios.size(); cont++) {
            use = "" + usuarios.get(cont).getLogin() + ", " + usuarios.get(cont).getCargo();
            t.add(use);
        }
        jListUsuarios.setListData(t);
        jButtonExcluir.setEnabled(false);

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //passagem de parametro pra edicao
        String BuscarS;
        BuscarS = (String) jListUsuarios.getSelectedValue() + ",";

        String BusZ = "";
        int cont;
        Vector z = new Vector();

        ArrayList< Usuario> vet = new ArrayList< Usuario>();

        for (cont = 0; BuscarS.charAt(cont) != ',' && cont < BuscarS.length(); cont++) {
            BusZ += BuscarS.charAt(cont);
        }
        z.add(BusZ);

        BusZ = "";
        for (cont++; BuscarS.charAt(cont) != ',' && cont < BuscarS.length(); cont++) {
            if (BuscarS.charAt(cont) != ' ') {
                BusZ += BuscarS.charAt(cont);
            }
        }
        z.add(BusZ);

        //fim de passagem
        Usuario user_para_edicao = new Usuario((String) z.get(0), "", (String) z.get(1));
        EditarUsuario Edit_user = new EditarUsuario(user_para_edicao);
        Edit_user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        String a = (String) jListUsuarios.getSelectedValue();
        String deletar = "";
        for (int cont = 0; a.charAt(cont) != ','; cont++) {
            deletar += a.charAt(cont);
        }
        con_user.Excluir_usuario(deletar);

        ArrayList< Usuario> usuarios = new ArrayList< Usuario>();
        usuarios = con_user.Visualizar_usuario(",,");
        Vector t = new Vector();
        String use;

        for (int cont = 0; cont < usuarios.size(); cont++) {
            use = "" + usuarios.get(cont).getLogin() + ", " + usuarios.get(cont).getCargo();
            t.add(use);
        }
        jListUsuarios.setListData(t);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jListUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUsuariosValueChanged
        if (jListUsuarios.getSelectedIndex() >= 0) {
            jButtonExcluir.setEnabled(true);
            jButtonEditar.setEnabled(true);
        } else {
            jButtonExcluir.setEnabled(false);
            jButtonEditar.setEnabled(false);
        }


    }//GEN-LAST:event_jListUsuariosValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JComboBox jComboBoxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jListUsuarios;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
