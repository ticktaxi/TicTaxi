/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author guilherme
 */
public class Usuario {

    private String Login;
    private String Senha;
    private String Cargo;

    public Usuario(String pLogin, String pSenha, String pCargo) {
        this.Cargo = pCargo;
        this.Senha = pSenha;
        this.Login = pLogin;
    }

    public String getLogin() {
        return Login;
    }

    public String getSenha() {
        return Senha;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
}
