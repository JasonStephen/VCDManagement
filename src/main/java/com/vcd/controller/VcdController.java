package com.vcd.controller;


import com.vcd.dto.Pagination;
import com.vcd.dto.Result;
import com.vcd.service.VcdService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Vcd)表控制层
 */
@RestController
@RequestMapping("vcd")
public class VcdController {
    /**
     * 服务对象
     */
    @Resource
    private VcdService vcdService;

    @PostMapping("/vcdlist")
    public Result VcdList(@RequestBody Pagination pagination){
        return vcdService.selectByPage(pagination.getCurrentPage(),pagination.getSize());
    }

    @GetMapping("/vcdview")
    public Result VcdView(){
        return vcdService.selectView();
    }

}

