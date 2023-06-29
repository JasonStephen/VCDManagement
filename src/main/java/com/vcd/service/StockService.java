package com.vcd.service;


import com.vcd.dto.Result;
import com.vcd.entity.Stock;

/**
 * (Stock)表服务接口
 */
public interface StockService {
    Result storage(Stock stock);
}
