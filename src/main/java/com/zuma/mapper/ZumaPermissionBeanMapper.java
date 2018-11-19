package com.zuma.mapper;
import com.zuma.entity.ZumaPermissionBean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ZumaPermissionBeanMapper {
    @Delete({
        "delete from zuma_permission",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_permission (f_id, f_code, ",
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
    int insert(ZumaPermissionBean record);

    int insertSelective(ZumaPermissionBean record);

    @Select({
        "select",
        "f_id, f_code, f_name, f_state, f_create_id, f_create_type, f_create_time, f_update_id, ",
        "f_update_type, f_update_time",
        "from zuma_permission",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaPermissionBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaPermissionBean record);

    @Update({
        "update zuma_permission",
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
    int updateByPrimaryKey(ZumaPermissionBean record);
    
    public int findCountByConditions(ZumaPermissionBean permissionBean);

    public List<ZumaPermissionBean> findPageByConditions(ZumaPermissionBean permissionBean);

    public List<ZumaPermissionBean> findListByConditions(ZumaPermissionBean permissionBean);

    public ZumaPermissionBean findById(String fId);

    public Integer add(ZumaPermissionBean permissionBean);

    public Integer modify(ZumaPermissionBean permissionBean);

    public void delete(ZumaPermissionBean permissionBean);
}