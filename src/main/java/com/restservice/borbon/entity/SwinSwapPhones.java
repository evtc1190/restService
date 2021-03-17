package com.restservice.borbon.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="T_PHONES")
public class SwinSwapPhones implements Serializable {

    @Id
    private Integer phoneId;

    private String tag;

    private String minPeriodSwap;

    private String maxPeriodSwap;

    public SwinSwapPhones(Integer phone_id, String tag, String minPeriodSwap, String maxPeriodSwap) {
        this.phoneId = phone_id;
        this.tag = tag;
        this.minPeriodSwap = minPeriodSwap;
        this.maxPeriodSwap = maxPeriodSwap;
    }

    public SwinSwapPhones(String tag, String minPeriodSwap, String maxPeriodSwap) {
        this.tag = tag;
        this.minPeriodSwap = minPeriodSwap;
        this.maxPeriodSwap = maxPeriodSwap;
    }

    public SwinSwapPhones() {

    }

    @Override
    public String toString() {
        return "SwinSwapPhones{" +
                "phoneId=" + phoneId +
                ", tag='" + tag + '\'' +
                ", minPeriodSwap='" + minPeriodSwap + '\'' +
                ", maxPeriodSwap='" + maxPeriodSwap + '\'' +
                '}';
    }

    @JsonProperty("phoneId")
    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhone_id(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getMinPeriodSwap() {
        return minPeriodSwap;
    }

    public void setMinPeriodSwap(String minPeriodSwap) {
        this.minPeriodSwap = minPeriodSwap;
    }

    public String getMaxPeriodSwap() {
        return maxPeriodSwap;
    }

    public void setMaxPeriodSwap(String maxPeriodSwap) {
        this.maxPeriodSwap = maxPeriodSwap;
    }
}
