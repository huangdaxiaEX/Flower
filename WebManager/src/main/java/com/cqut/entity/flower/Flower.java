package com.cqut.entity.flower;

import java.util.*;
/**
 * entity
 * 
 * @author xiaolingjia
 * 
 */
public class Flower {

	private java.math.BigInteger flowerId;
	private String flowerName;
	private Float price;
	private java.math.BigInteger flowerType;
	private Long totalCount;
	private Long lessCount;
	private String img;
	private String description;
	private String shopIds;
	private String content;

	public Flower(){
		// b305
	}
	
	public Flower(java.math.BigInteger flowerId, String flowerName, Float price, java.math.BigInteger flowerType, Long totalCount, Long lessCount, String img, String description, String shopIds, String content){
		this.flowerId = flowerId;
		this.flowerName = flowerName;
		this.price = price;
		this.flowerType = flowerType;
		this.totalCount = totalCount;
		this.lessCount = lessCount;
		this.img = img;
		this.description = description;
		this.shopIds = shopIds;
		this.content = content;
	}
	
	public java.math.BigInteger getFlowerId(){
		return flowerId;
	}
	
	public void setFlowerId(java.math.BigInteger flowerId) {
		this.flowerId = flowerId;
	}
	
	public String getFlowerName(){
		return flowerName;
	}
	
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	
	public Float getPrice(){
		return price;
	}
	
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public java.math.BigInteger getFlowerType(){
		return flowerType;
	}
	
	public void setFlowerType(java.math.BigInteger flowerType) {
		this.flowerType = flowerType;
	}
	
	public Long getTotalCount(){
		return totalCount;
	}
	
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	
	public Long getLessCount(){
		return lessCount;
	}
	
	public void setLessCount(Long lessCount) {
		this.lessCount = lessCount;
	}
	
	public String getImg(){
		return img;
	}
	
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getShopIds(){
		return shopIds;
	}
	
	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}
	
	public String getContent(){
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Flower [" + "flowerId=" + flowerId + ", " + "flowerName=" + flowerName + ", " + "price=" + price + ", " + "flowerType=" + flowerType + ", " + "totalCount=" + totalCount + ", " + "lessCount=" + lessCount + ", " + "img=" + img + ", " + "description=" + description + ", " + "shopIds=" + shopIds + ", " + "content=" + content + "]";
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("flowerId", flowerId);
		map.put("flowerName", flowerName);
		map.put("price", price);
		map.put("flowerType", flowerType);
		map.put("totalCount", totalCount);
		map.put("lessCount", lessCount);
		map.put("img", img);
		map.put("description", description);
		map.put("shopIds", shopIds);
		map.put("content", content);
		
		return map;
	}
	
}
