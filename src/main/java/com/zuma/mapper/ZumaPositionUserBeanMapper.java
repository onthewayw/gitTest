package com.zuma.mapper;

import com.zuma.entity.ZumaPositionBean;
import com.zuma.entity.ZumaPositionUserBean;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ZumaPositionUserBeanMapper {
    @Delete({
        "delete from zuma_position_user",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fId);

    @Insert({
        "insert into zuma_position_user (f_id, f_position_id, ",
        "f_user_id, f_state, ",
        "f_create_id, f_create_type, ",
        "f_create_time, f_update_id, ",
        "f_update_type, f_update_time)",
        "values (#{fId,jdbcType=VARCHAR}, #{fPositionId,jdbcType=VARCHAR}, ",
        "#{fUserId,jdbcType=VARCHAR}, #{fState,jdbcType=INTEGER}, ",
        "#{fCreateId,jdbcType=VARCHAR}, #{fCreateType,jdbcType=INTEGER}, ",
        "#{fCreateTime,jdbcType=TIMESTAMP}, #{fUpdateId,jdbcType=VARCHAR}, ",
        "#{fUpdateType,jdbcType=INTEGER}, #{fUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(ZumaPositionUserBean record);

    int insertSelective(ZumaPositionUserBean record);

    @Select({
        "select",
        "f_id, f_position_id, f_user_id, f_state, f_create_id, f_create_type, f_create_time, ",
        "f_update_id, f_update_type, f_update_time",
        "from zuma_position_user",
        "where f_id = #{fId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ZumaPositionUserBean selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(ZumaPositionUserBean record);

    @Update({
        "update zuma_position_user",
        "set f_position_id = #{fPositionId,jdbcType=VARCHAR},",
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
    int updateByPrimaryKey(ZumaPositionUserBean record);

    
    //根据传入参数查询总条数
	public int findCountByConditions(ZumaPositionUserBean positionUserBean);
	//根据传入参数查询数据集
	public List<ZumaPositionUserBean> findPageByConditions(ZumaPositionUserBean positionUserBean);
	//根据传入参数查询
	public List<ZumaPositionUserBean> findListByConditions(ZumaPositionUserBean positionUserBean);
	//新增
	public void add(ZumaPositionUserBean positionUserBean);
	//修改
	public void modify(ZumaPositionUserBean positionUserBean);
	//根据物理主键查询
	public ZumaPositionUserBean findById(String fId);
	//删除
	public void deleteByPrimary(String fId);
}