package com.vcd.controller;

import com.vcd.dto.Result;
import com.vcd.entity.Sell;
import com.vcd.service.SellService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Sell)表控制层
 */
@RestController
@RequestMapping("sell")
public class SellController {

    @Resource
    SellService sellService;

    @PostMapping("/buy")
    public Result buy(@RequestBody Sell sell){
        return sellService.buy(sell);
    }
}

