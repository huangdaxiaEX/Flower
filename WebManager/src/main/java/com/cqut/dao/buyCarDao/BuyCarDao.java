package com.cqut.dao.buyCarDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.buyCar.BuyCar;

/**
 * Dao
 * 
 * @author xiaolingjia
 * 
 */
public interface BuyCarDao {
	//select
	public BuyCar getByID(@Param("ID")String ID);
	public List<BuyCar> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")BuyCar buyCar, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")BuyCar buyCar, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteBuyCarByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(BuyCar buyCar);
	public int saveBuyCars(@Param("entities")BuyCar[] buyCars);
}
