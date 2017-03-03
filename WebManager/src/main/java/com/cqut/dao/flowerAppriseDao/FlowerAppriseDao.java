package com.cqut.dao.flowerAppriseDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.flowerApprise.FlowerApprise;

/**
 * Dao
 * 
 * @author xiaolingjia
 * 
 */
public interface FlowerAppriseDao {
	//select
	public FlowerApprise getByID(@Param("ID")String ID);
	public List<FlowerApprise> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")FlowerApprise flowerApprise, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")FlowerApprise flowerApprise, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteFlowerAppriseByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(FlowerApprise flowerApprise);
	public int saveFlowerApprises(@Param("entities")FlowerApprise[] flowerApprises);
}
