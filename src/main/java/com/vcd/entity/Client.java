package com.vcd.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * (Client)实体类
 *客户

 */
public class Client implements Serializable {
//    private static final long serialVersionUID = -57480375490212002L;

    //编号
    private String cno;

    //手机号
    private String cnum;

    //密码
    private String cpwd;

    //用户名
    private String cname;

    //是否是管理员
    private int root;

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

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

