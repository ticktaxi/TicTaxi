package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

//http://www.embarcados.com.br/comunicacao-serial-java-arduino/
//http://tehii.wordpress.com/2011/09/23/api-rxtx-comunicacao-serial-com-java/
public class Conexao {
    
    public static Connection getConexao(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost/TicTaxi", "root", "root" );
           return c;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco");
           
           e.printStackTrace();
           return null;
       }
 }
    
}
