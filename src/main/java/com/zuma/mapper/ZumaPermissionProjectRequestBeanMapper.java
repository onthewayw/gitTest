package com.zuma.mapper;

import com.zuma.entity.ZumaPermissionProjectBean;
import com.zuma.entity.ZumaPermissionProjectRequestBean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ZumaPermissionProjectRequestBeanMapper {
    @Delete({
        "delete from zuma_permission_project_request",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_permission_project_request (f_id, f_permission_id, ",
        "f_project_id, f_request_id, ",
        "f_state, f_create_id, ",
        "f_create_type, f_create_time, ",
        "f_update_id, f_update_type, ",
        "f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fPermissionId,jdbcType=VARCHAR}, ",
        "#{fProjectId,jdbcType=VARCHAR}, #{fRequestId,jdbcType=VARCHAR}, ",
        "#{fState,jdbcType=INTEGER}, #{fCreateId,jdbcType=VARCHAR}, ",
        "#{fCreateType,jdbcType=INTEGER}, #{fCreateTime,jdbcType=TIMESTAMP}, ",
        "#{fUpdateId,jdbcType=VARCHAR}, #{fUpdateType,jdbcType=INTEGER}, ",
        "#{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaPermissionProjectRequestBean record);

    int insertSelective(ZumaPermissionProjectRequestBean record);

    @Select({
        "select",
        "f_id, f_permission_id, f_project_id, f_request_id, f_state, f_create_id, f_create_type, ",
        "f_create_time, f_update_id, f_update_type, f_update_time",
        "from zuma_permission_project_request",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaPermissionProjectRequestBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaPermissionProjectRequestBean record);

    @Update({
        "update zuma_permission_project_request",
        "set f_permission_id = #{fPermissionId,jdbcType=VARCHAR},",
          "f_project_id = #{fProjectId,jdbcType=VARCHAR},",
          "f_request_id = #{fRequestId,jdbcType=VARCHAR},",
          "f_state = #{fState,jdbcType=INTEGER},",
          "f_create_id = #{fCreateId,jdbcType=VARCHAR},",
          "f_create_type = #{fCreateType,jdbcType=INTEGER},",
          "f_create_time = #{fCreateTime,jdbcType=TIMESTAMP},",
          "f_update_id = #{fUpdateId,jdbcType=VARCHAR},",
          "f_update_type = #{fUpdateType,jdbcType=INTEGER},",
          "f_update_time = #{fUpdateTime,jdbcType=TIMESTAMP}",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ZumaPermissionProjectRequestBean record);

	
    //根据传入参数查询总条数
    public int findCountByConditions(ZumaPermissionProjectRequestBean projectRequestBean);
	//根据传入参数查询数据集
    public List<ZumaPermissionProjectRequestBean> findPageByConditions(ZumaPermissionProjectRequestBean projectRequestBean);
    //根据传入参数查询
    public List<ZumaPermissionProjectRequestBean> findListByConditions(ZumaPermissionProjectRequestBean projectRequestBean);
    //新增
    public void add(ZumaPermissionProjectRequestBean projectRequestBean);
    //修改
    public void modify(ZumaPermissionProjectRequestBean projectRequestBean);
    //根据物理主键查询
    public ZumaPermissionProjectRequestBean findById(String fId);
    //删除
    public void deleteByPrimary(String fId);
}