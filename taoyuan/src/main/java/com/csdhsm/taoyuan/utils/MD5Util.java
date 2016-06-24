package com.csdhsm.taoyuan.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5Util
{
  public static String getMD5(String str)
  {
    try
    {
      MessageDigest md = MessageDigest.getInstance("MD5");
      
      md.update(str.getBytes());
      
      return new BigInteger(1, md.digest()).toString();
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
}
