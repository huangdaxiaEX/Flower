package com.cqut.service.userService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.userService.customInterface.IUserService;
import com.cqut.dao.userDao.UserDao;
import com.cqut.entity.user.User;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author xiaolingjia
 * 
 */
@Service
public class UserServiceImpl extends BaseService implements IUserService{
	
	@Resource(name="userDao")
	UserDao userDao ;

	//select
	@Override
	public User getByID(String ID){
		// TODO Auto-generated method stub
		return userDao.getByID(ID);
	}
	
	@Override
	public List<User> getByCondition(String condition){
		// TODO Auto-generated method stub
		return userDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return userDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return userDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return userDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(User user, String ID){
		// TODO Auto-generated method stub
		return userDao.updateByID(user, ID);
	}
	
	@Override
	public int updateByCondition(User user, String condition){
		// TODO Auto-generated method stub
		return userDao.updateByCondition(user, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return userDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return userDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return userDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return userDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteUserByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return userDao.deleteUserByIDs(IDs);
	}
	
	//save
	@Override
	public int save(User user){
		// TODO Auto-generated method stub
		return userDao.save(user);
	}
	
	@Override
	public int saveUsers(User[] users){
		// TODO Auto-generated method stub
		return userDao.saveUsers(users);
	}
	
}