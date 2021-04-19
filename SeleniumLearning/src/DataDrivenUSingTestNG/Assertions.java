package DataDrivenUSingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	SoftAssert asst = new SoftAssert();
	
	@Test
	public void TestA() {
		System.out.println("login success");
		//Assert.assertEquals(true, true,"page load failed");// Hard assertion---the following line of codes will not execute
		asst.assertEquals(false, true);//soft assertion
		System.out.println("Page load success");
		System.out.println("Click on Create Interaction link");
		asst.assertEquals(false, true, "Interaction load failed");
		System.out.println("Interaction load success");
		
		asst.assertAll();//fail the test case and provide the reason
	}

}
