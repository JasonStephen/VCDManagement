package com.vcd.dto;

import lombok.Data;

@Data
public class HireForm {

    //VCD编号
    private String vno;

    //客户编号
    private String cno;

//    //归还数量
//    private Integer hamount;
//
//    public Integer getHamount() {
//        return hamount;
//    }
//
//    public void setHamount(Integer hamount) {
//        this.hamount = hamount;
//    }

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
}
