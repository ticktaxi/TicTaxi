/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Guilherme
 */
public class Servico {

    private long cod;
    private long codtaxi;
    private Date data;
    private Time hora;
    private long codcliente;
    private String edereco_inicio;
    private String edereco_fim;
    private String status;

    public Servico(long cod, long codtaxi, Date data, Time hora, long codcliente, String edereco_inicio, String edereco_fim, String status) {
        this.cod = cod;
        this.codtaxi = codtaxi;
        this.data = data;
        this.hora = hora;
        this.codcliente = codcliente;
        this.edereco_inicio = edereco_inicio;
        this.edereco_fim = edereco_fim;
        this.status = status;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public long getCodtaxi() {
        return codtaxi;
    }

    public void setCodtaxi(int codtaxi) {
        this.codtaxi = codtaxi;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public long getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public String getEdereco_inicio() {
        return edereco_inicio;
    }

    public void setEdereco_inicio(String edereco_inicio) {
        this.edereco_inicio = edereco_inicio;
    }

    public String getEdereco_fim() {
        return edereco_fim;
    }

    public void setEdereco_fim(String edereco_fim) {
        this.edereco_fim = edereco_fim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
