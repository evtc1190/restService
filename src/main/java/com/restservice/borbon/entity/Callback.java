package com.restservice.borbon.entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Callback implements Serializable {

    @Id
    @Column(name="s_order_id")
    private String S_ORDER_ID;

    @Column(name="n_mti")
    private int N_MTI;

    @Column(name="s_response_code")
    private String S_RESPONSE_CODE;

    @Column(name="n_trx_trace_status")
    private int N_TRX_TRACE_STATUS;

    public Callback(String s_order_id, int N_MTI, String S_RESPONSE_CODE, int N_TRX_TRACE_STATUS) {
        this.S_ORDER_ID = s_order_id;
        this.N_MTI = N_MTI;
        this.S_RESPONSE_CODE = S_RESPONSE_CODE;
        this.N_TRX_TRACE_STATUS = N_TRX_TRACE_STATUS;
    }

    public Callback(){}

    @Override
    public String toString() {
        return "Callback{" +
                "order_id='" + S_ORDER_ID + '\'' +
                ", mti=" + N_MTI +
                ", s_response_code='" + S_RESPONSE_CODE + '\'' +
                ", n_trx_trace_status=" + N_TRX_TRACE_STATUS +
                '}';
    }
    @JsonProperty("S_ORDER_ID")
    public String getS_ORDER_ID() {
        return S_ORDER_ID;
    }

    public void setS_ORDER_ID(String s_order_id) {
        this.S_ORDER_ID = s_order_id;
    }

    @JsonProperty("N_MTI")
    public int getN_MTI() {
        return N_MTI;
    }

    public void setN_MTI(int N_MTI) {
        this.N_MTI = N_MTI;
    }

    @JsonProperty("S_RESPONSE_CODE")
    public String getS_RESPONSE_CODE() {
        return S_RESPONSE_CODE;
    }

    public void setS_RESPONSE_CODE(String S_RESPONSE_CODE) {
        this.S_RESPONSE_CODE = S_RESPONSE_CODE;
    }

    @JsonProperty("N_TRX_TRACE_STATUS")
    public int getN_TRX_TRACE_STATUS() {
        return N_TRX_TRACE_STATUS;
    }

    public void setN_TRX_TRACE_STATUS(int N_TRX_TRACE_STATUS) {
        this.N_TRX_TRACE_STATUS = N_TRX_TRACE_STATUS;
    }
}
