package com.restservice.borbon.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Emails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAutoIncrement;

    @ManyToOne
    @JoinColumn(name="idDatabusca")
    private Databusca databuscaEmail;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdAutoIncrement() {
        return idAutoIncrement;
    }

    public void setIdAutoIncrement(int idAutoIncrement) {
        this.idAutoIncrement = idAutoIncrement;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Emails(int idAutoIncrement, String cpf, String email) {
        this.idAutoIncrement = idAutoIncrement;
        this.cpf = cpf;
        this.email = email;
    }

    public Emails() {
    }
}
