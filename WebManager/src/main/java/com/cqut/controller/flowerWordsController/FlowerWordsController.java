package com.cqut.controller.flowerWordsController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.data.baseData.BaseData;
import com.cqut.entity.buyCar.BuyCar;
import com.cqut.entity.flowerWords.FlowerWords;
import com.cqut.service.flowerWordsService.customInterface.IFlowerWordsService;
import com.cqut.util.jsonUtil.JsonUtil;

/**
 * Controller
 * 
 * @author xiaolingjia
 * 
 */
@Controller
@RequestMapping("/flowerWordsController")
public class FlowerWordsController {

	@Resource(name = "flowerWordsServiceImpl")
	IFlowerWordsService flowerWordsService;

	@RequestMapping(value = "/addFlowerWord")
	@ResponseBody
	public String addFlowerWord(long flowerId, String content, long userId){
		FlowerWords flowerWords = new FlowerWords();
		flowerWords.setContent(content);
		flowerWords.setFlowerId(java.math.BigInteger.valueOf(flowerId));
		flowerWords.setUserId(java.math.BigInteger.valueOf(userId));
		flowerWords.setIsShow(Long.valueOf(0));
		flowerWords.setStatus(Long.valueOf(0));
		int result = flowerWordsService.save(flowerWords);
		BaseData data = new BaseData();
		if (result > 0) {
			data.initSuccessData();
			return JsonUtil.toJson(data.getDataMap());
		} else {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
	}
	
	@RequestMapping(value = "/deleteFlowerWord")
	@ResponseBody
	public String deleteFlowerWord(long flowerWordsId, long userId){
		int result = flowerWordsService.deleteByCondition("flowerwordsid = '" + flowerWordsId + "' and userId = '" + userId + "'");
		BaseData data = new BaseData();
		if (result > 0) {
			data.initSuccessData();
			return JsonUtil.toJson(data.getDataMap());
		} else {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}
	}
	
	@RequestMapping(value = "/getFlowerWord")
	@ResponseBody
	public String getFlowerWord(long flowerId, long userId){
		BaseData data = new BaseData();
		List<FlowerWords> FlowerWordss = flowerWordsService.getByCondition("flowerid = '" + flowerId + "' and userId = '" + userId + "'");
		if (FlowerWordss.size() <= 0) {
			data.initFailedData();
			return JsonUtil.toJson(data.getDataMap());
		}

		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < FlowerWordss.size(); i++) {
			FlowerWords flowerWords = FlowerWordss.get(i);
			dataList.add(flowerWords.toMap());
		}
		data.getDataMap().put("data", dataList);
		data.initSuccessData();
		return JsonUtil.toJson(data.getDataMap());
	}

}