package com.zuma.mapper;

import com.zuma.entity.ZumaProjectBean;
import com.zuma.entity.ZumaProjectMenuBean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ZumaProjectMenuBeanMapper {
    @Delete({
        "delete from zuma_project_menu",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_project_menu (f_id, f_project_id, ",
        "f_menu_id, f_state, ",
        "f_create_id, f_create_type, ",
        "f_create_time, f_update_id, ",
        "f_update_type, f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fProjectId,jdbcType=VARCHAR}, ",
        "#{fMenuId,jdbcType=VARCHAR}, #{fState,jdbcType=INTEGER}, ",
        "#{fCreateId,jdbcType=VARCHAR}, #{fCreateType,jdbcType=INTEGER}, ",
        "#{fCreateTime,jdbcType=TIMESTAMP}, #{fUpdateId,jdbcType=VARCHAR}, ",
        "#{fUpdateType,jdbcType=INTEGER}, #{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaProjectMenuBean record);

    int insertSelective(ZumaProjectMenuBean record);

    @Select({
        "select",
        "f_id, f_project_id, f_menu_id, f_state, f_create_id, f_create_type, f_create_time, ",
        "f_update_id, f_update_type, f_update_time",
        "from zuma_project_menu",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaProjectMenuBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaProjectMenuBean record);

    @Update({
        "update zuma_project_menu",
        "set f_project_id = #{fProjectId,jdbcType=VARCHAR},",
          "f_menu_id = #{fMenuId,jdbcType=VARCHAR},",
          "f_state = #{fState,jdbcType=INTEGER},",
          "f_create_id = #{fCreateId,jdbcType=VARCHAR},",
          "f_create_type = #{fCreateType,jdbcType=INTEGER},",
          "f_create_time = #{fCreateTime,jdbcType=TIMESTAMP},",
          "f_update_id = #{fUpdateId,jdbcType=VARCHAR},",
          "f_update_type = #{fUpdateType,jdbcType=INTEGER},",
          "f_update_time = #{fUpdateTime,jdbcType=TIMESTAMP}",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ZumaProjectMenuBean record);
    
    public Integer findCountByConditions(ZumaProjectMenuBean projectMenuBean);

    public List<ZumaProjectMenuBean> findPageByConditions(ZumaProjectMenuBean projectMenuBean);

    public List<ZumaProjectMenuBean> findListByConditions(ZumaProjectMenuBean projectMenuBean);

    public ZumaProjectMenuBean findById(String fId);

    public Integer add(ZumaProjectMenuBean projectMenuBean);

    public Integer modify(ZumaProjectMenuBean projectMenuBean);

    public void delete(ZumaProjectMenuBean projectMenuBean);
}