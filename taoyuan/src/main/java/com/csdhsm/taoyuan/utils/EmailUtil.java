package com.csdhsm.taoyuan.utils;

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.csdhsm.taoyuan.models.SendMail;

/**  
 * <p>All rights Reserved, Designed By Han</p>
 * <p>For Taoyuan Web Application</p>
 * @Title:  EmailUtil.java   
 * @Package com.csdhsm.taoyuan.utils   
 * @Description: the emailUtil to send email
 * @author: Han   
 * @E-mail: 294098789@qq.com  
 * @date:   2016年5月5日 上午8:45:30   
 * @version:V1.0     
 */  
public class EmailUtil {
	
	/**
	 * 以文本格式发送邮件
	 */
	public static boolean sendTextMail(SendMail mailInfo) {
		// 判断是否需要身份认证
		Authentication authenticator = null;
		Properties pro = mailInfo.getProperties();
		// 创建一个密码验证器
		authenticator = new Authentication(mailInfo.getUserName(), mailInfo.getPassword());
		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
		Session sendMailSession = Session.getDefaultInstance(pro, authenticator);
		try {
			Message mailMessage = new MimeMessage(sendMailSession);
			Address from = new InternetAddress(mailInfo.getFromAddress());
			mailMessage.setFrom(from);
			Address to = new InternetAddress(mailInfo.getToAddress());
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			mailMessage.setSubject(mailInfo.getSubject());
			mailMessage.setSentDate(new Date());
			String mailContent = mailInfo.getContent();
			mailMessage.setText(mailContent);
			Transport.send(mailMessage);
			return true;
		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	/**
	 * 以HTML格式发送邮件
	 */
	public static boolean sendHtmlMail(SendMail mailInfo) {
		// 判断是否需要身份认证
		Authentication authenticator = null;
		Properties pro = mailInfo.getProperties();
		authenticator = new Authentication(mailInfo.getUserName(), mailInfo.getPassword());
		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
		Session sendMailSession = Session.getDefaultInstance(pro, authenticator);
		try {
			// 根据session创建一个邮件消息
			Message mailMessage = new MimeMessage(sendMailSession);
			Address from = new InternetAddress(mailInfo.getFromAddress());
			mailMessage.setFrom(from);
			Address to = new InternetAddress(mailInfo.getToAddress());
			// Message.RecipientType.TO属性表示接收者的类型为TO
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			mailMessage.setSubject(mailInfo.getSubject());
			mailMessage.setSentDate(new Date());
			Multipart mainPart = new MimeMultipart();
			BodyPart html = new MimeBodyPart();
			html.setContent(mailInfo.getContent(), "text/html; charset=utf-8");
			mainPart.addBodyPart(html);
			mailMessage.setContent(mainPart);
			Transport.send(mailMessage);
			return true;
		} catch (MessagingException ex) {
			ex.printStackTrace();
		}
		return false;
	}
}