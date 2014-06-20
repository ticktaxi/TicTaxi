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

    public ArrayList< Usuario >  Visualizar_usuario(String pBusca, int metodo) {
        String str;
        ArrayList< Usuario > vet = new ArrayList< Usuario >();

        if (metodo == 1) {
            str = "SELECT * FROM Usuario WHERE login =" + pBusca + ";";
        } else if (metodo == 2) {
            str = "SELECT * FROM Usuario WHERE cargo =" + pBusca + ";";
        } else {
            str = "SELECT * FROM Usuario;";
        }
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

    public void Excluir_usuario(String pLogin) {
        String str = "DELETE FROM Usuario WHERE login = '"+pLogin+"';";
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);
            psmt.executeUpdate(str);
        } catch (SQLException excep) {
            excep.printStackTrace();
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
