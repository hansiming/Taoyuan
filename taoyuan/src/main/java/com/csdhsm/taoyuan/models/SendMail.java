package com.csdhsm.taoyuan.models;

import java.util.Properties;

public class SendMail
{
  private String mailServerHost;
  private String mailServerPort;
  private String fromAddress;
  private String userName;
  private String password;
  private String toAddress;
  private String subject;
  private String content;
  private String[] attachFileNames;
  
  public Properties getProperties()
  {
    Properties p = new Properties();
    p.put("mail.smtp.host", this.mailServerHost);
    p.put("mail.smtp.port", this.mailServerPort);
    p.put("mail.smtp.auth", "true");
    return p;
  }
  
  public String getMailServerHost()
  {
    return this.mailServerHost;
  }
  
  public String getMailServerPort()
  {
    return this.mailServerPort;
  }
  
  public String getFromAddress()
  {
    return this.fromAddress;
  }
  
  public String getToAddress()
  {
    return this.toAddress;
  }
  
  public String getUserName()
  {
    return this.userName;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public String getSubject()
  {
    return this.subject;
  }
  
  public String getContent()
  {
    return this.content;
  }
  
  public String[] getAttachFileNames()
  {
    return this.attachFileNames;
  }
  
  public void setMailServerHost(String mailServerHost)
  {
    this.mailServerHost = mailServerHost;
  }
  
  public void setMailServerPort(String mailServerPort)
  {
    this.mailServerPort = mailServerPort;
  }
  
  public void setFromAddress(String fromAddress)
  {
    this.fromAddress = fromAddress;
  }
  
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
  
  public void setToAddress(String toAddress)
  {
    this.toAddress = toAddress;
  }
  
  public void setSubject(String subject)
  {
    this.subject = subject;
  }
  
  public void setContent(String content)
  {
    this.content = content;
  }
  
  public void setAttachFileNames(String[] attachFileNames)
  {
    this.attachFileNames = attachFileNames;
  }
}
