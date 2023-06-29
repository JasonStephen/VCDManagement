package com.vcd.service;

import com.vcd.dto.Result;
import com.vcd.entity.Vcd;

public interface VcdService {
    /**
     * 分页查询VCD信息
     * @param currentPage
     * @param size
     * @return
     */
    Result selectByPage(int currentPage,int size);

    Result insertVCD(Vcd vcd);


    Result selectView();
}
