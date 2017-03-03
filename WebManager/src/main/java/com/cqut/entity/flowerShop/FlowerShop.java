package com.cqut.entity.flowerShop;

import java.util.*;
/**
 * entity
 * 
 * @author xiaolingjia
 * 
 */
public class FlowerShop {

	private java.math.BigInteger flowerShopId;
	private String shopName;
	private String shopPhone;
	private java.math.BigInteger shopBossId;
	private String address;
	private String img;
	private String description;
	private java.math.BigInteger shopId;
	private String createTime;

	public FlowerShop(){
		// b305
	}
	
	public FlowerShop(java.math.BigInteger flowerShopId, String shopName, String shopPhone, java.math.BigInteger shopBossId, String address, String img, String description, java.math.BigInteger shopId, String createTime){
		this.flowerShopId = flowerShopId;
		this.shopName = shopName;
		this.shopPhone = shopPhone;
		this.shopBossId = shopBossId;
		this.address = address;
		this.img = img;
		this.description = description;
		this.shopId = shopId;
		this.createTime = createTime;
	}
	
	public java.math.BigInteger getFlowerShopId(){
		return flowerShopId;
	}
	
	public void setFlowerShopId(java.math.BigInteger flowerShopId) {
		this.flowerShopId = flowerShopId;
	}
	
	public String getShopName(){
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public String getShopPhone(){
		return shopPhone;
	}
	
	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}
	
	public java.math.BigInteger getShopBossId(){
		return shopBossId;
	}
	
	public void setShopBossId(java.math.BigInteger shopBossId) {
		this.shopBossId = shopBossId;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
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
	
	public java.math.BigInteger getShopId(){
		return shopId;
	}
	
	public void setShopId(java.math.BigInteger shopId) {
		this.shopId = shopId;
	}
	
	public String getCreateTime(){
		return createTime;
	}
	
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	@Override
	public String toString() {
		return "FlowerShop [" + "flowerShopId=" + flowerShopId + ", " + "shopName=" + shopName + ", " + "shopPhone=" + shopPhone + ", " + "shopBossId=" + shopBossId + ", " + "address=" + address + ", " + "img=" + img + ", " + "description=" + description + ", " + "shopId=" + shopId + ", " + "createTime=" + createTime + "]";
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("flowerShopId", flowerShopId);
		map.put("shopName", shopName);
		map.put("shopPhone", shopPhone);
		map.put("shopBossId", shopBossId);
		map.put("address", address);
		map.put("img", img);
		map.put("description", description);
		map.put("shopId", shopId);
		map.put("createTime", createTime);
		
		return map;
	}
	
}
