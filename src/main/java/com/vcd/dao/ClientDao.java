package com.vcd.dao;


import com.vcd.entity.Client;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * (Client)表数据库访问层
 */
@Mapper
public interface ClientDao {

    /**
     * 登录查询
     * @param cname
     * @param cpwd
     * @param cnum
     * @return
     */
    @Select("select * from Client where cname=#{cname} and cpwd=#{cpwd} and cnum=#{cnum}")
    Client selectCilent(@Param("cname") String cname, @Param("cpwd") String cpwd,@Param("cnum")String cnum);

    /**
     * 查询手机号是否存在,注册验证
     * @param cnum
     * @return
     */
    @Select("select * from Client where cnum=#{cnum}")
    Client selectCnum(@Param("cnum") String cnum);

    /**
     * 添加注册用户
     * @param cname
     * @param cpwd
     * @param cnum
     */
    @Insert("insert into Client values(null,#{cnum},#{cpwd},#{cname},0)")
    void insertCilent(@Param("cname") String cname, @Param("cpwd") String cpwd,@Param("cnum")String cnum);

    @Select("select * from Client limit #{begin},#{size}")
    List<Client> selectClients(@Param("begin") int begin,@Param("size") int size);

}

