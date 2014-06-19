package Controle;

import Controle.Conexao;
import Objetos.Taxi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class Controler_Taxi {

    private Connection conexao;
    private Statement psmt;

    public int Cadastrar_taxi(Taxi user) {
        String str = "INSERT INTO Taxi(cod, nome_responsavel, cpf, telefone, modelo, cor, placa) VALUES (0,'" + user.getResp_taxi()+ "', " + user.getCpf()+ ", " + user.getTelefone()+ ", '" + user.getModelo()+ "', '" + user.getCor()+ "', '" + user.getPlaca()+ "');";
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

   public ArrayList<Taxi> Visualizar_taxi(String pBusca, int metodo) {
        String str;
        
        ArrayList< Taxi > vet = new ArrayList< Taxi >();
        if (metodo == 1) {
            str = "SELECT * FROM Taxi WHERE nome_responsavel =" + pBusca + ";";
        } else if (metodo == 2) {
            str = "SELECT * FROM Taxi WHERE modelo =" + pBusca + ";";
        } else if (metodo == 3){
            str = "SELECT * FROM Taxi WHERE cor =" + pBusca + ";";
        }else if (metodo == 4){
            str = "SELECT * FROM Taxi WHERE placa =" + pBusca + ";";            
        }else{
            str = "SELECT * FROM Taxi;"; 
        }
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);
            ResultSet rs = psmt.executeQuery(str);
            while (rs.next()) {
                vet.add(new Taxi(rs.getInt("cod"),rs.getString("nome_responsavel"), rs.getInt("cpf"), rs.getInt("telefone"), rs.getString("modelo"), rs.getString("cor"), rs.getString("placa")));
            }
            return vet;

        } catch (SQLException excep) {
            excep.printStackTrace();
            return null;
        }

    }

    public void Excluir_taxi(int pDado) {
        String str = "DELETE FROM Taxi WHERE cod = "+pDado+";";
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);
            psmt.executeUpdate(str);
        } catch (SQLException excep) {
            excep.printStackTrace();
        }
    }
    
    public void Editar_taxi(int cod, String resp_taxi, int cpf, int telefone, String modelo, String cor, String placa) {
        String str = "UPDATE * FROM Taxi WHERE cod ="+cod+" SET nome_responsavel="+resp_taxi+",cpf="+cpf+",telefone="+telefone+",modelo="+modelo+",cor="+cor+",placa="+placa+";";
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);

        } catch (SQLException excep) {
            excep.printStackTrace();
        }
    }    
    

}