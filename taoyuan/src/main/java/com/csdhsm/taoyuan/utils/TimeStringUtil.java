package com.csdhsm.taoyuan.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeStringUtil
{
  private static String valueOfString(String str, int len)
  {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < len - str.length(); i++) {
      sb.append("0");
    }
    return sb.toString() + str;
  }
  
  public static String getDateFormat()
  {
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return df.format(new Date());
  }
  
  public static Date getDateFormat(String time)
  {
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    try
    {
      return df.parse(time);
    }
    catch (ParseException e)
    {
      e.printStackTrace();
    }
    return null;
  }
  
  private static String getTimeString(Calendar calendar)
  {
    StringBuffer sb = new StringBuffer();
    sb.append(String.valueOf(calendar.get(1)))
      .append(valueOfString(String.valueOf(calendar.get(2) + 1), 2))
      .append(valueOfString(String.valueOf(calendar.get(5)), 2))
      .append(valueOfString(String.valueOf(calendar.get(11)), 2))
      .append(valueOfString(String.valueOf(calendar.get(12)), 2))
      .append(valueOfString(String.valueOf(calendar.get(13)), 2))
      .append(valueOfString(String.valueOf(calendar.get(14)), 3));
    return sb.toString();
  }
  
  public static String getTimeString(String time)
  {
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(getDateFormat(time));
    return getTimeString(calendar);
  }
  
  public static String getTimeString()
  {
    Calendar calendar = new GregorianCalendar();
    return getTimeString(calendar);
  }
}
