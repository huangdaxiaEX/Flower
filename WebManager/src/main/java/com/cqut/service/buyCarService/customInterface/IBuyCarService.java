package com.cqut.service.buyCarService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.buyCar.BuyCar;

/**
 * Service方法接口
 * 
 * @author xiaolingjia
 * 
 */
public interface IBuyCarService {

	//select
	public BuyCar getByID(String ID);
	public List<BuyCar> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(BuyCar buyCar, String ID);
	public int updateByCondition(BuyCar buyCar, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteBuyCarByIDs(String[] IDs);
	
	//save
	public int save(BuyCar buyCar);
	public int saveBuyCars(BuyCar[] buyCars);
}