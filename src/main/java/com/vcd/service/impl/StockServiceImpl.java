package com.vcd.service.impl;


import com.vcd.dao.StockDao;
import com.vcd.dao.VcdDao;
import com.vcd.dto.Result;
import com.vcd.entity.Stock;
import com.vcd.service.StockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * (Stock)表服务实现类
 */
@Service
public class StockServiceImpl implements StockService {

    @Resource
    private StockDao stockDao;

    @Resource
    private VcdDao vcdDao;

    @Override
    public Result storage(Stock stock) {

        //记录信息
        stockDao.Insert(stock.getVno(),stock.getIntime(),stock.getInamount());

        //修改库存
        vcdDao.add(stock.getInamount());

        return Result.ok("入库成功");
    }
}
