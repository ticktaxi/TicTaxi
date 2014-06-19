package Controle;

import Objetos.Usuario;
import junit.framework.TestCase;

public class Controler_UsuarioTest extends TestCase {
    
    public Controler_UsuarioTest(String testName) {
        super(testName);
    }

    public void testCadastrar_usuario() {
        System.out.println("Cadastrar_usuario");
        int resp = 2;
        Usuario u = new Usuario("Leandro", "109282", "Gerente");
        Controler_Usuario instance = new Controler_Usuario();
        resp = instance.Cadastrar_usuario(u);
        assertEquals(1, resp);
    }


    /*public void DISABLE_testVisualizar_usuario() {
        System.out.println("Visualizar_usuario");
        String pBusca = "";
        int metodo = 0;
        Controler_Usuario instance = new Controler_Usuario();
        Vector expResult = null;
        Vector result = instance.Visualizar_usuario(pBusca, metodo);
        assertEquals(expResult, result);;
    }*/

    /**
     * Test of Excluir_usuario method, of class Controler_Usuario.
     */
    public void DISABLE_testExcluir_usuario() {
        System.out.println("Excluir_usuario");
        String pLogin = "";
        Controler_Usuario instance = new Controler_Usuario();
        instance.Excluir_usuario(pLogin);
    }

    /**
     * Test of Editar_usuario method, of class Controler_Usuario.
     */
    public void DISABLE_testEditar_usuario() {
        System.out.println("Editar_usuario");
        String pLogin = "";
        String pSenha = "";
        String pCargo = "";
        Controler_Usuario instance = new Controler_Usuario();
        instance.Editar_usuario(pLogin, pSenha, pCargo);
    }
}
