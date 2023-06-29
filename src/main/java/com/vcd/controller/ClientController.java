package com.vcd.controller;


import com.vcd.dto.LoginForm;
import com.vcd.dto.Pagination;
import com.vcd.dto.Result;
import com.vcd.service.ClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Client)表控制层
 */
@RestController
@RequestMapping("client")
public class ClientController {

    @Resource
    private ClientService clientService;

    @PostMapping("/login")
    public Result login(@RequestBody LoginForm loginForm){
        return clientService.login(loginForm.getCname(),loginForm.getCpwd(),loginForm.getCnum());
    }

    @PostMapping("/register")
    public Result register(@RequestBody LoginForm loginForm){
        return clientService.register(loginForm.getCname(),loginForm.getCpwd(),loginForm.getCnum());
    }

    @PostMapping("/clientlist")
    public Result clientList(@RequestBody Pagination pagination){
        return clientService.clientList(pagination.getCurrentPage(),pagination.getSize());
    }
}

