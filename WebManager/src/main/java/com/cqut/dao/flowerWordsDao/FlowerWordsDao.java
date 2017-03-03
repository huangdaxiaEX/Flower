package com.cqut.dao.flowerWordsDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.flowerWords.FlowerWords;

/**
 * Dao
 * 
 * @author xiaolingjia
 * 
 */
public interface FlowerWordsDao {
	//select
	public FlowerWords getByID(@Param("ID")String ID);
	public List<FlowerWords> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")FlowerWords flowerWords, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")FlowerWords flowerWords, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteFlowerWordsByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(FlowerWords flowerWords);
	public int saveFlowerWordss(@Param("entities")FlowerWords[] flowerWordss);
}
