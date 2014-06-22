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
public class Taxi {
    private int Cod;
    private String resp_taxi;
    private int cpf;
    private int telefone;
    private String modelo;
    private String cor;
    private String placa;

    public int getCod() {
        return Cod;
    }

    public Taxi(int Cod,String resp_taxi, int cpf, int telefone, String modelo, String cor, String placa) {
        this.Cod=Cod;
        this.resp_taxi = resp_taxi;
        this.cpf = cpf;
        this.telefone = telefone;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public Taxi(){}
    
    public String getResp_taxi() {
        return resp_taxi;
    }

    public void setResp_taxi(String resp_taxi) {
        this.resp_taxi = resp_taxi;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
    
}
