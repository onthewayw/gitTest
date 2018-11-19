package com.zuma.mapper;

import com.zuma.entity.ZumaDepartUserBean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ZumaDepartUserBeanMapper {
    @Delete({
        "delete from zuma_depart_user",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_depart_user (f_id, f_depart_id, ",
        "f_user_id, f_state, ",
        "f_create_id, f_create_type, ",
        "f_create_time, f_update_id, ",
        "f_update_type, f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fDepartId,jdbcType=VARCHAR}, ",
        "#{fUserId,jdbcType=VARCHAR}, #{fState,jdbcType=INTEGER}, ",
        "#{fCreateId,jdbcType=VARCHAR}, #{fCreateType,jdbcType=INTEGER}, ",
        "#{fCreateTime,jdbcType=TIMESTAMP}, #{fUpdateId,jdbcType=VARCHAR}, ",
        "#{fUpdateType,jdbcType=INTEGER}, #{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaDepartUserBean record);

    int insertSelective(ZumaDepartUserBean record);

    @Select({
        "select",
        "f_id, f_depart_id, f_user_id, f_state, f_create_id, f_create_type, f_create_time, ",
        "f_update_id, f_update_type, f_update_time",
        "from zuma_depart_user",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaDepartUserBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaDepartUserBean record);

    @Update({
        "update zuma_depart_user",
        "set f_depart_id = #{fDepartId,jdbcType=VARCHAR},",
          "f_user_id = #{fUserId,jdbcType=VARCHAR},",
          "f_state = #{fState,jdbcType=INTEGER},",
          "f_create_id = #{fCreateId,jdbcType=VARCHAR},",
          "f_create_type = #{fCreateType,jdbcType=INTEGER},",
          "f_create_time = #{fCreateTime,jdbcType=TIMESTAMP},",
          "f_update_id = #{fUpdateId,jdbcType=VARCHAR},",
          "f_update_type = #{fUpdateType,jdbcType=INTEGER},",
          "f_update_time = #{fUpdateTime,jdbcType=TIMESTAMP}",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ZumaDepartUserBean record);
    
    public int findCountByConditions(ZumaDepartUserBean userBean);

	public List<ZumaDepartUserBean> findPageByConditions(ZumaDepartUserBean userBean);

	public List<ZumaDepartUserBean> findListByConditions(ZumaDepartUserBean userBean);

	public ZumaDepartUserBean findById(String fId);

	public Integer add(ZumaDepartUserBean userBean);

	public Integer modify(ZumaDepartUserBean userBean);

	public void delete(ZumaDepartUserBean userBean);
}