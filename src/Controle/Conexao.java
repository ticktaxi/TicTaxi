package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexao {
    
    public static Connection getConexao(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost/TicTaxi", "root", "" );
           return c;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco novo novo novo novo ");
           
           e.printStackTrace();
           return null;
       }
 }
    
}
