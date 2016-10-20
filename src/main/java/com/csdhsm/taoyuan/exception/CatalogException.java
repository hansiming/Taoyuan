package com.csdhsm.taoyuan.exception;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  CatalogException.java   
 * @Package com.csdhsm.taoyuan.exception   
 * @Description: 
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月4日 上午10:40:00   
 * @version:V1.0     
 */  
public class CatalogException extends Exception {

	/**   
	 * @Fields serialVersionUID : The serialVersionUID of CatalogException.java 
	 */ 
	private static final long serialVersionUID = 1L;
	
	public CatalogException(String message) {
		
		super(message);
	}
	
	public CatalogException(String message, Exception e) {

		super(message, e);
	}
}
