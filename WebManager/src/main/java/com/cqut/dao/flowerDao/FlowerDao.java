package com.cqut.dao.flowerDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.flower.Flower;

/**
 * Dao
 * 
 * @author xiaolingjia
 * 
 */
public interface FlowerDao {
	//select
	public Flower getByID(@Param("ID")String ID);
	public List<Flower> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")Flower flower, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")Flower flower, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteFlowerByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(Flower flower);
	public int saveFlowers(@Param("entities")Flower[] flowers);
}
