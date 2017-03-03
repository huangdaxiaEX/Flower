package com.cqut.service.flowerService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.flower.Flower;

/**
 * Service方法接口
 * 
 * @author xiaolingjia
 * 
 */
public interface IFlowerService {

	//select
	public Flower getByID(String ID);
	public List<Flower> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(Flower flower, String ID);
	public int updateByCondition(Flower flower, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteFlowerByIDs(String[] IDs);
	
	//save
	public int save(Flower flower);
	public int saveFlowers(Flower[] flowers);
}