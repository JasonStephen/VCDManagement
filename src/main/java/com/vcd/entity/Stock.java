package com.vcd.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * (Stock)实体类
 */
@Data
public class Stock implements Serializable {
//    private static final long serialVersionUID = 579814615479376262L;

    private String vno;

    private Date intime;

    private Integer inamount;


    public String getVno() {
        return vno;
    }

    public void setVno(String vno) {
        this.vno = vno;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Integer getInamount() {
        return inamount;
    }

    public void setInamount(Integer inamount) {
        this.inamount = inamount;
    }

}

