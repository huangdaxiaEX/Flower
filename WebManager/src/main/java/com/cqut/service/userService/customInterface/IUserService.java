package com.cqut.service.userService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.user.User;

/**
 * Service方法接口
 * 
 * @author xiaolingjia
 * 
 */
public interface IUserService {

	//select
	public User getByID(String ID);
	public List<User> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(User user, String ID);
	public int updateByCondition(User user, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteUserByIDs(String[] IDs);
	
	//save
	public int save(User user);
	public int saveUsers(User[] users);
}