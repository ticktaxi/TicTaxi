

package Controle;

import gnu.io.CommPortIdentifier;
import java.util.Enumeration;

public class SerialCOMq {
 
    protected String[] portas;
    protected Enumeration listaDePortas;
 
    public SerialCOMq() {
        listaDePortas = CommPortIdentifier.getPortIdentifiers();
    }
 
    public String[] ObterPortas() {
        return portas;
    }
    //Lista as portas que estão disponiveis para a comunicaçao
    protected void ListarPortas() {
        int i = 0;
        portas = new String[10];
        while (listaDePortas.hasMoreElements()) {
            CommPortIdentifier ips =
                    (CommPortIdentifier) listaDePortas.nextElement();
            portas[i] = ips.getName();
            i++;
        }
    }
    //Identifica se a porta selecionada existe e se esta funcionando
    public boolean PortaExiste(String COMp) {
        String temp;
        boolean e = false;
        while (listaDePortas.hasMoreElements()) {
            CommPortIdentifier ips = (CommPortIdentifier)listaDePortas.nextElement();
            temp = ips.getName();
            if (temp.equals(COMp) == true) {
                e = true;
            }
        }
        return e;
    }
}
