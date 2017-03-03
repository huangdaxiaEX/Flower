package com.cqut.service.flowerWordsService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.flowerWords.FlowerWords;

/**
 * Service方法接口
 * 
 * @author xiaolingjia
 * 
 */
public interface IFlowerWordsService {

	//select
	public FlowerWords getByID(String ID);
	public List<FlowerWords> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(FlowerWords flowerWords, String ID);
	public int updateByCondition(FlowerWords flowerWords, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteFlowerWordsByIDs(String[] IDs);
	
	//save
	public int save(FlowerWords flowerWords);
	public int saveFlowerWordss(FlowerWords[] flowerWordss);
}