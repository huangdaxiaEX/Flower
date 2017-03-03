package com.cqut.service.flowerAppriseService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.flowerAppriseService.customInterface.IFlowerAppriseService;
import com.cqut.dao.flowerAppriseDao.FlowerAppriseDao;
import com.cqut.entity.flowerApprise.FlowerApprise;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author xiaolingjia
 * 
 */
@Service
public class FlowerAppriseServiceImpl extends BaseService implements IFlowerAppriseService{
	
	@Resource(name="flowerAppriseDao")
	FlowerAppriseDao flowerAppriseDao ;

	//select
	@Override
	public FlowerApprise getByID(String ID){
		// TODO Auto-generated method stub
		return flowerAppriseDao.getByID(ID);
	}
	
	@Override
	public List<FlowerApprise> getByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerAppriseDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerAppriseDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return flowerAppriseDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return flowerAppriseDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(FlowerApprise flowerApprise, String ID){
		// TODO Auto-generated method stub
		return flowerAppriseDao.updateByID(flowerApprise, ID);
	}
	
	@Override
	public int updateByCondition(FlowerApprise flowerApprise, String condition){
		// TODO Auto-generated method stub
		return flowerAppriseDao.updateByCondition(flowerApprise, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return flowerAppriseDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return flowerAppriseDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return flowerAppriseDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerAppriseDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteFlowerAppriseByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return flowerAppriseDao.deleteFlowerAppriseByIDs(IDs);
	}
	
	//save
	@Override
	public int save(FlowerApprise flowerApprise){
		// TODO Auto-generated method stub
		return flowerAppriseDao.save(flowerApprise);
	}
	
	@Override
	public int saveFlowerApprises(FlowerApprise[] flowerApprises){
		// TODO Auto-generated method stub
		return flowerAppriseDao.saveFlowerApprises(flowerApprises);
	}
	
}