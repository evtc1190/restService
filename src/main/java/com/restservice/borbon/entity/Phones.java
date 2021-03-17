package com.restservice.borbon.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Phones implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPhones;

    @ManyToOne
    @JoinColumn(name="idDatabusca")
    private Databusca databuscaPhones;

    private String phones;



    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public int getIdPhones() {
        return idPhones;
    }

    public void setIdPhones(int idPhones) {
        this.idPhones = idPhones;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Phones(int idPhones, String cpf, String phones) {
        this.idPhones = idPhones;
        this.cpf = cpf;
        this.phones = phones;
    }

    public Phones() {
    }
}
