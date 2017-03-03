package com.cqut.controller.buyCarController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.codehaus.jackson.map.deser.ValueInstantiators.Base;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.data.baseData.BaseData;
import com.cqut.entity.buyCar.BuyCar;
import com.cqut.entity.flower.Flower;
import com.cqut.service.buyCarService.customInterface.IBuyCarService;
import com.cqut.util.jsonUtil.JsonUtil;

/**
 * Controller
 * 
 * @author xiaolingjia
 * 
 */
@Controller
@RequestMapping("/buyCarController")
public class BuyCarController {

	@Resource(name = "buyCarServiceImpl")
	IBuyCarService buyCarService;

	@RequestMapping(value = "/addFlowerIntoCar")
	@ResponseBody
	public String addFlowerIntoCar(long flowerId, long userId){
		BuyCar buyCar = new BuyCar();
		buyCar.setFlowerId(java.math.BigInteger.valueOf(flowerId));
		buyCar.setUserId(java.math.BigInteger.valueOf(userId));
		buyCar.setStatus(Long.valueOf(1));
		int result = buyCarService.save(buyCar);
		BaseData data = new BaseData();
		if (result > 0) {
			data.initSuccessData();
			return JsonUtil.toJson(data.getDataMap());
		} else {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
	}
	
	@RequestMapping(value = "/deleteFlowerFromCar")
	@ResponseBody
	public String deleteFlowerFromCar(String buyCarId, String userId){
		int result = buyCarService.deleteByCondition("buycarId = '" + buyCarId + "' and userid = '" + userId + "'");
		BaseData data = new BaseData();
		if (result > 0) {
			data.initSuccessData();
			return JsonUtil.toJson(data.getDataMap());
		} else {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
	}
	
	@RequestMapping(value = "/getBuyCarInfoByUserId")
	@ResponseBody
	public String getBuyCarInfoByUserId(String userID){
		BaseData data = new BaseData();
		List<BuyCar> buyCars = buyCarService.getByCondition("userid = '" + userID + "'");
		if (buyCars.size() <= 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}

		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < buyCars.size(); i++) {
			BuyCar buyCar = buyCars.get(i);
			dataList.add(buyCar.toMap());
		}
		data.getDataMap().put("data", dataList);
		data.initSuccessData();
		return JsonUtil.toJson(data.getDataMap());
	}
	
	@RequestMapping(value = "/changeBuyCarStatusByUserId")
	@ResponseBody
	public String changeBuyCarStatusByUserId(String userID, String buyCarID){
		BaseData data = new BaseData();
		List<BuyCar> buyCars = buyCarService.getByCondition("userid = '" + userID + "' and buycarid = '" + buyCarID + "'");
		if (buyCars.size() <= 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
		BuyCar buyCar = buyCars.get(0);
		int result = buyCarService.updateByCondition(buyCar, "");
		
		if (result > 0) {
			data.initSuccessData();
			return JsonUtil.toJson(data.getDataMap());
		} else {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
	}

}