package com.cqut.controller.flowerShopController;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.service.flowerShopService.customInterface.IFlowerShopService;

/**
 * Controller
 * 
 * @author xiaolingjia
 * 
 */
@Controller
@RequestMapping("/flowerShopController")
public class FlowerShopController {

	@Resource(name = "flowerShopServiceImpl")
	IFlowerShopService flowerShopService;

	@RequestMapping(value = "/methodTemplate")
	@ResponseBody
	public void methodTemplate(String tagName){
		System.out.println(flowerShopService.getByID(tagName).toString());
	}

}