/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

import java.sql.Date;

/**
 *
 * @author guilherme
 */
public class Cliente {
    private long cod;
    private String Nome;
    private long telefone;
    private long cpf;
    private Date data_nascimento;
    private String email;    

    public Cliente(long cod, String Nome, long telefone, long cpf, Date data_nascimento, String email) {
        this.cod = cod;
        this.Nome = Nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.email = email;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    
    public String getNome() {
        return Nome;
        
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
