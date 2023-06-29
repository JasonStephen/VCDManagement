package com.vcd.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;


/**
 * (Stock)表数据库访问层
 */
@Mapper
public interface StockDao {

    @Insert("insert into Stock values(null,#{vno},#{intime},#{inamount})")
    void Insert(@Param("vno")String vno,
                @Param("intime")Date intime,
                @Param("inamount")Integer inamount
    );

}

