package com.cqut.entity.user;

import java.util.*;
/**
 * entity
 * 
 * @author xiaolingjia
 * 
 */
public class User {

	private java.math.BigInteger userID;
	private String username;
	private String password;
	private Long age;
	private String address;
	private String phone;
	private String nickName;
	private Long userType;
	private Long isAvailable;
	private java.math.BigInteger code;
	private String description;

	public User(){
		// b305
	}
	
	public User(java.math.BigInteger userID, String username, String password, Long age, String address, String phone, String nickName, Long userType, Long isAvailable, java.math.BigInteger code, String description){
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.nickName = nickName;
		this.userType = userType;
		this.isAvailable = isAvailable;
		this.code = code;
		this.description = description;
	}
	
	public java.math.BigInteger getUserID(){
		return userID;
	}
	
	public void setUserID(java.math.BigInteger userID) {
		this.userID = userID;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getAge(){
		return age;
	}
	
	public void setAge(Long age) {
		this.age = age;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getNickName(){
		return nickName;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public Long getUserType(){
		return userType;
	}
	
	public void setUserType(Long userType) {
		this.userType = userType;
	}
	
	public Long getIsAvailable(){
		return isAvailable;
	}
	
	public void setIsAvailable(Long isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public java.math.BigInteger getCode(){
		return code;
	}
	
	public void setCode(java.math.BigInteger code) {
		this.code = code;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "User [" + "userID=" + userID + ", " + "username=" + username + ", " + "password=" + password + ", " + "age=" + age + ", " + "address=" + address + ", " + "phone=" + phone + ", " + "nickName=" + nickName + ", " + "userType=" + userType + ", " + "isAvailable=" + isAvailable + ", " + "code=" + code + ", " + "description=" + description + "]";
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userID", userID);
		map.put("username", username);
		map.put("password", password);
		map.put("age", age);
		map.put("address", address);
		map.put("phone", phone);
		map.put("nickName", nickName);
		map.put("userType", userType);
		map.put("isAvailable", isAvailable);
		map.put("code", code);
		map.put("description", description);
		
		return map;
	}
	
}
