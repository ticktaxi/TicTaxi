package Visual;

import Controle.Controler_Cliente;
import Controle.Controler_Servico;
import Controle.Controler_Taxi;
import Objetos.Cliente;
import Objetos.Servico;
import Objetos.Taxi;
import java.util.ArrayList;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guilherme
 */
public class VisualizarServicos extends javax.swing.JFrame {

    Controler_Servico serv = new Controler_Servico();

    public VisualizarServicos() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jComboBox3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome do responsavel");

        jLabel2.setText("Placa");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Fechar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome do cliente");

        jLabel4.setText("Status");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        Controler_Cliente client = new Controler_Cliente();
        Controler_Taxi taxis = new Controler_Taxi();
        ArrayList< Servico> arraydeservico = new ArrayList< Servico>();
        String BuscarS;

        arraydeservico = serv.Visualizar_servico(",,,,,");

        Vector t = new Vector();
        String temp;
        ArrayList< Cliente> arraydecliente = new ArrayList< Cliente>();
        ArrayList< Taxi> arraydetaxi = new ArrayList< Taxi>();

        arraydecliente = client.Visualizar_Cliente(",,");
        Vector VClientes = new Vector();

        for (int cont = 0; cont < arraydecliente.size(); cont++) {
            temp = "" + arraydecliente.get(cont).getCod() + ", " + arraydecliente.get(cont).getNome() + ", CPF: " + arraydecliente.get(cont).getCpf() + ", Telefone: " + arraydecliente.get(cont).getTelefone();
            VClientes.add(temp);
        }

        arraydetaxi = taxis.Visualizar_taxi(",,,,");
        Vector VTaxis = new Vector();

        for (int cont = 0; cont < arraydetaxi.size(); cont++) {
            temp = "" + arraydetaxi.get(cont).getCod() + ", Taxista: " + arraydetaxi.get(cont).getResp_taxi() + ", Placa: " + arraydetaxi.get(cont).getPlaca() + ", Telefone: " + arraydetaxi.get(cont).getTelefone();
            VTaxis.add(temp);
        }

