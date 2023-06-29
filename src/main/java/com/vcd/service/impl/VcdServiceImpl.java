package com.vcd.service.impl;

import com.vcd.dao.VcdDao;
import com.vcd.dto.Result;
import com.vcd.dto.ViewRes;
import com.vcd.entity.View;
import com.vcd.entity.Vcd;
import com.vcd.service.VcdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VcdServiceImpl implements VcdService {

    @Resource
    VcdDao vcdDao;

    @Override
    public Result selectByPage(int currentPage, int size) {
        int begin = (currentPage-1)*size;

        List<Vcd> vcds = vcdDao.selectByPage(begin, size);

        return Result.ok(vcds);
    }

    @Override
    public Result insertVCD(Vcd vcd) {
        vcdDao.insertVCD(vcd.getVno(),vcd.getVname(),vcd.getActor(),vcd.getPrice(),vcd.getVtype(),vcd.getAmount());
        return Result.ok("添加成功");
    }

    @Override
    public Result selectView() {
        List<View> views = vcdDao.selectView();

        ViewRes viewRes = new ViewRes();
        String[] vtypes = new String[5];
        Integer[] rents = new Integer[5];
        Integer[] sells = new Integer[5];
        Integer[] repaids = new Integer[5];

        for(int i = 0;i<views.size();i++){
            vtypes[i] = views.get(i).getVtype();
            rents[i] = views.get(i).getHireCount()!=null?views.get(i).getHireCount():0;
            sells[i] = views.get(i).getSellCount()!=null?views.get(i).getSellCount():0;
            repaids[i] = views.get(i).getReturnCount()!=null?views.get(i).getReturnCount():0;
        }

        viewRes.setVtypes(vtypes);
        viewRes.setRents(rents);
        viewRes.setSells(sells);
        viewRes.setRepaids(repaids);
        return Result.ok(viewRes);
    }
}
