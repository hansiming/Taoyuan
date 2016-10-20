package com.csdhsm.taoyuan.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  MD5Util.java   
 * @Package com.csdhsm.taoyuan.utils   
 * @Description: to get the MD5 of a String, is userd to Register and Login
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月3日 下午9:34:34   
 * @version:V1.0     
 */  
public class MD5Util {
	
	/**   
	 * @Title: getMD5   
	 * @Description: get the MD5
	 * @param: @param str  
	 * @return: String     
	 * @Autor: Han
	 */ 
	public static String getMD5(String str){
		
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			
			//caculate the md5
			md.update(str.getBytes());
			
	        // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
	        // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
			return new BigInteger(1, md.digest()).toString();
			
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}
	}
}