        for (int cont = 0; cont < arraydeservico.size(); cont++) {

            temp = "" + arraydeservico.get(cont).getCod() + ", Cliente: " + RetornaRestoString(VClientes, "" + arraydeservico.get(cont).getCodcliente()) + ", " + RetornaRestoString(VTaxis, "" + arraydeservico.get(cont).getCodtaxi()) + ", Inicio: " + arraydeservico.get(cont).getEdereco_inicio() + ", Fim: " + arraydeservico.get(cont).getEdereco_fim() + ", " + arraydeservico.get(cont).getStatus();
            t.add(temp);
        }
        jList1.setListData(t);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Aberto", "Finalizado", "Cancelado" }));

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
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private String RetornaRestoString(Vector VClientes, String s) {
        String deletar = "";
        String resto = "";
        for (int i = 0; i < VClientes.size(); i++) {
            String a = (String) VClientes.get(i);
            deletar = "";
            for (int cont = 0; a.charAt(cont) != ','; cont++) {
                deletar += a.charAt(cont);
                if ((Integer.parseInt(s) == Integer.parseInt(deletar)) && (a.charAt(cont + 1) == ',')) {
                    for (cont += 3; cont < a.length(); cont++) {
                        resto += a.charAt(cont);
                    }
                    return resto;
                }
            }

        }
        return "Inconcistencia no banco.";
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Controler_Cliente client = new Controler_Cliente();
        Controler_Taxi taxis = new Controler_Taxi();
        ArrayList< Servico> arraydeservico = new ArrayList< Servico>();
        String BuscarS;
        BuscarS = jTextField1.getText() + ",";
        BuscarS += jTextField2.getText() + ",";
        BuscarS += jTextField3.getText() + ",";
        if (jComboBox3.getSelectedItem() != " ") {
            BuscarS += jComboBox3.getSelectedItem() + ",";
        } else {
            BuscarS += ",";
        }

        arraydeservico = serv.Visualizar_servico(BuscarS);

        Vector t = new Vector();
        String temp;
        ArrayList< Cliente> arraydecliente = new ArrayList< Cliente>();
        ArrayList< Taxi> arraydetaxi = new ArrayList< Taxi>();

        arraydecliente = client.Visualizar_Cliente(",,");
        Vector VClientes = new Vector();

        for (int cont = 0; cont < arraydecliente.size(); cont++) {
            temp = "" + arraydecliente.get(cont).getCod() + ", " + arraydecliente.get(cont).getNome() + ", CPF: " + arraydecliente.get(cont).getCpf() + ", Telefone: " + arraydecliente.get(cont).getTelefone();
            VClientes.add(temp);
        }

        arraydetaxi = taxis.Visualizar_taxi(",,,,");
        Vector VTaxis = new Vector();

        for (int cont = 0; cont < arraydetaxi.size(); cont++) {
            temp = "" + arraydetaxi.get(cont).getCod() + ", Taxista: " + arraydetaxi.get(cont).getResp_taxi() + ", Placa: " + arraydetaxi.get(cont).getPlaca() + ", Telefone: " + arraydetaxi.get(cont).getTelefone();
            VTaxis.add(temp);
        }

        for (int cont = 0; cont < arraydeservico.size(); cont++) {

            temp = "" + arraydeservico.get(cont).getCod() + ", Cliente: " + RetornaRestoString(VClientes, "" + arraydeservico.get(cont).getCodcliente()) + ", " + RetornaRestoString(VTaxis, "" + arraydeservico.get(cont).getCodtaxi()) + ", Inicio: " + arraydeservico.get(cont).getEdereco_inicio() + ", Fim: " + arraydeservico.get(cont).getEdereco_fim() + ", " + arraydeservico.get(cont).getStatus();
            t.add(temp);
        }
        jList1.setListData(t);
        jButton3.setEnabled(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EditarServico user = new EditarServico();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String a = (String) jList1.getSelectedValue();
        String deletar = "";
        for (int cont = 0; a.charAt(cont) != ','; cont++) {
            deletar += a.charAt(cont);
        }
        serv.Excluir_Servico(Integer.parseInt(deletar));

        Controler_Cliente client = new Controler_Cliente();
        Controler_Taxi taxis = new Controler_Taxi();
        ArrayList< Servico> arraydeservico = new ArrayList< Servico>();
        String BuscarS;
        BuscarS = jTextField1.getText() + ",";
        BuscarS += jTextField2.getText() + ",";
        BuscarS += jTextField3.getText() + ",";
        if (jComboBox3.getSelectedItem() != " ") {
            BuscarS += jComboBox3.getSelectedItem() + ",";
        } else {
            BuscarS += ",";
        }

        arraydeservico = serv.Visualizar_servico(BuscarS);

        Vector t = new Vector();
        String temp;
        ArrayList< Cliente> arraydecliente = new ArrayList< Cliente>();
        ArrayList< Taxi> arraydetaxi = new ArrayList< Taxi>();

        arraydecliente = client.Visualizar_Cliente(",,");
        Vector VClientes = new Vector();

        for (int cont = 0; cont < arraydecliente.size(); cont++) {
            temp = "" + arraydecliente.get(cont).getCod() + ", " + arraydecliente.get(cont).getNome() + ", CPF: " + arraydecliente.get(cont).getCpf() + ", Telefone: " + arraydecliente.get(cont).getTelefone();
            VClientes.add(temp);
        }

        arraydetaxi = taxis.Visualizar_taxi(",,,,");
        Vector VTaxis = new Vector();

        for (int cont = 0; cont < arraydetaxi.size(); cont++) {
            temp = "" + arraydetaxi.get(cont).getCod() + ", Taxista: " + arraydetaxi.get(cont).getResp_taxi() + ", Placa: " + arraydetaxi.get(cont).getPlaca() + ", Telefone: " + arraydetaxi.get(cont).getTelefone();
            VTaxis.add(temp);
        }

        for (int cont = 0; cont < arraydeservico.size(); cont++) {

            temp = "" + arraydeservico.get(cont).getCod() + ", Cliente: " + RetornaRestoString(VClientes, "" + arraydeservico.get(cont).getCodcliente()) + ", " + RetornaRestoString(VTaxis, "" + arraydeservico.get(cont).getCodtaxi()) + ", Inicio: " + arraydeservico.get(cont).getEdereco_inicio() + ", Fim: " + arraydeservico.get(cont).getEdereco_fim() + ", " + arraydeservico.get(cont).getStatus();
            t.add(temp);
        }
        jList1.setListData(t);
        jButton3.setEnabled(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        jButton3.setEnabled(true);


    }//GEN-LAST:event_jList1ValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
