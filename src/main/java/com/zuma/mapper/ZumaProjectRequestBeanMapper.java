package com.zuma.mapper;

import com.zuma.entity.ZumaProjectBean;
import com.zuma.entity.ZumaProjectRequestBean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ZumaProjectRequestBeanMapper {
    @Delete({
        "delete from zuma_project_request",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_project_request (f_id, f_project_id, ",
        "f_request_id, f_state, ",
        "f_create_id, f_create_type, ",
        "f_create_time, f_update_id, ",
        "f_update_type, f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fProjectId,jdbcType=VARCHAR}, ",
        "#{fRequestId,jdbcType=VARCHAR}, #{fState,jdbcType=INTEGER}, ",
        "#{fCreateId,jdbcType=VARCHAR}, #{fCreateType,jdbcType=INTEGER}, ",
        "#{fCreateTime,jdbcType=TIMESTAMP}, #{fUpdateId,jdbcType=VARCHAR}, ",
        "#{fUpdateType,jdbcType=INTEGER}, #{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaProjectRequestBean record);

    int insertSelective(ZumaProjectRequestBean record);

    @Select({
        "select",
        "f_id, f_project_id, f_request_id, f_state, f_create_id, f_create_type, f_create_time, ",
        "f_update_id, f_update_type, f_update_time",
        "from zuma_project_request",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaProjectRequestBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaProjectRequestBean record);

    @Update({
        "update zuma_project_request",
        "set f_project_id = #{fProjectId,jdbcType=VARCHAR},",
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
    int updateByPrimaryKey(ZumaProjectRequestBean record);
    
    public Integer findCountByConditions(ZumaProjectRequestBean projectRequestBean);

    public List<ZumaProjectRequestBean> findPageByConditions(ZumaProjectRequestBean projectRequestBean);

    public List<ZumaProjectRequestBean> findListByConditions(ZumaProjectRequestBean projectRequestBean);

    public ZumaProjectRequestBean findById(String fId);

    public Integer add(ZumaProjectRequestBean projectRequestBean);

    public Integer modify(ZumaProjectRequestBean projectRequestBean);

    public void delete(ZumaProjectRequestBean projectRequestBean);
}