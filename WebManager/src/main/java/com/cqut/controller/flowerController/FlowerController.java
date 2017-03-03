package com.cqut.controller.flowerController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.data.baseData.BaseData;
import com.cqut.entity.flower.Flower;
import com.cqut.service.flowerService.customInterface.IFlowerService;
import com.cqut.util.jsonUtil.JsonUtil;

/**
 * Controller
 * 
 * @author xiaolingjia
 * 
 */
@Controller
@RequestMapping("/flowerController")
public class FlowerController {

	@Resource(name = "flowerServiceImpl")
	IFlowerService flowerService;

	@RequestMapping(value = "/getAllFlower")
	@ResponseBody
	public String getAllFlower() {
		BaseData data = new BaseData();
		List<Flower> flowers = flowerService.getByCondition("");
		if (flowers.size() <= 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}

		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < flowers.size(); i++) {
			Flower flower = flowers.get(i);
			dataList.add(flower.toMap());
		}
		data.getDataMap().put("data", dataList);
		data.initSuccessData();
		return JsonUtil.toJson(data.getDataMap());
	}

	@RequestMapping(value = "/getFlowerByType")
	@ResponseBody
	public String getFlowerByType(String flowerType) {
		BaseData data = new BaseData();
		List<Flower> flowers = flowerService.getByCondition("flowertype = '" + flowerType + "'");
		if (flowers.size() <= 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}

		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < flowers.size(); i++) {
			Flower flower = flowers.get(i);
			dataList.add(flower.toMap());
		}
		data.getDataMap().put("data", dataList);
		data.initSuccessData();
		return JsonUtil.toJson(data.getDataMap());
	}
	
	@RequestMapping(value = "/getFlowerByName")
	@ResponseBody
	public String getFlowerByName(String flowerName) {
		BaseData data = new BaseData();
		List<Flower> flowers = flowerService.getByCondition("flowername = '" + flowerName + "'");
		if (flowers.size() <= 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}

		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < flowers.size(); i++) {
			Flower flower = flowers.get(i);
			dataList.add(flower.toMap());
		}
		data.getDataMap().put("data", dataList);
		data.initSuccessData();
		return JsonUtil.toJson(data.getDataMap());
	}
	
	@RequestMapping(value = "/addNewFlower")
	@ResponseBody
	public String addNewFlower(String flowerName, Float price, java.math.BigInteger flowerType, Long totalCount, Long lessCount, String img, String description, String shopIds, String content) {
		BaseData data = new BaseData();
		List<Flower> flowers = flowerService.getByCondition("flowername = '" + flowerName + "'");
		if (flowers.size() <= 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
		
		Flower flower = new Flower();
		flower.setContent(content);
		flower.setDescription(description);
		flower.setPrice(price);
		flower.setFlowerName(flowerName);
		flower.setImg(img);
		flower.setLessCount(lessCount);
		flower.setShopIds(shopIds);
		flower.setTotalCount(totalCount);
		flower.setFlowerType(flowerType);
		
		int result = flowerService.save(flower);
		if (result > 0) {
			data.initSuccessData();
			return JsonUtil.toJson(data.getDataMap());
		} else {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
	}
	
}