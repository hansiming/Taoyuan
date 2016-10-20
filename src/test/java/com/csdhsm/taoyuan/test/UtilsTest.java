package com.csdhsm.taoyuan.test;

import org.junit.Test;

import com.csdhsm.taoyuan.utils.MD5Util;

public class UtilsTest {
	
	@Test
	public void testEmail() throws Exception{
		
		String str = "123123";
		System.out.println(MD5Util.getMD5(str));
	}
}
