package DataDrivenUSingTestNG;

import org.testng.annotations.*;

public class TestNGBasic {
	// every annotation should be associated with a method
	// pre conditions annotations - starting with @Before
	@BeforeSuite // 1
	public void config() {
		System.out.println("Environment setup");
	}

	@BeforeTest//2
	public void login() {
		System.out.println("Login Successfull");
	}

	@BeforeClass//3
	
	public void launch() {
		System.out.println("Chrome Browser");
	}

	@BeforeMethod//4
	public void URL() {
		System.out.println("Enter URL");
	}

	// test case -- starting with annotation @test
	//5----number of test cases depends on the number of @Test annotation
	//there will create a set for each test case -- @BeforeMethod - - @Test - -@AfterMethod
	@Test//5(priority = 1,groups = "test")
	public void openBrowser() {
		System.out.println("Open Page");
	}

	@AfterMethod//6
	public void closure() {
		System.out.println("Close Browser");
	}
	
	@AfterClass//7
	public void closeapp() {
		System.out.println("close app");
	}

	@AfterTest//8
	public void closeDriver() {
		System.out.println("Closed");
	}

}
