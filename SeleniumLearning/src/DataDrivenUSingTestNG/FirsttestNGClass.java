package DataDrivenUSingTestNG;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirsttestNGClass {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "dataSource") // we can also use data provider name("data")
	public void test(String userName, String pwd, String exp) {
		System.out.println(userName + pwd + exp);

	}

	@DataProvider(name = "data")
	public static Object[][] dataSource(Method m) {
		Object[][] obj = null;
		if (m.getName().equals("test1")) {
			obj = new Object[1][3];
			obj[0][0] = "abc@gmail.com";
			obj[0][1] = "123";
			obj[0][2] = "valid";
		}

		if (m.getName().equals("test2")) {
			obj = new Object[1][2];
			obj[0][0] = "abc@gmail.com";
			obj[0][1] = "113";

		}

		return obj;
	}

	@AfterClass
	public void testClosure() {
		driver.close();
	}

}
