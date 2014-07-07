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
    private long Cod;
    private String resp_taxi;
    private String cpf;
    private long telefone;
    private String modelo;
    private String cor;
    private String placa;

    public long getCod() {
        return Cod;
    }

    public Taxi(long Cod,String resp_taxi, String cpf, long telefone, String modelo, String cor, String placa) {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
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
