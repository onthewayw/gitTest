package com.zuma.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zuma.entity.ZumaPermissionProjectBean;

public interface ZumaPermissionProjectBeanMapper {
    @Delete({
        "delete from zuma_permission_project_menu",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    public int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_permission_project_menu (f_id, f_permission_id, ",
        "f_project_id, f_menu_id, ",
        "f_state, f_create_id, ",
        "f_create_type, f_create_time, ",
        "f_update_id, f_update_type, ",
        "f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fPermissionId,jdbcType=VARCHAR}, ",
        "#{fProjectId,jdbcType=VARCHAR}, #{fMenuId,jdbcType=VARCHAR}, ",
        "#{fState,jdbcType=INTEGER}, #{fCreateId,jdbcType=VARCHAR}, ",
        "#{fCreateType,jdbcType=INTEGER}, #{fCreateTime,jdbcType=TIMESTAMP}, ",
        "#{fUpdateId,jdbcType=VARCHAR}, #{fUpdateType,jdbcType=INTEGER}, ",
        "#{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    public int insert(ZumaPermissionProjectBean record);

    public int insertSelective(ZumaPermissionProjectBean record);

    @Select({
        "select",
        "f_id, f_permission_id, f_project_id, f_menu_id, f_state, f_create_id, f_create_type, ",
        "f_create_time, f_update_id, f_update_type, f_update_time",
        "from zuma_permission_project_menu",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    public ZumaPermissionProjectBean selectByPrimaryKey(String fId);

    public int updateByPrimaryKeySelective(ZumaPermissionProjectBean record);

    @Update({
        "update zuma_permission_project_menu",
        "set f_permission_id = #{fPermissionId,jdbcType=VARCHAR},",
          "f_project_id = #{fProjectId,jdbcType=VARCHAR},",
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
    public int updateByPrimaryKey(ZumaPermissionProjectBean record);
    
    
    
    //删除
	public void deleteByPrimary(String fId);
	//根据物理主键查询
	public ZumaPermissionProjectBean findById(String fId);
	//修改
	public void modify(ZumaPermissionProjectBean permissionProjectBean);
	//新增
	public void add(ZumaPermissionProjectBean permissionProjectBean);
	//根据传入参数查询
	public List<ZumaPermissionProjectBean> findListByConditions(ZumaPermissionProjectBean permissionProjectBean);
	//根据传入参数查询总条数
	public int findCountByConditions(ZumaPermissionProjectBean permissionProjectBean);
	//根据传入参数查询数据集
	public List<ZumaPermissionProjectBean> findPageByConditions(ZumaPermissionProjectBean permissionProjectBean);
    
    
    
}