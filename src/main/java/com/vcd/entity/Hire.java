package com.vcd.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * (Hire)实体类
 */
@Data
public class Hire implements Serializable {
//    private static final long serialVersionUID = -64138333475378002L;

    private String vno;

    private String cno;

    private Double hprice;

    private Integer hamount;

    private Date htime;

    private Date rdate;

    private String vstate;


    public String getVno() {
        return vno;
    }

    public void setVno(String vno) {
        this.vno = vno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public Double getHprice() {
        return hprice;
    }

    public void setHprice(Double hprice) {
        this.hprice = hprice;
    }

    public Integer getHamount() {
        return hamount;
    }

    public void setHamount(Integer hamount) {
        this.hamount = hamount;
    }

    public Date getHtime() {
        return htime;
    }
    public void setHtime(Date htime) {
        this.htime = htime;
    }

    public Date getRdate() {
        return rdate;
    }
    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public String getVstate() {
        return vstate;
    }

    public void setVstate(String vstate) {
        this.vstate = vstate;
    }

}

