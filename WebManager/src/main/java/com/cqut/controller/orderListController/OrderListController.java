package com.cqut.controller.orderListController;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.service.orderListService.customInterface.IOrderListService;

/**
 * Controller
 * 
 * @author xiaolingjia
 * 
 */
@Controller
@RequestMapping("/orderListController")
public class OrderListController {

	@Resource(name = "orderListServiceImpl")
	IOrderListService orderListService;

	/**
	 * 方法模板 请修改完成后 删除此方法
	 */
//  @RequestMapping(value = "/methodTemplate")
//	@ResponseBody
//	public void methodTemplate(String tagName){
//		System.out.println(orderListService.getByID(tagName).toString());
//	}

}