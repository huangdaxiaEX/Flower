package com.cqut.dao.orderListDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.orderList.OrderList;

/**
 * Dao
 * 
 * @author xiaolingjia
 * 
 */
public interface OrderListDao {
	//select
	public OrderList getByID(@Param("ID")String ID);
	public List<OrderList> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")OrderList orderList, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")OrderList orderList, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteOrderListByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(OrderList orderList);
	public int saveOrderLists(@Param("entities")OrderList[] orderLists);
}
