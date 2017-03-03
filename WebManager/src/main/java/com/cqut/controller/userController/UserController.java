package com.cqut.controller.userController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.data.baseData.BaseData;
import com.cqut.entity.flower.Flower;
import com.cqut.entity.user.User;
import com.cqut.service.userService.customInterface.IUserService;
import com.cqut.util.jsonUtil.JsonUtil;

/**
 * Controller
 * 
 * @author xiaolingjia
 * 
 */
@Controller
@RequestMapping("/userController")
public class UserController {

	@Resource(name = "userServiceImpl")
	IUserService userService;
	
	@RequestMapping(value = "/login")
	@ResponseBody
	public String login(String phone, String password) {
		BaseData data = new BaseData();
		List<User> users = userService.getByCondition("phone = '" + phone + "' and password = '" + password + "'");
		if (users.size() <= 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			dataList.add(user.toMap());
		}
		data.getDataMap().put("data", dataList);
		data.initSuccessData();
		return JsonUtil.toJson(data.getDataMap());
	}
	
	@RequestMapping(value = "/registerNewUser")
	@ResponseBody
	public String registerNewUser(String username, String phone, String password, Long age, String address, String nickName, String description) {
		BaseData data = new BaseData();
		List<User> users = userService.getByCondition("phone = '" + phone + "'");
		if (users.size() > 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
		
		User user = new User();
		user.setAddress(address);
		user.setDescription(description);
		user.setNickName(nickName);
		user.setPhone(phone);
		user.setAge(age);
		user.setPassword(password);
		user.setUserType(Long.valueOf(1));
		user.setIsAvailable(Long.valueOf(1));
		user.setCode(java.math.BigInteger.valueOf(System.currentTimeMillis()));
		int result = userService.save(user);
		if (result > 0) {
			data.initSuccessData();
			return JsonUtil.toJson(data.getDataMap());
		} else {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
	}
	
	@RequestMapping(value = "/changeUserAvailable")
	@ResponseBody
	public String changeUserAvailable(String phone) {
		BaseData data = new BaseData();
		List<User> users = userService.getByCondition("phone = '" + phone + "'");
		if (users.size() <= 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
		User user = users.get(0);
		if (user.getIsAvailable() == 0) {
			user.setIsAvailable(Long.valueOf(1));
		} else {
			user.setIsAvailable(Long.valueOf(0));
		}
		int result = userService.updateByCondition(user, "");
		if (result > 0) {
			data.initSuccessData();
			return JsonUtil.toJson(data.getDataMap());
		} else {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
	}
	
	@RequestMapping(value = "/updateUserInfo")
	@ResponseBody
	public String updateUserInfo(String username, String phone, String password, Long age, String address, String nickName, String description) {
		BaseData data = new BaseData();
		List<User> users = userService.getByCondition("phone = '" + phone + "'");
		if (users.size() <= 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
		
		User user = users.get(0);
		user.setAddress(address);
		user.setDescription(description);
		user.setNickName(nickName);
		user.setPhone(phone);
		user.setAge(age);
		user.setPassword(password);
		int result = userService.updateByCondition(user, "");
		if (result > 0) {
			data.initSuccessData();
			return JsonUtil.toJson(data.getDataMap());
		} else {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
	}

}