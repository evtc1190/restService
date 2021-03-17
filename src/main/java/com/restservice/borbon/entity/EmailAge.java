package com.restservice.borbon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class EmailAge implements Serializable {

    @Id
    @Column(name="s_emailId")
    private String email;

    @Column(name="s_fraudrisk")
    private String fraudRisk;

    @Column(name="s_sourceindustry")
    private String sourceIndustry;

    @Column(name="s_fraudtype")
    private String fraudType;

    @Column(name= "s_firstVerificationDate")
    private String firstVerificationDate;

    @Column(name= "s_lastVerificationDate")
    private String lastVerificationDate;

    @Column(name="s_score")
    private String score;

    public EmailAge(String email, String fraudRisk, String sourceIndustry, String fraudtype, String firstVerificationDate, String lastVerificationDate, String score) {
        this.email = email;
        this.fraudRisk = fraudRisk;
        this.sourceIndustry = sourceIndustry;
        this.fraudType = fraudtype;
        this.firstVerificationDate = firstVerificationDate;
        this.lastVerificationDate = lastVerificationDate;
        this.score = score;
    }

    public EmailAge(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailId) {
        this.email = emailId;
    }

    public String getFraudRisk() {
        return fraudRisk;
    }

    public void setFraudRisk(String fraudRisk) {
        this.fraudRisk = fraudRisk;
    }

    public String getFirstVerificationDate() {
        return firstVerificationDate;
    }

    public void setFirstVerificationDate(String firstVerificationDate) {
        this.firstVerificationDate = firstVerificationDate;
    }

    public String getlastVerificationDate() {
        return lastVerificationDate;
    }

    public void setlastVerificationDate(String lastVerificationDate) {
        lastVerificationDate = lastVerificationDate;
    }

    public String getScore() {
        return score;
    }

    public String getSourceIndustry() {
        return sourceIndustry;
    }

    public void setSourceIndustry(String sourceIndustry) {
        this.sourceIndustry = sourceIndustry;
    }

    public String getFraudType() {
        return fraudType;
    }

    public void setFraudType(String fraudtype) {
        this.fraudType = fraudtype;
    }

    @Override
    public String toString() {
        return "EmailAge{" +
                "email='" + email + '\'' +
                ", fraudRisk='" + fraudRisk + '\'' +
                ", sourceIndustry='" + sourceIndustry + '\'' +
                ", fraudtype='" + fraudType + '\'' +
                ", firstVerificationDate='" + firstVerificationDate + '\'' +
                ", LastVerificationDate='" + lastVerificationDate + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    public void setScore(String score) {
        this.score = score;
    }
}
