package com.vcd.service.impl;

import com.vcd.dao.ClientDao;
import com.vcd.dto.Result;
import com.vcd.entity.Client;
import com.vcd.service.ClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Resource
    private ClientDao clientDao;

    @Override
    public Result login(String cname, String cpwd, String cnum) {
        Client client = clientDao.selectCilent(cname, cpwd, cnum);
        if (client == null) {
            return Result.fail("用户未注册");
        }

        return Result.ok(client);
    }

    @Override
    public Result register(String cname, String cpwd, String cnum) {
        Client client = clientDao.selectCnum(cnum);
        if(client!=null){
            return Result.fail("该用户已注册");
        }

        clientDao.insertCilent(cname,cpwd,cnum);
        return Result.ok("注册成功");
    }

    @Override
    public Result clientList(int currentPage, int size) {
        int begin = (currentPage-1)*size;
        List<Client> clients = clientDao.selectClients(begin, size);

        return Result.ok(clients);
    }
}
