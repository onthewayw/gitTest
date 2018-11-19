package com.zuma.mapper;

import com.zuma.entity.ZumaMenuButtonBean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ZumaMenuButtonBeanMapper {
    @Delete({
        "delete from zuma_menu_button",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_menu_button (f_id, f_menu_id, ",
        "f_button_id, f_state, ",
        "f_create_id, f_create_type, ",
        "f_create_time, f_update_id, ",
        "f_update_type, f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fMenuId,jdbcType=VARCHAR}, ",
        "#{fButtonId,jdbcType=VARCHAR}, #{fState,jdbcType=INTEGER}, ",
        "#{fCreateId,jdbcType=VARCHAR}, #{fCreateType,jdbcType=INTEGER}, ",
        "#{fCreateTime,jdbcType=TIMESTAMP}, #{fUpdateId,jdbcType=VARCHAR}, ",
        "#{fUpdateType,jdbcType=INTEGER}, #{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaMenuButtonBean record);

    int insertSelective(ZumaMenuButtonBean record);

    @Select({
        "select",
        "f_id, f_menu_id, f_button_id, f_state, f_create_id, f_create_type, f_create_time, ",
        "f_update_id, f_update_type, f_update_time",
        "from zuma_menu_button",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaMenuButtonBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaMenuButtonBean record);

    @Update({
        "update zuma_menu_button",
        "set f_menu_id = #{fMenuId,jdbcType=VARCHAR},",
          "f_button_id = #{fButtonId,jdbcType=VARCHAR},",
          "f_state = #{fState,jdbcType=INTEGER},",
          "f_create_id = #{fCreateId,jdbcType=VARCHAR},",
          "f_create_type = #{fCreateType,jdbcType=INTEGER},",
          "f_create_time = #{fCreateTime,jdbcType=TIMESTAMP},",
          "f_update_id = #{fUpdateId,jdbcType=VARCHAR},",
          "f_update_type = #{fUpdateType,jdbcType=INTEGER},",
          "f_update_time = #{fUpdateTime,jdbcType=TIMESTAMP}",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ZumaMenuButtonBean record);
    
    public int findCountByConditions(ZumaMenuButtonBean menuButtonBean);

    public List<ZumaMenuButtonBean> findPageByConditions(ZumaMenuButtonBean menuButtonBean);

    public List<ZumaMenuButtonBean> findListByConditions(ZumaMenuButtonBean menuButtonBean);

    public ZumaMenuButtonBean findById(String fId);

    public Integer add(ZumaMenuButtonBean menuButtonBean);

    public Integer modify(ZumaMenuButtonBean menuButtonBean);

    public void delete(ZumaMenuButtonBean menuButtonBean);
}