package com.vcd.dao;


import com.vcd.entity.View;
import com.vcd.entity.Vcd;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * (Vcd)表数据库访问层
 */
@Mapper
public interface VcdDao {

    @Select("select * from VCD limit #{begin},#{size}")
    List<Vcd> selectByPage(@Param("begin") int begin,@Param("size") int size);


    @Update("update VCD set amount = amount - #{amount}")
    void subtract(@Param("amount")Integer amount);

    @Update("update VCD set amount = amount + #{amount}")
    void add(@Param("amount")Integer amount);

    @Select("select amount from VCD where vno = #{vno}")
    Integer selectAmount(@Param("vno")String vno);

    @Insert("insert into VCD values(null,#{vno},#{vname},#{actor},#{price},#{vtype},#{amount})")
    void insertVCD(@Param("vno")String vno,
                     @Param("vname")String vname,
                     @Param("actor")String actor,
                     @Param("price")Double price,
                     @Param("vtype") String vtype,
                     @Param("amount")Integer amount
    );

    @Select("select vtype,Hire_count,Sell_count,return_count from v_Hire_Sell")
    List<View> selectView();
}

