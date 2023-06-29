package com.vcd.dto;

import lombok.Data;

@Data
public class LoginForm {
    //手机号
    private String cnum;

    //密码
    private String cpwd;

    //用户名
    private String cname;

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    public String getCpwd() {
        return cpwd;
    }

    public void setCpwd(String cpwd) {
        this.cpwd = cpwd;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
