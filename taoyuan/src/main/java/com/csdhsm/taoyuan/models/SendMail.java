package com.csdhsm.taoyuan.models;

import java.util.Properties;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  SendMail.java   
 * @Package com.csdhsm.taoyuan.models   
 * @Description: the entity of sendmail
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月4日 上午11:19:50   
 * @version:V1.0     
 */  
public class SendMail {
	
	/**   
	 * @Fields mailServerHost : The mailServerHost of SendMail
	 */ 
	private String mailServerHost;

	/**   
	 * @Fields mailServerPort : The mailServerPort of SendMail
	 */ 
	private String mailServerPort;

	/**   
	 * @Fields fromAddress : The fromAddress of SendMail
	 */ 
	private String fromAddress;

	/**   
	 * @Fields userName : The userName of SendMail
	 */ 
	private String userName;

	/**   
	 * @Fields password : The password of SendMail
	 */ 
	private String password;

	/**   
	 * @Fields toAddress : The toAddress of SendMail
	 */ 
	private String toAddress;
	
	/**   
	 * @Fields subject : The subject of SendMail
	 */ 
	private String subject;
	
	/**   
	 * @Fields content : The content of SendMail
	 */ 
	private String content;
	
	/**   
	 * @Fields attachFileNames : The attachFileNames of SendMail 
	 */ 
	private String[] attachFileNames;
	
	/**
	 * 获得邮件会话属性
	 */
	public Properties getProperties() {
		
		Properties p = new Properties();
		p.put("mail.smtp.host", this.mailServerHost);
		p.put("mail.smtp.port", this.mailServerPort);
		p.put("mail.smtp.auth", "true");
		return p;
	}

	public String getMailServerHost() {
		return mailServerHost;
	}

	public String getMailServerPort() {
		return mailServerPort;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public String[] getAttachFileNames() {
		return attachFileNames;
	}
	
	public void setMailServerHost(String mailServerHost) {
		this.mailServerHost = mailServerHost;
	}

	public void setMailServerPort(String mailServerPort) {
		this.mailServerPort = mailServerPort;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setAttachFileNames(String[] attachFileNames) {
		this.attachFileNames = attachFileNames;
	}
}