package com.csdhsm.taoyuan.utils;

import javax.mail.*;

/**
 * <p>All rights Reserved, Designed By Han</p>
 * <p> For Taoyuan Web Application</p>
 * @Title: Authentication.java
 * @Package com.csdhsm.taoyuan.utils
 * @Description: is to check the username and password for send check email
 * @author: Han
 * @E-mail: 294098789@qq.com
 * @date: 2016年5月4日 上午11:15:50
 * @version:V1.0
 */
public class Authentication extends Authenticator {

	/**
	 * @Fields username : The username of Authentication
	 */
	private String username = null;
	
	/**   
	 * @Fields password : The password of Authentication
	 */ 
	private String password = null;

	public Authentication() {
	}

	public Authentication(String username, String password) {

		this.username = username;
		this.password = password;
	}

	protected PasswordAuthentication getPasswordAuthentication() {

		PasswordAuthentication pa = new PasswordAuthentication(username, password);
		return pa;
	}
}