package com.test;

import org.testng.Assert;
import org.testng.annotations.*;


public class DemoTest {


	
	@Test
	public void testA() {
		int a =10;
		int b= 20;
		int sum = a+b;
		Assert.assertEquals(30, sum);
		System.out.println("testA passed");
	}
	
	@Test
	public void testB() {
		int a =20;
		int b= 10;
		int sub = a-b;
		Assert.assertEquals(10, sub);
		System.out.println("testB faile");
	}
	
	
	
	
	
}
