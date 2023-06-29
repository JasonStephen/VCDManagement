package com.vcd.service;

import com.vcd.dto.Result;

/**
 * (Vcd)表服务接口

 */
public interface ClientService {
    /**
     * 登录
     * @param cname
     * @param cpwd
     * @param cnum
     * @return
     */
    Result login(String cname,String cpwd,String cnum);

    /**
     * 注册
     * @param cname
     * @param cpwd
     * @param cnum
     * @return
     */
    Result register(String cname,String cpwd,String cnum);

    Result clientList(int currentPage, int size);
}
