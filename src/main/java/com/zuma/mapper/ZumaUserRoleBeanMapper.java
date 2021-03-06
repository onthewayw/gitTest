package com.zuma.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zuma.entity.ZumaUserRoleBean;

public interface ZumaUserRoleBeanMapper {
    @Delete({
        "delete from zuma_user_role",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_user_role (f_id, f_user_id, ",
        "f_role_id, f_state, ",
        "f_create_id, f_create_type, ",
        "f_create_time, f_update_id, ",
        "f_update_type, f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fUserId,jdbcType=VARCHAR}, ",
        "#{fRoleId,jdbcType=VARCHAR}, #{fState,jdbcType=INTEGER}, ",
        "#{fCreateId,jdbcType=VARCHAR}, #{fCreateType,jdbcType=INTEGER}, ",
        "#{fCreateTime,jdbcType=TIMESTAMP}, #{fUpdateId,jdbcType=VARCHAR}, ",
        "#{fUpdateType,jdbcType=INTEGER}, #{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaUserRoleBean record);

    int insertSelective(ZumaUserRoleBean record);

    @Select({
        "select",
        "f_id, f_user_id, f_role_id, f_state, f_create_id, f_create_type, f_create_time, ",
        "f_update_id, f_update_type, f_update_time",
        "from zuma_user_role",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaUserRoleBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaUserRoleBean record);

    @Update({
        "update zuma_user_role",
        "set f_user_id = #{fUserId,jdbcType=VARCHAR},",
          "f_role_id = #{fRoleId,jdbcType=VARCHAR},",
          "f_state = #{fState,jdbcType=INTEGER},",
          "f_create_id = #{fCreateId,jdbcType=VARCHAR},",
          "f_create_type = #{fCreateType,jdbcType=INTEGER},",
          "f_create_time = #{fCreateTime,jdbcType=TIMESTAMP},",
          "f_update_id = #{fUpdateId,jdbcType=VARCHAR},",
          "f_update_type = #{fUpdateType,jdbcType=INTEGER},",
          "f_update_time = #{fUpdateTime,jdbcType=TIMESTAMP}",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ZumaUserRoleBean record);
    
    
    
    
    public Integer findCountByConditions(ZumaUserRoleBean record);

    public List<ZumaUserRoleBean> findPageByConditions(ZumaUserRoleBean record);

    public List<ZumaUserRoleBean> findListByConditions(ZumaUserRoleBean record);

    public ZumaUserRoleBean findById(String fId);

    public Integer add(ZumaUserRoleBean record);

    public Integer modify(ZumaUserRoleBean record);

    public void delete(ZumaUserRoleBean record);
}