package com.cqut.entity.orderList;

import java.util.*;
/**
 * entity
 * 
 * @author xiaolingjia
 * 
 */
public class OrderList {

	private java.math.BigInteger orderListId;
	private java.math.BigInteger createTime;
	private java.math.BigInteger userId;
	private java.math.BigInteger flowerId;
	private Long postType;
	private String postName;
	private Long buyCount;
	private Float totalPrice;
	private Long postStatus;
	private Long buyStatus;

	public OrderList(){
		// b305
	}
	
	public OrderList(java.math.BigInteger orderListId, java.math.BigInteger createTime, java.math.BigInteger userId, java.math.BigInteger flowerId, Long postType, String postName, Long buyCount, Float totalPrice, Long postStatus, Long buyStatus){
		this.orderListId = orderListId;
		this.createTime = createTime;
		this.userId = userId;
		this.flowerId = flowerId;
		this.postType = postType;
		this.postName = postName;
		this.buyCount = buyCount;
		this.totalPrice = totalPrice;
		this.postStatus = postStatus;
		this.buyStatus = buyStatus;
	}
	
	public java.math.BigInteger getOrderListId(){
		return orderListId;
	}
	
	public void setOrderListId(java.math.BigInteger orderListId) {
		this.orderListId = orderListId;
	}
	
	public java.math.BigInteger getCreateTime(){
		return createTime;
	}
	
	public void setCreateTime(java.math.BigInteger createTime) {
		this.createTime = createTime;
	}
	
	public java.math.BigInteger getUserId(){
		return userId;
	}
	
	public void setUserId(java.math.BigInteger userId) {
		this.userId = userId;
	}
	
	public java.math.BigInteger getFlowerId(){
		return flowerId;
	}
	
	public void setFlowerId(java.math.BigInteger flowerId) {
		this.flowerId = flowerId;
	}
	
	public Long getPostType(){
		return postType;
	}
	
	public void setPostType(Long postType) {
		this.postType = postType;
	}
	
	public String getPostName(){
		return postName;
	}
	
	public void setPostName(String postName) {
		this.postName = postName;
	}
	
	public Long getBuyCount(){
		return buyCount;
	}
	
	public void setBuyCount(Long buyCount) {
		this.buyCount = buyCount;
	}
	
	public Float getTotalPrice(){
		return totalPrice;
	}
	
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public Long getPostStatus(){
		return postStatus;
	}
	
	public void setPostStatus(Long postStatus) {
		this.postStatus = postStatus;
	}
	
	public Long getBuyStatus(){
		return buyStatus;
	}
	
	public void setBuyStatus(Long buyStatus) {
		this.buyStatus = buyStatus;
	}
	
	@Override
	public String toString() {
		return "OrderList [" + "orderListId=" + orderListId + ", " + "createTime=" + createTime + ", " + "userId=" + userId + ", " + "flowerId=" + flowerId + ", " + "postType=" + postType + ", " + "postName=" + postName + ", " + "buyCount=" + buyCount + ", " + "totalPrice=" + totalPrice + ", " + "postStatus=" + postStatus + ", " + "buyStatus=" + buyStatus + "]";
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orderListId", orderListId);
		map.put("createTime", createTime);
		map.put("userId", userId);
		map.put("flowerId", flowerId);
		map.put("postType", postType);
		map.put("postName", postName);
		map.put("buyCount", buyCount);
		map.put("totalPrice", totalPrice);
		map.put("postStatus", postStatus);
		map.put("buyStatus", buyStatus);
		
		return map;
	}
	
}
