/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Objetos.Cliente;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Guilherme Donda
 */
public class Controler_ClienteTest extends TestCase {
    
    public Controler_ClienteTest(String testName) {
        super(testName);
    }

    /**
     * Test of Cadastrar_Cliente method, of class Controler_Cliente.
     */
    public void testCadastrar_Cliente() {
        System.out.println("Cadastrar_Cliente");
               SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");  
        String dataNasci = "19/02/2014";
         java.util.Date dataN = null;
       try {  
            dataN = data.parse(dataNasci);  
        } catch (ParseException ex) {   
        }
        java.sql.Date datas = null;
        datas = new java.sql.Date(dataN.getTime());
        Cliente user = new Cliente(0,"Guilherme43", 92229943, 406421462, datas , "guilherme@hotmail.com");
        Controler_Cliente instance = new Controler_Cliente();
        int result = instance.Cadastrar_Cliente(user);
        assertEquals(1, result);
    }

    /**
     * Test of Visualizar_Cliente method, of class Controler_Cliente.
     */
    public void DISABLE_testVisualizar_Cliente() {
        System.out.println("Visualizar_Cliente");
        String pBusca = "";
        int metodo = 0;
        Controler_Cliente instance = new Controler_Cliente();
        ArrayList expResult = null;
        ArrayList result = instance.Visualizar_Cliente(pBusca, metodo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Excluir_Cliente method, of class Controler_Cliente.
     */
    public void testExcluir_Cliente() {
        System.out.println("Excluir_Cliente");
        int cod = 1;
        Controler_Cliente instance = new Controler_Cliente();
        int resp = instance.Excluir_Cliente(cod);
        assertEquals(1, resp);
    }

    /**
     * Test of Editar_Cliente method, of class Controler_Cliente.
     */
    public void DISABLE_testEditar_Cliente() {
        System.out.println("Editar_Cliente");
        Cliente user = null;
        Controler_Cliente instance = new Controler_Cliente();
        instance.Editar_Cliente(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
