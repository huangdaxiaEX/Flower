package com.cqut.service.orderListService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.orderList.OrderList;

/**
 * Service方法接口
 * 
 * @author xiaolingjia
 * 
 */
public interface IOrderListService {

	//select
	public OrderList getByID(String ID);
	public List<OrderList> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(OrderList orderList, String ID);
	public int updateByCondition(OrderList orderList, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteOrderListByIDs(String[] IDs);
	
	//save
	public int save(OrderList orderList);
	public int saveOrderLists(OrderList[] orderLists);
}