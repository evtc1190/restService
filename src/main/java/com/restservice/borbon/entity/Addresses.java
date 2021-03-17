package com.restservice.borbon.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Addresses implements Serializable {

    private String lieOne;
    private String district;
    private String city;
    private String state;
    private String zipCode;
    private String homeNumber;
    private String complement;
    private String street;

    @ManyToOne
    @JoinColumn(name="idDatabusca")
    private Databusca databuscaAddresses;

    public String getLieOne() {
        return lieOne;
    }

    public void setLieOne(String lieOne) {
        this.lieOne = lieOne;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Addresses(String lieOne, String district, String city, String state, String zipCode, String homeNumber, String complement, String street) {
        this.lieOne = lieOne;
        this.district = district;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.homeNumber = homeNumber;
        this.complement = complement;
        this.street = street;
    }
    public Addresses(){}
}
