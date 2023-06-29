package com.vcd.controller;


import com.vcd.dto.HireForm;
import com.vcd.dto.Result;
import com.vcd.entity.Hire;
import com.vcd.service.HireService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * (Hire)表控制层
 */
@RestController
@RequestMapping("hire")
public class HireController {
    /**
     * 服务对象
     */
    @Resource
    private HireService hireService;

    @PostMapping("/rent")
    public Result rent(@RequestBody Hire hire){
        return hireService.rent(hire);
    }

    @PostMapping("/repaid")
    public Result repaid(@RequestBody HireForm hireForm){
        return hireService.repaid(hireForm);
    }
}

