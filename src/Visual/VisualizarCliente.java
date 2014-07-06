package Visual;


import Controle.Controler_Cliente;
import Objetos.Cliente;
import Visual.EditarCliente;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guilherme
 */
public class VisualizarCliente extends javax.swing.JFrame {

    Controler_Cliente client = new Controler_Cliente();

    public VisualizarCliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCliente = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

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

        ArrayList< Cliente> arraydecliente = new ArrayList< Cliente>();

        arraydecliente = client.Visualizar_Cliente(",,,");
        Vector t = new Vector();
        String temp;

        for (int cont = 0; cont < arraydecliente.size(); cont++) {
            temp = "" + arraydecliente.get(cont).getCod() + ", " + arraydecliente.get(cont).getNome() + ", " + arraydecliente.get(cont).getCpf() + ", " + arraydecliente.get(cont).getTelefone() + ", " + arraydecliente.get(cont).getData_nascimento() + ", " + arraydecliente.get(cont).getEmail();
            t.add(temp);
        }
        jListCliente.setListData(t);
        jListCliente.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListClienteValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListCliente);

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
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        ArrayList< Cliente> arraydecliente = new ArrayList< Cliente>();
        String BuscarS;
        BuscarS = jTextFieldNome.getText() + ",";
        BuscarS += jTextFieldCpf.getText() + ",";
        arraydecliente = client.Visualizar_Cliente(BuscarS);
        Vector t = new Vector();
        String temp;

        for (int cont = 0; cont < arraydecliente.size(); cont++) {
            temp = "" + arraydecliente.get(cont).getCod() + ", " + arraydecliente.get(cont).getNome() + ", " + arraydecliente.get(cont).getCpf() + ", " + arraydecliente.get(cont).getTelefone() + ", " + arraydecliente.get(cont).getData_nascimento() + ", " + arraydecliente.get(cont).getEmail();
            t.add(temp);
        }
        jListCliente.setListData(t);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        try {                                         
            String BuscarS;
            EditarCliente user;
            BuscarS = (String) jListCliente.getSelectedValue() + ",";
            
            String BusZ = "";
            int cont;
            Vector z = new Vector();
            
            for (cont = 0; BuscarS.charAt(cont) != ',' && cont < BuscarS.length(); cont++) {
                BusZ += BuscarS.charAt(cont);
            }
            z.add(BusZ);
            for (int i = 0; i < 5; i++) {
                BusZ = "";
                for (cont++; BuscarS.charAt(cont) != ',' && cont < BuscarS.length(); cont++) {
                    if (BuscarS.charAt(cont) != ' ') {
                        BusZ += BuscarS.charAt(cont);
                    }
                }
                z.add(BusZ);
            }
            
            z.add(BusZ);
            BusZ = "";
            Vector y = new Vector();
            cont = 0;
            BuscarS = (String) z.get(4) + "-";
            for (int k = 0; k < 3; k++) {
                for (; BuscarS.charAt(cont) != '-' && cont < BuscarS.length(); cont++) {
                    BusZ += BuscarS.charAt(cont);
                }
                y.add(BusZ);
                BusZ = "";
                cont++;
            }
            SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            String dataNasci = ((String) y.get(2) + "/" + (String) y.get(1) + "/" + (String) y.get(0));
            java.util.Date dataN = null;
            try {
                dataN = data.parse(dataNasci);
            } catch (ParseException ex) {
            }
            java.sql.Date datas = null;
            datas = new java.sql.Date(dataN.getTime());
            
            Cliente Cliente_p_editar = new Cliente(Long.parseLong((String) z.get(0)), (String) z.get(1), Long.parseLong((String) z.get(2)), Long.parseLong((String) z.get(3)), datas, (String) z.get(5));
            
            user = new EditarCliente(Cliente_p_editar);
            
            
            
            user.setVisible(true);
            this.dispose();
        } catch (ParseException ex) {
            Logger.getLogger(VisualizarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        String a = (String) jListCliente.getSelectedValue();
        String deletar = "";
        for (int cont = 0; a.charAt(cont) != ','; cont++) {
            deletar += a.charAt(cont);
        }
        client.Excluir_Cliente(Long.parseLong(deletar));

        ArrayList< Cliente> arraydecliente = new ArrayList< Cliente>();

        arraydecliente = client.Visualizar_Cliente(",,");
        Vector t = new Vector();
        String temp;

        for (int cont = 0; cont < arraydecliente.size(); cont++) {
            temp = "" + arraydecliente.get(cont).getCod() + ", " + arraydecliente.get(cont).getNome() + ", " + arraydecliente.get(cont).getCpf() + ", " + arraydecliente.get(cont).getTelefone() + ", " + arraydecliente.get(cont).getData_nascimento() + ", " + arraydecliente.get(cont).getEmail();
            t.add(temp);
        }
        jListCliente.setListData(t);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jListClienteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListClienteValueChanged
        if (jListCliente.getSelectedIndex() >= 0) {
            jButtonExcluir.setEnabled(true);
            jButtonEditar.setEnabled(true);
        } else {
            jButtonExcluir.setEnabled(false);
            jButtonEditar.setEnabled(false);
        }
    }//GEN-LAST:event_jListClienteValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jListCliente;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
