package com.cqut.service.flowerAppriseService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.flowerApprise.FlowerApprise;

/**
 * Service方法接口
 * 
 * @author xiaolingjia
 * 
 */
public interface IFlowerAppriseService {

	//select
	public FlowerApprise getByID(String ID);
	public List<FlowerApprise> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(FlowerApprise flowerApprise, String ID);
	public int updateByCondition(FlowerApprise flowerApprise, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteFlowerAppriseByIDs(String[] IDs);
	
	//save
	public int save(FlowerApprise flowerApprise);
	public int saveFlowerApprises(FlowerApprise[] flowerApprises);
}