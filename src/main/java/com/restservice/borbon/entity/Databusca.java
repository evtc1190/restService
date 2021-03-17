package com.restservice.borbon.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Databusca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDatabusca;

    private String bureau;
    private String cpf;
    private String name;
    private String birthDate;
    private String age;
    private String sign;
    private String motherName;
    private String gender;
    private String deathSuspect;
    private String statusIRS;
    private String benefitDetails;
    private String bankName;

    @OneToMany(mappedBy = "databuscaEmail")
    private List<Emails> foundEmails;

    @OneToMany(mappedBy = "databuscaPhones")
    private List<Phones> foundPhones;

    @OneToMany(mappedBy = "databuscaAddresses")
    private List<Addresses> addresses;

    @OneToMany(mappedBy = "databuscaRelatedPersons")
    private List<RelatedPersons> relatedPersons;

    private String workCompanies;
    private String partnerCompanies;

    private String vehicles;

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeathSuspect() {
        return deathSuspect;
    }

    public void setDeathSuspect(String deathSuspect) {
        this.deathSuspect = deathSuspect;
    }

    public String getStatusIRS() {
        return statusIRS;
    }

    public void setStatusIRS(String statusIRS) {
        this.statusIRS = statusIRS;
    }

    public String getBenefitDetails() {
        return benefitDetails;
    }

    public void setBenefitDetails(String benefitDetails) {
        this.benefitDetails = benefitDetails;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Emails> getFoundEmails() {
        return foundEmails;
    }

    public void setFoundEmails(List<Emails> foundEmails) {
        this.foundEmails = foundEmails;
    }

    public List<Phones> getFoundPhones() {
        return foundPhones;
    }

    public void setFoundPhones(List<Phones> foundPhones) {
        this.foundPhones = foundPhones;
    }

    public List<Addresses> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Addresses> addresses) {
        this.addresses = addresses;
    }

    public String getWorkCompanies() {
        return workCompanies;
    }

    public void setWorkCompanies(String workCompanies) {
        this.workCompanies = workCompanies;
    }

    public String getPartnerCompanies() {
        return partnerCompanies;
    }

    public void setPartnerCompanies(String partnerCompanies) {
        this.partnerCompanies = partnerCompanies;
    }

    public List<RelatedPersons> getRelatedPersons() {
        return relatedPersons;
    }

    public void setRelatedPersons(List<RelatedPersons> relatedPersons) {
        this.relatedPersons = relatedPersons;
    }

    public String getVehicles() {
        return vehicles;
    }

    public void setVehicles(String vehicles) {
        this.vehicles = vehicles;
    }

    public Databusca(String bureau, String cpf, String name, String birthDate, String age, String sign, String motherName, String gender, String deathSuspect, String statusIRS, String benefitDetails, String bankName, List<Emails> foundEmails, List<Phones> foundPhones, List<Addresses> addresses, String workCompanies, String partnerCompanies, List<RelatedPersons> relatedPersons, String vehicles) {
        this.bureau = bureau;
        this.cpf = cpf;
        this.name = name;
        this.birthDate = birthDate;
        this.age = age;
        this.sign = sign;
        this.motherName = motherName;
        this.gender = gender;
        this.deathSuspect = deathSuspect;
        this.statusIRS = statusIRS;
        this.benefitDetails = benefitDetails;
        this.bankName = bankName;
        this.foundEmails = foundEmails;
        this.foundPhones = foundPhones;
        this.addresses = addresses;
        this.workCompanies = workCompanies;
        this.partnerCompanies = partnerCompanies;
        this.relatedPersons = relatedPersons;
        this.vehicles = vehicles;
    }

    public Databusca(){}

}
