package com.restservice.borbon.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RelatedPersons implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersons;

    @ManyToOne
    @JoinColumn(name="idDatabusca")
    private Databusca databuscaRelatedPersons;

    private String cpfPerson;

    private String document;
    private String name;
    private String relation;
    private String deathSuspect;
    private String retired;
    private String address;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getDeathSuspect() {
        return deathSuspect;
    }

    public void setDeathSuspect(String deathSuspect) {
        this.deathSuspect = deathSuspect;
    }

    public String getRetired() {
        return retired;
    }

    public void setRetired(String retired) {
        this.retired = retired;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RelatedPersons(String document, String name, String relation, String deathSuspect, String retired, String address) {
        this.document = document;
        this.name = name;
        this.relation = relation;
        this.deathSuspect = deathSuspect;
        this.retired = retired;
        this.address = address;
    }

    public RelatedPersons(){}
}
