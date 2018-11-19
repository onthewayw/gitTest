package com.zuma.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zuma.entity.ZumaPermissionMenuButtonBean;

public interface ZumaPermissionMenuButtonBeanMapper {
    @Delete({
        "delete from zuma_permission_menu_button",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_permission_menu_button (f_id, f_permission_id, ",
        "f_menu_id, f_button_id, ",
        "f_state, f_create_id, ",
        "f_create_type, f_create_time, ",
        "f_update_id, f_update_type, ",
        "f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fPermissionId,jdbcType=VARCHAR}, ",
        "#{fMenuId,jdbcType=VARCHAR}, #{fButtonId,jdbcType=VARCHAR}, ",
        "#{fState,jdbcType=INTEGER}, #{fCreateId,jdbcType=VARCHAR}, ",
        "#{fCreateType,jdbcType=INTEGER}, #{fCreateTime,jdbcType=TIMESTAMP}, ",
        "#{fUpdateId,jdbcType=VARCHAR}, #{fUpdateType,jdbcType=INTEGER}, ",
        "#{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaPermissionMenuButtonBean record);

    int insertSelective(ZumaPermissionMenuButtonBean record);

    @Select({
        "select",
        "f_id, f_permission_id, f_menu_id, f_button_id, f_state, f_create_id, f_create_type, ",
        "f_create_time, f_update_id, f_update_type, f_update_time",
        "from zuma_permission_menu_button",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaPermissionMenuButtonBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaPermissionMenuButtonBean record);

    @Update({
        "update zuma_permission_menu_button",
        "set f_permission_id = #{fPermissionId,jdbcType=VARCHAR},",
          "f_menu_id = #{fMenuId,jdbcType=VARCHAR},",
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
    int updateByPrimaryKey(ZumaPermissionMenuButtonBean record);
    
    public int findCountByConditions(ZumaPermissionMenuButtonBean permissionMenuBean);

    public List<ZumaPermissionMenuButtonBean> findPageByConditions(ZumaPermissionMenuButtonBean permissionMenuBean);

    public List<ZumaPermissionMenuButtonBean> findListByConditions(ZumaPermissionMenuButtonBean permissionMenuBean);

    public ZumaPermissionMenuButtonBean findById(String fId);

    public Integer add(ZumaPermissionMenuButtonBean permissionMenuBean);

    public Integer modify(ZumaPermissionMenuButtonBean permissionMenuBean);

    public void delete(ZumaPermissionMenuButtonBean permissionMenuBean);
}