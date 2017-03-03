package com.cqut.entity.flowerWords;

import java.util.*;
/**
 * entity
 * 
 * @author xiaolingjia
 * 
 */
public class FlowerWords {

	private java.math.BigInteger flowerWordsId;
	private java.math.BigInteger flowerId;
	private String content;
	private java.math.BigInteger userId;
	private Long isShow;
	private Long status;

	public FlowerWords(){
		// b305
	}
	
	public FlowerWords(java.math.BigInteger flowerWordsId, java.math.BigInteger flowerId, String content, java.math.BigInteger userId, Long isShow, Long status){
		this.flowerWordsId = flowerWordsId;
		this.flowerId = flowerId;
		this.content = content;
		this.userId = userId;
		this.isShow = isShow;
		this.status = status;
	}
	
	public java.math.BigInteger getFlowerWordsId(){
		return flowerWordsId;
	}
	
	public void setFlowerWordsId(java.math.BigInteger flowerWordsId) {
		this.flowerWordsId = flowerWordsId;
	}
	
	public java.math.BigInteger getFlowerId(){
		return flowerId;
	}
	
	public void setFlowerId(java.math.BigInteger flowerId) {
		this.flowerId = flowerId;
	}
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public java.math.BigInteger getUserId(){
		return userId;
	}
	
	public void setUserId(java.math.BigInteger userId) {
		this.userId = userId;
	}
	
	public Long getIsShow(){
		return isShow;
	}
	
	public void setIsShow(Long isShow) {
		this.isShow = isShow;
	}
	
	public Long getStatus(){
		return status;
	}
	
	public void setStatus(Long status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "FlowerWords [" + "flowerWordsId=" + flowerWordsId + ", " + "flowerId=" + flowerId + ", " + "content=" + content + ", " + "userId=" + userId + ", " + "isShow=" + isShow + ", " + "status=" + status + "]";
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("flowerWordsId", flowerWordsId);
		map.put("flowerId", flowerId);
		map.put("content", content);
		map.put("userId", userId);
		map.put("isShow", isShow);
		map.put("status", status);
		
		return map;
	}
	
}
