package com.vcd.service;


import com.vcd.dto.Result;
import com.vcd.entity.Sell;

/**
 * (Sell)表服务接口
 */
public interface SellService {
    Result buy(Sell sell);
}
