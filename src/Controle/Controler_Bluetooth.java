package Controle;

import Objetos.Usuario;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controler_Bluetooth implements Runnable, SerialPortEventListener {

    private Controler_Usuario c_user;
    public String Dadoslidos;
    public int nodeBytes;
    private int baudrate;
    private int timeout;
    private CommPortIdentifier cp;
    private SerialPort porta;
    private OutputStream saida;
    private InputStream entrada;
    private Thread threadLeitura;
    private boolean IDPortaOK;
    private boolean PortaOK;
    private boolean Leitura;
    private boolean Escrita;
    private String Porta;
    protected String dado;

    private Connection conexao;
    private Statement psmt;

    public String getDado() {
        return dado;
    }

    public void setDado(String peso) {
        this.dado = peso;
    }

    public void setPorta(String p) {
        this.Porta = p;
    }

    public boolean getEscrita() {
        return Escrita;
    }

    public boolean getLeitura() {
        return Leitura;
    }

    public Controler_Bluetooth(String p, int b, int t) {
        this.Porta = p;
        this.baudrate = b;
        this.timeout = t;
    }

    public void HabilitarEscrita() {
        Escrita = true;
        Leitura = false;
    }

    public void HabilitarLeitura() {
        Escrita = false;
        Leitura = true;

    }

    //Obtem o Id da porta
    public void ObterIdDaPorta() {
        try {
            cp = CommPortIdentifier.getPortIdentifier(Porta);

            if (cp == null) {
                System.out.println("Erro na porta");
                IDPortaOK = false;
                System.exit(1);
            }
            IDPortaOK = true;
        } catch (Exception e) {
            System.out.println("Erro obtendo ID da porta:" + e);
            IDPortaOK = false;
            System.exit(1);
        }
    }

    //Abre cominicaçao da porta escolhida
    public void AbrirPorta() {
        try {
            porta = (SerialPort) cp.open("SerialComLeitura", timeout);
            PortaOK = true;
            //configurar parâmetros
            porta.setSerialPortParams(baudrate,
                    porta.DATABITS_8,
                    porta.STOPBITS_1,
                    porta.PARITY_NONE);
            porta.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
        } catch (Exception e) {
            PortaOK = false;
            System.out.println("Erro abrindo comunicação: " + e);
            System.exit(1);
        }
    }

    public void LerDados() {
        if (Escrita == false) {
            try {
                entrada = porta.getInputStream();
            } catch (Exception e) {
                System.out.println("Erro de stream: " + e);
                System.exit(1);
            }
            try {
                porta.addEventListener(this);
            } catch (Exception e) {
                System.out.println("Erro de listener: " + e);
                System.exit(1);
            }
            porta.notifyOnDataAvailable(true);
            try {
                threadLeitura = new Thread(this);
                threadLeitura.start();
                run();
            } catch (Exception e) {
                System.out.println("Erro de Thred: " + e);
            }
        }
    }

    public void EnviarUmaString(String msg) {
        if (Escrita == true) {
            try {
                saida = porta.getOutputStream();
                System.out.println("FLUXO OK!");
            } catch (Exception e) {
                System.out.println("Erro.STATUS: " + e);
            }
            try {
                System.out.println("Enviando um byte para " + Porta);
                System.out.println("Enviando : " + msg);
                saida.write(msg.getBytes());
                Thread.sleep(100);
                saida.flush();
            } catch (Exception e) {
                System.out.println("Houve um erro durante o envio. ");
                System.out.println("STATUS: " + e);
                System.exit(1);
            }
        } else {
            System.exit(1);
        }
    }

    public void run() {
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println("Erro de Thred: " + e);
        }
    }

    //Este método monitora e obtem os dados da porta
    public void serialEvent(SerialPortEvent ev) {
        StringBuffer bufferLeitura = new StringBuffer();
        int novoDado = 0;
        switch (ev.getEventType()) {
            case SerialPortEvent.BI:
            case SerialPortEvent.OE:
            case SerialPortEvent.FE:
            case SerialPortEvent.PE:
            case SerialPortEvent.CD:
            case SerialPortEvent.CTS:
            case SerialPortEvent.DSR:
            case SerialPortEvent.RI:
            case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
                break;
            case SerialPortEvent.DATA_AVAILABLE:
                //Algortimo de leitura
                while (novoDado != -1) {
                    try {
                        novoDado = entrada.read();
                        if (novoDado == -1) {
                            break;
                        }
                        if ('\r' == (char) novoDado) {
                            bufferLeitura.append('\n');
                        } else {
                            bufferLeitura.append((char) novoDado);
                        }

                    } catch (IOException ioe) {
                        System.out.println("Erro de leitura serial: " + ioe);
                    }
                }
                setDado(new String(bufferLeitura));
                recebeuDado();
                break;
        }
    }

    public boolean LogaUser(String login, String senha) {
        Usuario user = null;
        String str = ("SELECT * FROM Usuario WHERE login = '" + login + "' AND senha = '" + senha + "';");
        System.out.println(str);
        try {
            conexao = Conexao.getConexao();
            psmt = (PreparedStatement) conexao.prepareStatement(str);
            ResultSet rs = psmt.executeQuery(str);
            while (rs.next()) {
                user = new Usuario(rs.getString("login"), rs.getString("senha"), rs.getString("cargo"));
            }
            if (user != null) {
                if (user.getLogin().equals(login) && user.getSenha().equals(senha)) {
                    return (true);
                } else {
                    return (false);
                }
            }else{ return (false);}
        } catch (SQLException excep) {
            excep.printStackTrace();
            return false;
        }
    }

    //Método para os dados
    public void recebeuDado() {
        String dado = getDado();
        if (dado != null && dado.length() > 7) {
            if (dado.charAt(0) == '|' && dado.contains("&")) {
                System.out.println(dado);
                if (dado.charAt(1) == 'L') {
                    String login = dado.substring(3, dado.lastIndexOf("@"));
                    String senha = dado.substring(dado.lastIndexOf("@") + 1, dado.lastIndexOf("&"));
                    System.out.println(login + "+" + senha);
                    boolean teste = LogaUser(login, senha);
                    if (teste) {
                        HabilitarEscrita();
                        EnviarUmaString("|Logado@");
                        System.out.println("|Logado@");
                        HabilitarLeitura();
                    } else {
                        HabilitarEscrita();
                        EnviarUmaString("|ERRO@");
                        System.out.println("|ERRO@");
                        HabilitarLeitura();

                    }
                }
                if (dado.charAt(1) == 'D') {
                    if (LogaUser(Porta, Porta)) {
                        HabilitarEscrita();
                        EnviarUmaString("|Chamada aceita: Taxi placa XTZ3587, Cor Vermelho@");
                        System.out.println("|Chamada aceita@");
                        HabilitarLeitura();
                    }
                }
            } else {
                HabilitarEscrita();
                EnviarUmaString("|teste@");
                System.out.println("|teste@");
                HabilitarLeitura();

            }
        }
    }

    //Metodo para fechar a porta COMq
    public void FecharCom() {
        try {
            porta.close();
            System.out.println("Porta " + this.Porta + " fechada");
        } catch (Exception e) {
            System.out.println("Erro fechando porta: " + e);
            System.exit(0);
        }
    }

    public String obterPorta() {
        return Porta;
    }

    public int obterBaudrate() {
        return baudrate;
    }
}
