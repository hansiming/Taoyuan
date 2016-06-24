package com.csdhsm.taoyuan.utils;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Authentication
  extends Authenticator
{
  private String username = null;
  private String password = null;
  
  public Authentication() {}
  
  public Authentication(String username, String password)
  {
    this.username = username;
    this.password = password;
  }
  
  protected PasswordAuthentication getPasswordAuthentication()
  {
    PasswordAuthentication pa = new PasswordAuthentication(this.username, this.password);
    return pa;
  }
}
