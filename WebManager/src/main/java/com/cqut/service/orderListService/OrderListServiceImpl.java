package com.cqut.service.orderListService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.orderListService.customInterface.IOrderListService;
import com.cqut.dao.orderListDao.OrderListDao;
import com.cqut.entity.orderList.OrderList;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author xiaolingjia
 * 
 */
@Service
public class OrderListServiceImpl extends BaseService implements IOrderListService{
	
	@Resource(name="orderListDao")
	OrderListDao orderListDao ;

	//select
	@Override
	public OrderList getByID(String ID){
		// TODO Auto-generated method stub
		return orderListDao.getByID(ID);
	}
	
	@Override
	public List<OrderList> getByCondition(String condition){
		// TODO Auto-generated method stub
		return orderListDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return orderListDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return orderListDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return orderListDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(OrderList orderList, String ID){
		// TODO Auto-generated method stub
		return orderListDao.updateByID(orderList, ID);
	}
	
	@Override
	public int updateByCondition(OrderList orderList, String condition){
		// TODO Auto-generated method stub
		return orderListDao.updateByCondition(orderList, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return orderListDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return orderListDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return orderListDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return orderListDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteOrderListByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return orderListDao.deleteOrderListByIDs(IDs);
	}
	
	//save
	@Override
	public int save(OrderList orderList){
		// TODO Auto-generated method stub
		return orderListDao.save(orderList);
	}
	
	@Override
	public int saveOrderLists(OrderList[] orderLists){
		// TODO Auto-generated method stub
		return orderListDao.saveOrderLists(orderLists);
	}
	
}