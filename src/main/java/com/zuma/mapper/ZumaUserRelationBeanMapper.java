package com.zuma.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zuma.entity.ZumaUserRelationBean;

public interface ZumaUserRelationBeanMapper {
    @Delete({
        "delete from zuma_user_relation",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_user_relation (f_id, f_user_id, ",
        "f_super_user_id, f_state, ",
        "f_create_id, f_create_type, ",
        "f_create_time, f_update_id, ",
        "f_update_type, f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fUserId,jdbcType=VARCHAR}, ",
        "#{fSuperUserId,jdbcType=VARCHAR}, #{fState,jdbcType=INTEGER}, ",
        "#{fCreateId,jdbcType=VARCHAR}, #{fCreateType,jdbcType=INTEGER}, ",
        "#{fCreateTime,jdbcType=TIMESTAMP}, #{fUpdateId,jdbcType=VARCHAR}, ",
        "#{fUpdateType,jdbcType=INTEGER}, #{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaUserRelationBean record);

    int insertSelective(ZumaUserRelationBean record);

    @Select({
        "select",
        "f_id, f_user_id, f_super_user_id, f_state, f_create_id, f_create_type, f_create_time, ",
        "f_update_id, f_update_type, f_update_time",
        "from zuma_user_relation",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaUserRelationBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaUserRelationBean record);

    @Update({
        "update zuma_user_relation",
        "set f_user_id = #{fUserId,jdbcType=VARCHAR},",
          "f_super_user_id = #{fSuperUserId,jdbcType=VARCHAR},",
          "f_state = #{fState,jdbcType=INTEGER},",
          "f_create_id = #{fCreateId,jdbcType=VARCHAR},",
          "f_create_type = #{fCreateType,jdbcType=INTEGER},",
          "f_create_time = #{fCreateTime,jdbcType=TIMESTAMP},",
          "f_update_id = #{fUpdateId,jdbcType=VARCHAR},",
          "f_update_type = #{fUpdateType,jdbcType=INTEGER},",
          "f_update_time = #{fUpdateTime,jdbcType=TIMESTAMP}",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ZumaUserRelationBean record);
    
    
    
    public Integer findCountByConditions(ZumaUserRelationBean record);

    public List<ZumaUserRelationBean> findPageByConditions(ZumaUserRelationBean record);

    public List<ZumaUserRelationBean> findListByConditions(ZumaUserRelationBean record);

    public ZumaUserRelationBean findById(String fId);

    public Integer add(ZumaUserRelationBean record);

    public Integer modify(ZumaUserRelationBean record);

    public void delete(ZumaUserRelationBean record);
}