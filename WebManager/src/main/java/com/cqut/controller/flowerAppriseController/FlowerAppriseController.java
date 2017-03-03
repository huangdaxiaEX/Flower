package com.cqut.controller.flowerAppriseController;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.service.flowerAppriseService.customInterface.IFlowerAppriseService;

/**
 * Controller
 * 
 * @author xiaolingjia
 * 
 */
@Controller
@RequestMapping("/flowerAppriseController")
public class FlowerAppriseController {

	@Resource(name = "flowerAppriseServiceImpl")
	IFlowerAppriseService flowerAppriseService;

	/**
	 * 方法模板 请修改完成后 删除此方法
	 */
//  @RequestMapping(value = "/methodTemplate")
//	@ResponseBody
//	public void methodTemplate(String tagName){
//		System.out.println(flowerAppriseService.getByID(tagName).toString());
//	}

}