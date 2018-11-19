package com.zuma.mapper;

import com.zuma.entity.ZumaDepartPositionBean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ZumaDepartPositionBeanMapper {
    @Delete({
        "delete from zuma_depart_position",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_depart_position (f_id, f_depart_id, ",
        "f_position_id, f_state, ",
        "f_create_id, f_create_type, ",
        "f_create_time, f_update_id, ",
        "f_update_type, f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fDepartId,jdbcType=VARCHAR}, ",
        "#{fPositionId,jdbcType=VARCHAR}, #{fState,jdbcType=INTEGER}, ",
        "#{fCreateId,jdbcType=VARCHAR}, #{fCreateType,jdbcType=INTEGER}, ",
        "#{fCreateTime,jdbcType=TIMESTAMP}, #{fUpdateId,jdbcType=VARCHAR}, ",
        "#{fUpdateType,jdbcType=INTEGER}, #{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaDepartPositionBean record);

    int insertSelective(ZumaDepartPositionBean record);

    @Select({
        "select",
        "f_id, f_depart_id, f_position_id, f_state, f_create_id, f_create_type, f_create_time, ",
        "f_update_id, f_update_type, f_update_time",
        "from zuma_depart_position",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaDepartPositionBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaDepartPositionBean record);

    @Update({
        "update zuma_depart_position",
        "set f_depart_id = #{fDepartId,jdbcType=VARCHAR},",
          "f_position_id = #{fPositionId,jdbcType=VARCHAR},",
          "f_state = #{fState,jdbcType=INTEGER},",
          "f_create_id = #{fCreateId,jdbcType=VARCHAR},",
          "f_create_type = #{fCreateType,jdbcType=INTEGER},",
          "f_create_time = #{fCreateTime,jdbcType=TIMESTAMP},",
          "f_update_id = #{fUpdateId,jdbcType=VARCHAR},",
          "f_update_type = #{fUpdateType,jdbcType=INTEGER},",
          "f_update_time = #{fUpdateTime,jdbcType=TIMESTAMP}",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ZumaDepartPositionBean record);

	public int findCountByConditions(ZumaDepartPositionBean positionBean);

	public List<ZumaDepartPositionBean> findPageByConditions(ZumaDepartPositionBean positionBean);

	public List<ZumaDepartPositionBean> findListByConditions(ZumaDepartPositionBean positionBean);

	public ZumaDepartPositionBean findById(String fId);

	public Integer add(ZumaDepartPositionBean positionBean);

	public Integer modify(ZumaDepartPositionBean positionBean);

	public void delete(ZumaDepartPositionBean positionBean);
}