package com.cqut.entity.flowerApprise;

import java.util.*;
/**
 * entity
 * 
 * @author xiaolingjia
 * 
 */
public class FlowerApprise {

	private java.math.BigInteger flowerAppriseId;
	private java.math.BigInteger flowerId;
	private java.math.BigInteger userId;
	private String content;
	private Long appriseLevel;

	public FlowerApprise(){
		// b305
	}
	
	public FlowerApprise(java.math.BigInteger flowerAppriseId, java.math.BigInteger flowerId, java.math.BigInteger userId, String content, Long appriseLevel){
		this.flowerAppriseId = flowerAppriseId;
		this.flowerId = flowerId;
		this.userId = userId;
		this.content = content;
		this.appriseLevel = appriseLevel;
	}
	
	public java.math.BigInteger getFlowerAppriseId(){
		return flowerAppriseId;
	}
	
	public void setFlowerAppriseId(java.math.BigInteger flowerAppriseId) {
		this.flowerAppriseId = flowerAppriseId;
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
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Long getAppriseLevel(){
		return appriseLevel;
	}
	
	public void setAppriseLevel(Long appriseLevel) {
		this.appriseLevel = appriseLevel;
	}
	
	@Override
	public String toString() {
		return "FlowerApprise [" + "flowerAppriseId=" + flowerAppriseId + ", " + "flowerId=" + flowerId + ", " + "userId=" + userId + ", " + "content=" + content + ", " + "appriseLevel=" + appriseLevel + "]";
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("flowerAppriseId", flowerAppriseId);
		map.put("flowerId", flowerId);
		map.put("userId", userId);
		map.put("content", content);
		map.put("appriseLevel", appriseLevel);
		
		return map;
	}
	
}
