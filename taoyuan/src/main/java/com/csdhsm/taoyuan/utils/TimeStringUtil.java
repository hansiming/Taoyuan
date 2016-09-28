package com.csdhsm.taoyuan.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  TimeStringUtil.java   
 * @Package com.csdhsm.taoyuan.utils   
 * @Description: 根据时间得到文件名
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月19日 下午3:46:39   
 * @version:V1.0     
 */  
public class TimeStringUtil {

	private static String valueOfString(String str, int len) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len - str.length(); i++) {
			sb.append("0");
		}
		return (sb.length() == 0) ? (str) : (sb.toString() + str);
	}

	public static String getDateFormat() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(new Date());
	}

	public static Date getDateFormat(String time) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return df.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String getTimeString(Calendar calendar) {
		StringBuffer sb = new StringBuffer();
		sb.append(String.valueOf(calendar.get(Calendar.YEAR)))
				.append(valueOfString(String.valueOf(calendar.get(Calendar.MONTH) + 1), 2))
				.append(valueOfString(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)), 2))
				.append(valueOfString(String.valueOf(calendar.get(Calendar.HOUR_OF_DAY)), 2))
				.append(valueOfString(String.valueOf(calendar.get(Calendar.MINUTE)), 2))
				.append(valueOfString(String.valueOf(calendar.get(Calendar.SECOND)), 2))
				.append(valueOfString(String.valueOf(calendar.get(Calendar.MILLISECOND)), 3));
		return sb.toString();
	}

	public static String getTimeString(String time) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(getDateFormat(time));
		return getTimeString(calendar);
	}

	public static String getTimeString() {
		Calendar calendar = new GregorianCalendar();
		return getTimeString(calendar);
	}
}
