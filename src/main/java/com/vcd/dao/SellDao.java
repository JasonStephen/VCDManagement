package com.vcd.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;

/**
 * (Sell)表数据库访问层
 */
@Mapper
public interface SellDao {

    @Insert("insert into Sell values(null,#{vno},#{cno},#{samount},#{stime},#{sprice})")
    void InsertOrder(@Param("vno")String vno,
                     @Param("cno")String cno,
                     @Param("samount")Integer samount,
                     @Param("stime")Date stime,
                     @Param("sprice") Double sprice
    );
}

