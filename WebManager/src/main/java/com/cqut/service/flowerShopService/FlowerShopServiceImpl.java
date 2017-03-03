package com.cqut.service.flowerShopService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.flowerShopService.customInterface.IFlowerShopService;
import com.cqut.dao.flowerShopDao.FlowerShopDao;
import com.cqut.entity.flowerShop.FlowerShop;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author xiaolingjia
 * 
 */
@Service
public class FlowerShopServiceImpl extends BaseService implements IFlowerShopService{
	
	@Resource(name="flowerShopDao")
	FlowerShopDao flowerShopDao ;

	//select
	@Override
	public FlowerShop getByID(String ID){
		// TODO Auto-generated method stub
		return flowerShopDao.getByID(ID);
	}
	
	@Override
	public List<FlowerShop> getByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerShopDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerShopDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return flowerShopDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return flowerShopDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(FlowerShop flowerShop, String ID){
		// TODO Auto-generated method stub
		return flowerShopDao.updateByID(flowerShop, ID);
	}
	
	@Override
	public int updateByCondition(FlowerShop flowerShop, String condition){
		// TODO Auto-generated method stub
		return flowerShopDao.updateByCondition(flowerShop, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return flowerShopDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return flowerShopDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return flowerShopDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerShopDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteFlowerShopByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return flowerShopDao.deleteFlowerShopByIDs(IDs);
	}
	
	//save
	@Override
	public int save(FlowerShop flowerShop){
		// TODO Auto-generated method stub
		return flowerShopDao.save(flowerShop);
	}
	
	@Override
	public int saveFlowerShops(FlowerShop[] flowerShops){
		// TODO Auto-generated method stub
		return flowerShopDao.saveFlowerShops(flowerShops);
	}
	
}