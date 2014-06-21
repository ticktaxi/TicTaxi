package Controle;

import Objetos.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class Controler_Cliente {

    private Connection conexao;
    private Statement psmt;

    public Date converteData(String data) {
        Date d = null;
        try {
            data = data.substring(6) + "-"
                    + data.substring(3, 5) + "-"
                    + data.substring(0, 2);
            d = Date.valueOf(data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return d;
    }

    public int Cadastrar_Cliente(Cliente user) {

        String str = "INSERT INTO Cliente(cod, nome, telefone, cpf, data_nascimento, email) VALUES (0,'" + user.getNome() + "',  " + user.getTelefone() + ", " + user.getCpf() + ", '" + user.getData_nascimento() + "', '" + user.getEmail() + "');";
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

    public ArrayList<Cliente> Visualizar_Cliente(String pBusca) {
        ArrayList<Cliente> vet = new ArrayList<Cliente>();

        
        String str, temp = "",BusZ = "";
        int cont=0;
        Vector z = new Vector();
                
        for(;pBusca.charAt(cont)!=',' && cont<pBusca.length();cont++){
            BusZ+=pBusca.charAt(cont);
        }
        if (BusZ.length() >0 ) {
             temp += " nome = '" + BusZ + "'";
        }
        if (temp.length() >0 ) {
            z.add(temp);
        }
        temp = "";
        BusZ = "";
        
        for(cont++;pBusca.charAt(cont)!=',' && cont<pBusca.length();cont++){
            BusZ+=pBusca.charAt(cont);
        }
        if (BusZ.length() >0 ) {
             temp += " cpf = '" + BusZ + "'";
        }
        if (temp.length() >0 ) {
            z.add(temp);
        }

        str = "SELECT * FROM Cliente ";
        if(z.size()>0){
            str += "WHERE ";
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
                vet.add(new Cliente(rs.getInt("cod"), rs.getString("nome"), rs.getInt("telefone"), rs.getInt("cpf"), rs.getDate("data_nascimento"), rs.getString("email")));
            }
            return vet;

        } catch (SQLException excep) {
            excep.printStackTrace();
            return null;
        }

    }

    public int Excluir_Cliente(int pCod) {
        String str = "DELETE * FROM Cliente WHERE cod = "+pCod+";";
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

    public void Editar_Cliente(Cliente user) {
        String str = "UPDATE * FROM cliente WHERE cod = " + user.getCod() + " SET nome = " + user.getNome() + ", telefone=" + user.getTelefone() + ", cpf=" + user.getCpf() + ", data_nascimento=" + user.getData_nascimento() + ";";
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);

        } catch (SQLException excep) {
            excep.printStackTrace();
        }

    }
}
