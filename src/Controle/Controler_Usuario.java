package Controle;

import Controle.Conexao;
import Objetos.Taxi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import Objetos.Usuario;
import java.sql.Statement;
import java.util.ArrayList;

public class Controler_Usuario {

    private Connection conexao;
    private Statement psmt;

    public int Cadastrar_usuario(Usuario user) {
        String str = "INSERT INTO Usuario(cod, login, senha, cargo) VALUES (0,'" + user.getLogin() + "', '" + user.getSenha()+ "', '" + user.getCargo() + "');";
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

    public ArrayList< Usuario >  Visualizar_usuario(String pBusca) {
        String str, temp = "",BusZ = "";
        int cont;
        Vector z = new Vector();
        
        ArrayList< Usuario > vet = new ArrayList< Usuario >();
        
        for(cont=0;pBusca.charAt(cont)!=',' && cont<pBusca.length();cont++){
            BusZ+=pBusca.charAt(cont);
        }
        if (BusZ.length() >0 ) {
             temp += " login = '" + BusZ + "'";
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
             temp += " cargo = '" + BusZ + "'";
        }
        if (temp.length() >0 ) {
            z.add(temp);
        }
        str = "SELECT * FROM Usuario ";
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
            //psmt.executeQuery(str);
            while (rs.next()) {
                vet.add(new Usuario(rs.getString("login"), rs.getString("senha"), rs.getString("cargo")));
            }
            return vet;

        } catch (SQLException excep) {
            excep.printStackTrace();
            return null;
        }

    }

    public int Excluir_usuario(String pLogin) {
        String str = "DELETE FROM Usuario WHERE login = '"+pLogin+"';";
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
    
    public void Editar_usuario(String pLogin,String pSenha,String pCargo) {
        String str = "UPDATE * FROM Usuario WHERE login = "+pLogin+" SET login = "+pLogin+", senha = "+pSenha+", cargo = "+pCargo+";";
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);

        } catch (SQLException excep) {
            excep.printStackTrace();
        }
    }    
    

}
