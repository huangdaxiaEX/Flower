package com.cqut.entity.buyCar;

import java.util.*;
/**
 * entity
 * 
 * @author xiaolingjia
 * 
 */
public class BuyCar {

	private java.math.BigInteger buyCarId;
	private java.math.BigInteger flowerId;
	private java.math.BigInteger userId;
	private Long status;

	public BuyCar(){
		// b305
	}
	
	public BuyCar(java.math.BigInteger buyCarId, java.math.BigInteger flowerId, java.math.BigInteger userId, Long status){
		this.buyCarId = buyCarId;
		this.flowerId = flowerId;
		this.userId = userId;
		this.status = status;
	}
	
	public java.math.BigInteger getBuyCarId(){
		return buyCarId;
	}
	
	public void setBuyCarId(java.math.BigInteger buyCarId) {
		this.buyCarId = buyCarId;
	}
	
	public java.math.BigInteger getFlowerId(){
		return flowerId;
	}
	
	public void setFlowerId(java.math.BigInteger flowerId) {
		this.flowerId = flowerId;
	}
	
	public java.math.BigInteger getUserId(){
		return userId;
	}
	
	public void setUserId(java.math.BigInteger userId) {
		this.userId = userId;
	}
	
	public Long getStatus(){
		return status;
	}
	
	public void setStatus(Long status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "BuyCar [" + "buyCarId=" + buyCarId + ", " + "flowerId=" + flowerId + ", " + "userId=" + userId + ", " + "status=" + status + "]";
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("buyCarId", buyCarId);
		map.put("flowerId", flowerId);
		map.put("userId", userId);
		map.put("status", status);
		
		return map;
	}
	
}
