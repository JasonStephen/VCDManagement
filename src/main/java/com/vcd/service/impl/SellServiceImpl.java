package com.vcd.service.impl;


import com.vcd.dao.SellDao;
import com.vcd.dao.VcdDao;
import com.vcd.dto.Result;
import com.vcd.entity.Sell;
import com.vcd.service.SellService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * (Sell)表服务实现类
 */
@Service
public class SellServiceImpl implements SellService {

    @Resource
    private SellDao sellDao;

    @Resource
    VcdDao vcdDao;

    @Override
    public Result buy(Sell sell) {

        Integer samount = sell.getSamount();


        Integer amount = vcdDao.selectAmount(sell.getVno());

        if(amount == null){
            return Result.fail("此物品不存在");
        }

        if(amount<samount){
            return Result.fail("库存不足");
        }

        sellDao.InsertOrder(sell.getVno(),sell.getCno(),sell.getSamount(),sell.getStime(),sell.getSprice());

        //原本是逻辑代替触发器
        //vcdDao.subtract(samount);

        return Result.ok("购买成功");
    }
}
