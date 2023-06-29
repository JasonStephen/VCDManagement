package com.vcd.dao;


import org.apache.ibatis.annotations.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Date;


/**
 * (Hire)表数据库访问层
 */
@Mapper
public interface HireDao {

    @Insert("insert into Hire values(null,#{vno},#{cno},#{hprice},#{hampunt},#{htime},#{rdate},#{vstate})")
    void insertOrder(@Param("vno")String vno,
                     @Param("cno")String cno,
                     @Param("hprice")Double hprice,
                     @Param("hampunt")Integer hampunt,
                     @Param("htime")Date htime,
                     @Param("rdate")Date rdate,
                     @Param("vstate")String vstate
                     );

    @Delete("delete from Hire where vno = #{vno} and cno = #{cno}")
    void deleteOrder(@Param("vno")String vno, @Param("cno")String cno);

    @Update("update Hire set vstate = #{vstate} where vno = #{vno} and cno = #{cno}")
    void updateOrder(@Param("vno")String vno, @Param("cno")String cno,@Param("vstate")String vstate);

    @Select("select id from Hire where vno = #{vno} and cno = #{cno}")
    Integer  selectId(@Param("vno")String vno, @Param("cno")String cno,@Param("vstate")String vstate);

    @Select("select vstate from Hire where id=#{id}")
    String selectVstate(@Param("id")Integer id);

    @Select("select hamount from Hire where id = #{id}")
    Integer selectAmount(@Param("id")Integer id);

}

