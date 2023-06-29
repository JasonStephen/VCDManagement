package com.vcd.controller;


import com.vcd.dto.Result;
import com.vcd.entity.Stock;
import com.vcd.service.StockService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Stock)表控制层
 */
@RestController
@RequestMapping("stock")
public class StockController {
    /**
     * 服务对象
     */
    @Resource
    private StockService stockService;

    @PostMapping("/storage")
    public Result storage(@RequestBody Stock stock){
        return stockService.storage(stock);
    }

}

