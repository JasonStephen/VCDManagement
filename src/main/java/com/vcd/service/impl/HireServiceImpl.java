package com.vcd.service.impl;


import com.vcd.dao.HireDao;
import com.vcd.dao.VcdDao;
import com.vcd.dto.HireForm;
import com.vcd.dto.Repaid;
import com.vcd.dto.Result;
import com.vcd.entity.Hire;

import com.vcd.service.HireService;

import org.springframework.stereotype.Service;

import java.sql.Date;
import javax.annotation.Resource;


/**
 * (Hire)表服务实现类
 */
@Service
public class HireServiceImpl implements HireService {

    @Resource
    HireDao hireDao;

    @Resource
    VcdDao vcdDao;

    @Override
    public Result rent(Hire hire) {
        String vno = hire.getVno();
        String cno = hire.getCno();

        Integer hamount = hire.getHamount();

        Integer id = hireDao.selectId(vno, cno, "借出");


        if (id!=null) {
            return Result.fail("您尚未归还");
        }

        Integer amount = vcdDao.selectAmount(vno);

        if(amount ==null){
            return Result.fail("此物品不存在");
        }

        if(amount<hamount){
            return Result.fail("库存不足");
        }

        double hprice = hamount * 20.0;

        hireDao.insertOrder(vno, cno, hprice, hamount, hire.getHtime(), hire.getRdate(), "借出");

        //vcdDao.subtract(hamount);
        return Result.ok("租借成功");
    }

    @Override
    public Result repaid(HireForm hireForm) {
        String vno = hireForm.getVno();
        String cno = hireForm.getCno();


        Integer id = hireDao.selectId(vno, cno,"借出");
        Integer amount = hireDao.selectAmount(id);
        String vstate = hireDao.selectVstate(id);


        if (vstate == "" || vstate == null) {
            return Result.fail("您尚未借出");
        }

        if(vstate.equals("已归还")){
            return Result.fail("您已归还");
        }

        hireDao.updateOrder(vno,cno,"已归还");
        //vcdDao.add(hamount);

        Repaid repaid = new Repaid();
        repaid.setAmount(amount);
        repaid.setMessage("归还成功");

        return Result.ok(repaid);

    }
}
