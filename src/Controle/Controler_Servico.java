package Controle;

import Objetos.Cliente;
import Objetos.Servico;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Vector;

public class Controler_Servico {

    private Connection conexao;
    private Statement psmt;

    public void Cadastrar_servico(Servico user) {
        String str = "INSERT INTO Servico(cod, codT, data, hora, codC, endereco_inicio, endereco_fim, status) VALUES (0,"+ user.getCodtaxi()+ ", '" + user.getData() +"', '" + user.getHora()+"', " + user.getCodcliente()+", '" + user.getEdereco_inicio()+"', '" + user.getEdereco_fim()+"', '" + user.getStatus()+ "');";
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);
            psmt.executeUpdate(str);
        } catch (SQLException excep) {
            excep.printStackTrace();
        }
    }

    public ArrayList<Servico> Visualizar_servico(String pBusca) {
        ArrayList<Servico> vet = new ArrayList<Servico>();

        
        String str, temp = "",BusZ = "";
        int cont=0;
        Vector z = new Vector();
        Vector y = new Vector();
                
        for(;pBusca.charAt(cont)!=',' && cont<pBusca.length();cont++){
            BusZ+=pBusca.charAt(cont);
        }
        if (BusZ.length() >0 ) {
             temp += " Servico.codT = Taxi.cod and nome_responsavel = '" + BusZ + "'";
        }
        if (temp.length() >0 ) {
            z.add(temp);
            y.add(", Taxi");
        }
        temp = "";
        BusZ = "";
        
        for(cont++;pBusca.charAt(cont)!=',' && cont<pBusca.length();cont++){
            BusZ+=pBusca.charAt(cont);
        }
        if (BusZ.length() >0 ) {
             temp += " Servico.codT = Taxi.cod and placa = '" + BusZ + "'";
        }
        if (temp.length() >0 ) {
            z.add(temp);
            if(y.size()<1){
                y.add(", Taxi");
            }
        }
        temp = "";
        BusZ = "";
        
        for(cont++;pBusca.charAt(cont)!=',' && cont<pBusca.length();cont++){
            BusZ+=pBusca.charAt(cont);
        }
        if (BusZ.length() >0 ) {
             temp += " Servico.codC = Cliente.cod and nome = '" + BusZ + "'";
        }
        if (temp.length() >0 ) {
            z.add(temp);
            y.add(", Cliente");
            
        }
        temp = "";
        BusZ = "";
        
        for(cont++;pBusca.charAt(cont)!=',' && cont<pBusca.length();cont++){
            BusZ+=pBusca.charAt(cont);
        }
        if (BusZ.length() >0 ) {
             temp += " status = '" + BusZ + "'";
        }
        if (temp.length() >0 ) {
            z.add(temp);
        }
        str = "SELECT * FROM Servico";
        if(z.size()>0){
            if(y.size()>0){
                for(int i=0;i<y.size();i++){
                    str += y.get(i);
                }    
            }
            str += " WHERE ";
            for(int i=0;i<z.size();){
                str += z.get(i);
                i++;
                if(i<z.size()){
                    str += " and ";
                }
            }    
        }
        
        str += ";";
                
        
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);
            ResultSet rs = psmt.executeQuery(str);
            while (rs.next()) {
                vet.add(new Servico(rs.getLong("cod"),rs.getLong("codT"), rs.getDate("data"), rs.getTime("hora"), rs.getLong("codC"), rs.getString("endereco_inicio"), rs.getString("endereco_fim"), rs.getString("status")));
            }
            return vet;

        } catch (SQLException excep) {
            excep.printStackTrace();
            return null;
        }
    }

 
    public void Editar_servico(Servico edit_serv) {
        String str = "UPDATE Servico SET codT = "+edit_serv.getCodtaxi()+", data = '"+edit_serv.getData()+"', hora = '"+edit_serv.getHora()+"', codC = "+edit_serv.getCodcliente()+", endereco_inicio = '"+edit_serv.getEdereco_inicio()+"',endereco_fim = '"+edit_serv.getEdereco_fim()+"',status = '"+edit_serv.getStatus()+"' WHERE cod = "+edit_serv.getCod()+";";
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);
            psmt.executeUpdate(str);
        } catch (SQLException excep) {
            excep.printStackTrace();
        }

    }    

    public int Excluir_Servico(long pCod) {
     String str = "DELETE FROM Servico WHERE cod = "+pCod+";";
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);
            psmt.executeUpdate(str);
            return 1;
        } catch (SQLException excep) {
            excep.printStackTrace();
            return 0;
        }

    }
    

}
