package com.cqut.service.flowerService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.flowerService.customInterface.IFlowerService;
import com.cqut.dao.flowerDao.FlowerDao;
import com.cqut.entity.flower.Flower;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author xiaolingjia
 * 
 */
@Service
public class FlowerServiceImpl extends BaseService implements IFlowerService{
	
	@Resource(name="flowerDao")
	FlowerDao flowerDao ;

	//select
	@Override
	public Flower getByID(String ID){
		// TODO Auto-generated method stub
		return flowerDao.getByID(ID);
	}
	
	@Override
	public List<Flower> getByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return flowerDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return flowerDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(Flower flower, String ID){
		// TODO Auto-generated method stub
		return flowerDao.updateByID(flower, ID);
	}
	
	@Override
	public int updateByCondition(Flower flower, String condition){
		// TODO Auto-generated method stub
		return flowerDao.updateByCondition(flower, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return flowerDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return flowerDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return flowerDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteFlowerByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return flowerDao.deleteFlowerByIDs(IDs);
	}
	
	//save
	@Override
	public int save(Flower flower){
		// TODO Auto-generated method stub
		return flowerDao.save(flower);
	}
	
	@Override
	public int saveFlowers(Flower[] flowers){
		// TODO Auto-generated method stub
		return flowerDao.saveFlowers(flowers);
	}
	
}