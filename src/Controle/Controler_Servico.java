package Controle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import Objetos.Servico;
import java.sql.Statement;

public class Controler_Servico {

    private Connection conexao;
    private Statement psmt;

    public void Cadastrar_servico(Servico user) {
        String str = "INSERT INTO Servico(cod, codT, data, hora, codC, endereco_inicio, endereco_fim, status) VALUES (0," + user.getCod()+ ", "+ user.getCodtaxi()+ ", '" + user.getData() +"', '" + user.getHora()+"', " + user.getCodcliente()+", '" + user.getEdereco_inicio()+"', '" + user.getEdereco_fim()+"', '" + user.getStatus()+ "');";
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);
            psmt.executeUpdate(str);
        } catch (SQLException excep) {
            excep.printStackTrace();
        }
    }

   /* public Vector Visualizar_servico(String pBusca, int metodo) {
        String str;
        Vector vet = new Vector();

        if (metodo == 1) {
            str = "SELECT * FROM Servico, Taxi WHERE Servico.codT = Taxi.cod and nome_responsavel = " + pBusca + ";";
        } else if (metodo == 2) {
            str = "SELECT * FROM Servico, Taxi WHERE Servico.codT = Taxi.cod and placa = " + pBusca + ";";
        } else if (metodo == 3) {
            str = "SELECT * FROM Servico, Cliente WHERE Servico.codC = Cliente.cod and nome = " + pBusca + ";";
        } else if (metodo == 4) {
            str = "SELECT * FROM Servico WHERE status =" + pBusca + ";";
        }else {
            str = "SELECT * FROM Servico;";
        }
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                vet.add(new Servico(rs.getInt("cod"),rs.getInt("codT"), rs.getDate("data"), rs.getTime("hora"), rs.getInt("codC"), rs.getString("endereco_inicio"), rs.getString("endereco_fim"), rs.getString("status")));
            }
            return vet;

        } catch (SQLException excep) {
            excep.printStackTrace();
            return null;
        }
    }*/

 
    public void Editar_servico(int cod, String nome_resp, int codtaxi, Date data, Time hora, int codcliente, String edereco_inicio, String edereco_fim, String status) {
        String str = "UPDATE * FROM Servico WHERE cod ="+cod+" SET codT="+codtaxi+",data="+data+",hora="+hora+",codC="+codcliente+",edereco_inicio="+edereco_inicio+",edereco_fim="+edereco_fim+",status="+status+";";
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);

        } catch (SQLException excep) {
            excep.printStackTrace();
        }

    }    
    

}
