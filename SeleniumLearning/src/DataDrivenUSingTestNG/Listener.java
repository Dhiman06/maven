package DataDrivenUSingTestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Listener {
	
	@Test
	public void TestA() {
		System.out.println("Listener on Pass");
	}
	
	@Test
	public void TestB() {
		Assert.assertEquals("Test", "Test1","Listener on Fail");
	}
	
	@Test
	public void TestC() {
		System.out.println("Listener on Skip");
		throw new SkipException("Skip this testC");
		
	}

}
