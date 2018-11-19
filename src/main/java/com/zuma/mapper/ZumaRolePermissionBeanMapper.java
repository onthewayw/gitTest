package com.zuma.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zuma.entity.ZumaRolePermissionBean;

public interface ZumaRolePermissionBeanMapper {
    @Delete({
        "delete from zuma_role_permission",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_role_permission (f_id, f_role_id, ",
        "f_permission_id, f_state, ",
        "f_create_id, f_create_type, ",
        "f_create_time, f_update_id, ",
        "f_update_type, f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fRoleId,jdbcType=VARCHAR}, ",
        "#{fPermissionId,jdbcType=VARCHAR}, #{fState,jdbcType=INTEGER}, ",
        "#{fCreateId,jdbcType=VARCHAR}, #{fCreateType,jdbcType=INTEGER}, ",
        "#{fCreateTime,jdbcType=TIMESTAMP}, #{fUpdateId,jdbcType=VARCHAR}, ",
        "#{fUpdateType,jdbcType=INTEGER}, #{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaRolePermissionBean record);

    int insertSelective(ZumaRolePermissionBean record);

    @Select({
        "select",
        "f_id, f_role_id, f_permission_id, f_state, f_create_id, f_create_type, f_create_time, ",
        "f_update_id, f_update_type, f_update_time",
        "from zuma_role_permission",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaRolePermissionBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaRolePermissionBean record);

    @Update({
        "update zuma_role_permission",
        "set f_role_id = #{fRoleId,jdbcType=VARCHAR},",
          "f_permission_id = #{fPermissionId,jdbcType=VARCHAR},",
          "f_state = #{fState,jdbcType=INTEGER},",
          "f_create_id = #{fCreateId,jdbcType=VARCHAR},",
          "f_create_type = #{fCreateType,jdbcType=INTEGER},",
          "f_create_time = #{fCreateTime,jdbcType=TIMESTAMP},",
          "f_update_id = #{fUpdateId,jdbcType=VARCHAR},",
          "f_update_type = #{fUpdateType,jdbcType=INTEGER},",
          "f_update_time = #{fUpdateTime,jdbcType=TIMESTAMP}",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ZumaRolePermissionBean record);
    
    
    
    public Integer findCountByConditions(ZumaRolePermissionBean record);

    public List<ZumaRolePermissionBean> findPageByConditions(ZumaRolePermissionBean record);

    public List<ZumaRolePermissionBean> findListByConditions(ZumaRolePermissionBean record);

    public ZumaRolePermissionBean findById(String fId);

    public Integer add(ZumaRolePermissionBean record);

    public Integer modify(ZumaRolePermissionBean record);

    public void delete(ZumaRolePermissionBean record);
}