package com.cqut.util.primaryIDUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 主键生成工具类，定义主键常用的工具方法
 * 
 * @author huangkai
 * 
 */
public class PrimaryIdUtil {
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	private static final SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public PrimaryIdUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 把当前时间 + 毫秒当作主键返回
	 * 
	 * @return
	 */
	public static synchronized String createPrimaryId(){
		return format.format(Calendar.getInstance().getTime());
	}
	
	public static synchronized String formatCurrentTime(){
		return format1.format(Calendar.getInstance().getTime());
	}
}
