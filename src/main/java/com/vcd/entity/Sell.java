package com.vcd.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * (Sell)实体类
 */
@Data
public class Sell implements Serializable {
//    private static final long serialVersionUID = 181477710993946782L;

    private String vno;

    private String cno;

    private Integer samount;

    private Date stime;

    private Double sprice;


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

    public Integer getSamount() {
        return samount;
    }

    public void setSamount(Integer samount) {
        this.samount = samount;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

}

