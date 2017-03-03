package com.cqut.service.flowerWordsService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.flowerWordsService.customInterface.IFlowerWordsService;
import com.cqut.dao.flowerWordsDao.FlowerWordsDao;
import com.cqut.entity.flowerWords.FlowerWords;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author xiaolingjia
 * 
 */
@Service
public class FlowerWordsServiceImpl extends BaseService implements IFlowerWordsService{
	
	@Resource(name="flowerWordsDao")
	FlowerWordsDao flowerWordsDao ;

	//select
	@Override
	public FlowerWords getByID(String ID){
		// TODO Auto-generated method stub
		return flowerWordsDao.getByID(ID);
	}
	
	@Override
	public List<FlowerWords> getByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerWordsDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerWordsDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return flowerWordsDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return flowerWordsDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(FlowerWords flowerWords, String ID){
		// TODO Auto-generated method stub
		return flowerWordsDao.updateByID(flowerWords, ID);
	}
	
	@Override
	public int updateByCondition(FlowerWords flowerWords, String condition){
		// TODO Auto-generated method stub
		return flowerWordsDao.updateByCondition(flowerWords, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return flowerWordsDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return flowerWordsDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return flowerWordsDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return flowerWordsDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteFlowerWordsByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return flowerWordsDao.deleteFlowerWordsByIDs(IDs);
	}
	
	//save
	@Override
	public int save(FlowerWords flowerWords){
		// TODO Auto-generated method stub
		return flowerWordsDao.save(flowerWords);
	}
	
	@Override
	public int saveFlowerWordss(FlowerWords[] flowerWordss){
		// TODO Auto-generated method stub
		return flowerWordsDao.saveFlowerWordss(flowerWordss);
	}
	
}