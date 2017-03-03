package com.cqut.service.buyCarService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.buyCarService.customInterface.IBuyCarService;
import com.cqut.dao.buyCarDao.BuyCarDao;
import com.cqut.entity.buyCar.BuyCar;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author xiaolingjia
 * 
 */
@Service
public class BuyCarServiceImpl extends BaseService implements IBuyCarService{
	
	@Resource(name="buyCarDao")
	BuyCarDao buyCarDao ;

	//select
	@Override
	public BuyCar getByID(String ID){
		// TODO Auto-generated method stub
		return buyCarDao.getByID(ID);
	}
	
	@Override
	public List<BuyCar> getByCondition(String condition){
		// TODO Auto-generated method stub
		return buyCarDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return buyCarDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return buyCarDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return buyCarDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(BuyCar buyCar, String ID){
		// TODO Auto-generated method stub
		return buyCarDao.updateByID(buyCar, ID);
	}
	
	@Override
	public int updateByCondition(BuyCar buyCar, String condition){
		// TODO Auto-generated method stub
		return buyCarDao.updateByCondition(buyCar, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return buyCarDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return buyCarDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return buyCarDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return buyCarDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteBuyCarByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return buyCarDao.deleteBuyCarByIDs(IDs);
	}
	
	//save
	@Override
	public int save(BuyCar buyCar){
		// TODO Auto-generated method stub
		return buyCarDao.save(buyCar);
	}
	
	@Override
	public int saveBuyCars(BuyCar[] buyCars){
		// TODO Auto-generated method stub
		return buyCarDao.saveBuyCars(buyCars);
	}
	
}