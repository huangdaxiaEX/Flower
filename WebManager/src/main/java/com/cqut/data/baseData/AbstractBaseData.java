package com.cqut.data.baseData;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractBaseData {
	public static final String SUCCESS = "request success";
	public static final String FAILED = "request failed";
	
	public enum requestStatusCode {
		SUCCESS { 
			public int getRequestStatusCode() {
				return 200;
				}
			},
		NOTFOUND {
			public int getRequestStatusCode() {
				return 404;
				}
			},
		FAILED {
			public int getRequestStatusCode() {
				return 503;
				}
			};
	
		public abstract int getRequestStatusCode();
	}
	
	private Map<String, Object> dataMap = new HashMap<String, Object>();
	
	public Map<String, Object> getDataMap() {
		return this.dataMap;
	}
	
	public void initSuccessData() {
		dataMap.put("status", "200");
		dataMap.put("msg", SUCCESS);
	}
	
	public void initNotFountData() {
		dataMap.put("status", "404");
		dataMap.put("msg", FAILED);
	}
	
	public void initFailedData() {
		dataMap.put("status", "503");
		dataMap.put("msg", FAILED);
	}
	
}
