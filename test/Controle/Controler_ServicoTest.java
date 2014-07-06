/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Objetos.Servico;
import java.sql.Date;
import java.sql.Time;
import junit.framework.TestCase;

/**
 *
 * @author Guilherme Donda
 */
public class Controler_ServicoTest extends TestCase {
    
    public Controler_ServicoTest(String testName) {
        super(testName);
    }

    /**
     * Test of Cadastrar_servico method, of class Controler_Servico.
     */
    public void testCadastrar_servico() {
        System.out.println("Cadastrar_servico");
        Servico serv = new Servico(, codtaxi, null, null, codcliente, null, null, null);
        Controler_Servico instance = new Controler_Servico();
        instance.Cadastrar_servico(serv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Editar_servico method, of class Controler_Servico.
     */
    public void DISABLE_testEditar_servico() {
        System.out.println("Editar_servico");
        int cod = 0;
        String nome_resp = "";
        int codtaxi = 0;
        Date data = null;
        Time hora = null;
        int codcliente = 0;
        String edereco_inicio = "";
        String edereco_fim = "";
        String status = "";
        Controler_Servico instance = new Controler_Servico();
        instance.Editar_servico(cod, nome_resp, codtaxi, data, hora, codcliente, edereco_inicio, edereco_fim, status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
