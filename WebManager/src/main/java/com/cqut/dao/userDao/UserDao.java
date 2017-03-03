package com.cqut.dao.userDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.user.User;

/**
 * Dao
 * 
 * @author xiaolingjia
 * 
 */
public interface UserDao {
	//select
	public User getByID(@Param("ID")String ID);
	public List<User> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")User user, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")User user, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteUserByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(User user);
	public int saveUsers(@Param("entities")User[] users);
}
