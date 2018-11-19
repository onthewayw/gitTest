package com.zuma.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zuma.entity.ZumaMenuBean;

public interface ZumaMenuBeanMapper {
    @Delete({
        "delete from zuma_menu",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_menu (f_id, f_code, ",
        "f_name, f_state, f_create_id, ",
        "f_create_type, f_create_time, ",
        "f_update_id, f_update_type, ",
        "f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fCode,jdbcType=VARCHAR}, ",
        "#{fName,jdbcType=VARCHAR}, #{fState,jdbcType=INTEGER}, #{fCreateId,jdbcType=VARCHAR}, ",
        "#{fCreateType,jdbcType=INTEGER}, #{fCreateTime,jdbcType=TIMESTAMP}, ",
        "#{fUpdateId,jdbcType=VARCHAR}, #{fUpdateType,jdbcType=INTEGER}, ",
        "#{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaMenuBean record);

    int insertSelective(ZumaMenuBean record);

    @Select({
        "select",
        "f_id, f_code, f_name, f_state, f_create_id, f_create_type, f_create_time, f_update_id, ",
        "f_update_type, f_update_time",
        "from zuma_menu",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaMenuBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaMenuBean record);

    @Update({
        "update zuma_menu",
        "set f_code = #{fCode,jdbcType=VARCHAR},",
          "f_name = #{fName,jdbcType=VARCHAR},",
          "f_state = #{fState,jdbcType=INTEGER},",
          "f_create_id = #{fCreateId,jdbcType=VARCHAR},",
          "f_create_type = #{fCreateType,jdbcType=INTEGER},",
          "f_create_time = #{fCreateTime,jdbcType=TIMESTAMP},",
          "f_update_id = #{fUpdateId,jdbcType=VARCHAR},",
          "f_update_type = #{fUpdateType,jdbcType=INTEGER},",
          "f_update_time = #{fUpdateTime,jdbcType=TIMESTAMP}",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ZumaMenuBean record);
    
    public int findCountByConditions(ZumaMenuBean menuBean);

    public List<ZumaMenuBean> findPageByConditions(ZumaMenuBean menuBean);

    public List<ZumaMenuBean> findListByConditions(ZumaMenuBean menuBean);

    public ZumaMenuBean findById(String fId);

    public Integer add(ZumaMenuBean menuBean);

    public Integer modify(ZumaMenuBean menuBean);

    public void delete(ZumaMenuBean menuBean);
    
    
}