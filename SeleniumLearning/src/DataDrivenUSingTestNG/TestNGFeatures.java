package DataDrivenUSingTestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGFeatures {

	@Test
	public void login() {
		System.out.println("login test");
		// int i =9/0;
	}

	@Test(dependsOnMethods = "login")
	public void homePage() {
		{
			System.out.println("HomePage test depends on login test");
		}

	}

	// invocationCount----number of time you want to execute a scenario
	@Test(invocationCount = 1)
	public void sum() {
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println(k);
		Assert.assertEquals(k,30,"value not matched");

	}
	// to terminate infinte loop after a certain time
	//
//	@Test(invocationTimeOut = 2,expectedExceptions = NumberFormatException.class)
//	public void A() {
//
//		int i = 1;
//		while(i==1) {
//			System.out.println("infinite loop");
//		}

//	@Test(expectedExceptions = NumberFormatException.class)
//	public void testA() {
//		String s = "ABC10";
//		Integer.parseInt(s);
//	}

}
