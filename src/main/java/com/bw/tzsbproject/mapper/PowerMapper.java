package com.bw.tzsbproject.mapper;

import com.bw.tzsbproject.pojo.Elev;
import com.bw.tzsbproject.pojo.Power;
import com.bw.tzsbproject.pojo.User;
import com.bw.tzsbproject.util.PageUtil;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PowerMapper {
    @Select("select * from t_user where uname=#{uname} and pwd=#{pwd}")
    User login(User user);

    @Select("select p.* from t_power p\n" +
            "\tLEFT JOIN t_rp rp on rp.pwid=p.id\n" +
            "\tLEFT JOIN t_role r on r.rid=rp.rid\n" +
            "\tLEFT JOIN t_ur ur on ur.rid=r.rid where ur.userid=#{userid}")
    List<Power> findPowerList(Integer userid);
    @Select("select * from t_productionunit")
    List<Elev> export();
    @Insert("insert into t_productionunit  VALUES (default,#{productionunit_id},#{productionunit_name},#{productionunit_permit},#{productionunit_address},#{contact},#{duty},#{duty_name},#{factory_upper},#{factory})")
    void importElevs(Elev elev);
   // @Select("select count(*) from t_productionunit")
    Integer getCount(@Param("product") String product, @Param("bianhao") String bianhao);

    List<Elev> findAll(@Param("pageUtil") PageUtil pageUtil, @Param("product") String product, @Param("bianhao") String bianhao);
}
