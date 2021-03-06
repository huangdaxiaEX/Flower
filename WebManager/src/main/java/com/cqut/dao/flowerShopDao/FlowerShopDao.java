package com.cqut.dao.flowerShopDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.flowerShop.FlowerShop;

/**
 * Dao
 * 
 * @author xiaolingjia
 * 
 */
public interface FlowerShopDao {
	//select
	public FlowerShop getByID(@Param("ID")String ID);
	public List<FlowerShop> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")FlowerShop flowerShop, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")FlowerShop flowerShop, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteFlowerShopByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(FlowerShop flowerShop);
	public int saveFlowerShops(@Param("entities")FlowerShop[] flowerShops);
}
