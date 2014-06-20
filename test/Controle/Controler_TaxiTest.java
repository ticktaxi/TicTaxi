/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Objetos.Taxi;
import junit.framework.TestCase;

/**
 *
 * @author Guilherme Donda
 */
public class Controler_TaxiTest extends TestCase {
    
    public Controler_TaxiTest(String testName) {
        super(testName);
    }

    /**
     * Test of Cadastrar_taxi method, of class Controler_Taxi.
     */
    public void testCadastrar_taxi() {
        int resp;
        System.out.println("Cadastrar_taxi");
        Taxi newTaxi  = new Taxi(0, "Paulo23", 98175, 3515, "Gol42", "Verde", "BQO-5843");
        Controler_Taxi instance = new Controler_Taxi();
        resp = instance.Cadastrar_taxi(newTaxi);
        assertEquals(1, resp);
    }

    /**
     * Test of Excluir_taxi method, of class Controler_Taxi.
     */
    public void testExcluir_taxi() {
        System.out.println("Excluir_taxi");
        Controler_Taxi instance = new Controler_Taxi();
        int cod = 19;
        int resp = instance.Excluir_taxi(cod);
        assertEquals(1, resp);
    }

    /**
     * Test of Editar_taxi method, of class Controler_Taxi.
     */
    public void DISABLE_testEditar_taxi() {
        System.out.println("Editar_taxi");
        int cod = 0;
        String resp_taxi = "";
        int cpf = 0;
        int telefone = 0;
        String modelo = "";
        String cor = "";
        String placa = "";
        Controler_Taxi instance = new Controler_Taxi();
        instance.Editar_taxi(cod, resp_taxi, cpf, telefone, modelo, cor, placa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
