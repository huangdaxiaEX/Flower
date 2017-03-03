package com.cqut.util.instanceMapUtil;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.cqut.util.beanUtil.BeanUtil;

/**
 * 将实例转化为 Map
 * 
 * @author huangkai
 * 
 */
public class InstanceMapUtil {

	public InstanceMapUtil() {
		// TODO Auto-generated constructor stub
	}

	public static Map<String, Object> toMap(Object obj) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Map<String, Object> map = new HashMap<String, Object>();
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String destFieldName = fields[i].getName();
			Object value = BeanUtil.getValueByFieldName(obj, destFieldName);
			map.put(destFieldName, value);
		}
		
		return map;
	}
	
}
