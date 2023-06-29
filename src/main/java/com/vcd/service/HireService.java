package com.vcd.service;


import com.vcd.dto.HireForm;
import com.vcd.dto.Result;
import com.vcd.entity.Hire;

/**
 * (Hire)表服务接口

 */
public interface HireService {

    Result rent(Hire hire);

    Result repaid(HireForm hireForm);

}
