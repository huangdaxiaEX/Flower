package com.cqut.service.flowerShopService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.flowerShop.FlowerShop;

/**
 * Service方法接口
 * 
 * @author xiaolingjia
 * 
 */
public interface IFlowerShopService {

	//select
	public FlowerShop getByID(String ID);
	public List<FlowerShop> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(FlowerShop flowerShop, String ID);
	public int updateByCondition(FlowerShop flowerShop, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteFlowerShopByIDs(String[] IDs);
	
	//save
	public int save(FlowerShop flowerShop);
	public int saveFlowerShops(FlowerShop[] flowerShops);
}