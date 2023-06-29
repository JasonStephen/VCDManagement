package com.vcd.entity;

import java.io.Serializable;

/**
 * (Vcd)实体类
 */
public class Vcd implements Serializable {
//    private static final long serialVersionUID = 409590823523710255L;

    private String vno;

    private String vname;

    private String actor;

    private Double price;

    private String vtype;

    private Integer amount;


    public String getVno() {
        return vno;
    }

    public void setVno(String vno) {
        this.vno = vno;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}

