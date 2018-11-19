package com.zuma.mapper;

import com.zuma.entity.ZumaDepartBean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ZumaDepartBeanMapper {
    @Delete({
        "delete from zuma_depart",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_depart (f_id, f_code, ",
        "f_name, f_short_name, ",
        "f_address, f_tel, ",
        "f_phone, f_email, ",
        "f_state, f_create_id, ",
        "f_create_type, f_create_time, ",
        "f_update_id, f_update_type, ",
        "f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fCode,jdbcType=VARCHAR}, ",
        "#{fName,jdbcType=VARCHAR}, #{fShortName,jdbcType=VARCHAR}, ",
        "#{fAddress,jdbcType=VARCHAR}, #{fTel,jdbcType=VARCHAR}, ",
        "#{fPhone,jdbcType=VARCHAR}, #{fEmail,jdbcType=VARCHAR}, ",
        "#{fState,jdbcType=INTEGER}, #{fCreateId,jdbcType=VARCHAR}, ",
        "#{fCreateType,jdbcType=INTEGER}, #{fCreateTime,jdbcType=TIMESTAMP}, ",
        "#{fUpdateId,jdbcType=VARCHAR}, #{fUpdateType,jdbcType=INTEGER}, ",
        "#{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaDepartBean record);

    int insertSelective(ZumaDepartBean record);

    @Select({
        "select",
        "f_id, f_code, f_name, f_short_name, f_address, f_tel, f_phone, f_email, f_state, ",
        "f_create_id, f_create_type, f_create_time, f_update_id, f_update_type, f_update_time",
        "from zuma_depart",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaDepartBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaDepartBean record);

    @Update({
        "update zuma_depart",
        "set f_code = #{fCode,jdbcType=VARCHAR},",
          "f_name = #{fName,jdbcType=VARCHAR},",
          "f_short_name = #{fShortName,jdbcType=VARCHAR},",
          "f_address = #{fAddress,jdbcType=VARCHAR},",
          "f_tel = #{fTel,jdbcType=VARCHAR},",
          "f_phone = #{fPhone,jdbcType=VARCHAR},",
          "f_email = #{fEmail,jdbcType=VARCHAR},",
          "f_state = #{fState,jdbcType=INTEGER},",
          "f_create_id = #{fCreateId,jdbcType=VARCHAR},",
          "f_create_type = #{fCreateType,jdbcType=INTEGER},",
          "f_create_time = #{fCreateTime,jdbcType=TIMESTAMP},",
          "f_update_id = #{fUpdateId,jdbcType=VARCHAR},",
          "f_update_type = #{fUpdateType,jdbcType=INTEGER},",
          "f_update_time = #{fUpdateTime,jdbcType=TIMESTAMP}",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ZumaDepartBean record);

	public int findCountByConditions(ZumaDepartBean departBean);

	public List<ZumaDepartBean> findPageByConditions(ZumaDepartBean departBean);

	public List<ZumaDepartBean> findListByConditions(ZumaDepartBean departBean);

	public ZumaDepartBean findById(String fId);

	public Integer add(ZumaDepartBean departBean);

	public Integer modify(ZumaDepartBean departBean);

	public void delete(ZumaDepartBean departBean);
}