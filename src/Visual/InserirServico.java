package Visual;

import Controle.Controler_Cliente;
import Controle.Controler_Servico;
import Controle.Controler_Taxi;
import Objetos.Cliente;
import Objetos.Servico;
import Objetos.Taxi;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guilherme
 */
public class InserirServico extends javax.swing.JFrame {

    Controler_Servico Serv = new Controler_Servico();
    ArrayList< Cliente > arraydecliente = new ArrayList< Cliente >();
    
    public InserirServico() {
        initComponents();
    }
    
    public InserirServico(Cliente user, String endereco) {
        initComponents();
        adicionachamada(user, endereco);
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEndInicio = new javax.swing.JTextField();
        jTextFieldEndFim = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        MaskFormatter mf;
        try{
            mf = new MaskFormatter("##/##/####");

            jTextFieldData =  new JFormattedTextField(mf); ;
        }catch(Exception e){}
        jComboBoxReponsavel = new javax.swing.JComboBox();
        jComboBoxCliente = new javax.swing.JComboBox();
        MaskFormatter mfh;
        try{
            mfh = new MaskFormatter("##:##:##");

            jTextFieldHora =  new JFormattedTextField(mfh); ;
        }catch(Exception e){}
        jLabel9 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Responsavel");

        jLabel3.setText("Cliente");

        jLabel5.setText("Endereço de inicio");

        jLabel6.setText("Endereço de fim");

        jLabel7.setText("Data");

        jLabel8.setText("Hora");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        Controler_Taxi taxis = new Controler_Taxi();
        ArrayList< Taxi > arraydetaxi = new ArrayList< Taxi >();
        arraydetaxi = taxis.Visualizar_taxi(",,,,");
        Vector t = new Vector();
        String tax;

        for(int cont = 0;cont<arraydetaxi.size();cont++){
            tax = ""+arraydetaxi.get(cont).getCod()+", Nome: "+arraydetaxi.get(cont).getResp_taxi()+", Telefone: "+arraydetaxi.get(cont).getTelefone()+", Modelo: "+arraydetaxi.get(cont).getModelo()+", Cor: "+arraydetaxi.get(cont).getCor()+", Placa: "+arraydetaxi.get(cont).getPlaca();
            jComboBoxReponsavel.insertItemAt(tax,cont);
        }

        Controler_Cliente client = new Controler_Cliente();

        arraydecliente = client.Visualizar_Cliente(",,");

        String temp;

        for(int cont = 0;cont<arraydecliente.size();cont++){
            temp = ""+arraydecliente.get(cont).getCod()+", Nome: "+arraydecliente.get(cont).getNome()+", Telefone: "+arraydecliente.get(cont).getTelefone();
            jComboBoxCliente.insertItemAt(temp,cont);
        }

        jLabel9.setText("Status");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aberto", "Finalizado", "Cancelado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxReponsavel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndInicio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndFim))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCadastrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxReponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEndInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldEndFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        String dataServi = jTextFieldData.getText();
        String a = (String) jComboBoxReponsavel.getSelectedItem();
        String chaveT="";
        String chaveC="";
        DateFormat formato = new SimpleDateFormat("HH:mm:ss");
        java.sql.Time horaS = null;
        try {  
            horaS = new java.sql.Time(formato.parse(jTextFieldHora.getText()).getTime());  
        } catch (Exception e) {  
            throw new RuntimeException(e.getMessage());  
        }  
    

        java.util.Date dataN = null;
        try {
            dataN = data.parse(dataServi);
        } catch (ParseException ex) { }
        java.sql.Date datas = null;
        datas = new java.sql.Date(dataN.getTime());
                
        for(int cont=0;a.charAt(cont)!=',';cont++){
            chaveT+=a.charAt(cont);
        }
        a = (String) jComboBoxCliente.getSelectedItem();
        for(int cont=0;a.charAt(cont)!=',';cont++){
            chaveC+=a.charAt(cont);
        }
        

        Servico serv = new Servico(0, Long.parseLong(chaveT), datas, horaS, Long.parseLong(chaveC),jTextFieldEndInicio.getText(),jTextFieldEndFim.getText(),(String)jComboBoxStatus.getSelectedItem());
        Serv.Cadastrar_servico(serv);
        this.dispose();  
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    
     public void adicionachamada(Cliente client, String endereco){
         for (int cont = 0; cont < arraydecliente.size(); cont++) {
            if (client.getCod() == arraydecliente.get(cont).getCod()) {
                jComboBoxCliente.setSelectedIndex(cont);
                break;
            }
        }
        jTextFieldEndInicio.setText(endereco);
        jButtonCancelar.setEnabled(false);
     }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox jComboBoxCliente;
    private javax.swing.JComboBox jComboBoxReponsavel;
    private javax.swing.JComboBox jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEndFim;
    private javax.swing.JTextField jTextFieldEndInicio;
    private javax.swing.JFormattedTextField jTextFieldHora;
    // End of variables declaration//GEN-END:variables
}
