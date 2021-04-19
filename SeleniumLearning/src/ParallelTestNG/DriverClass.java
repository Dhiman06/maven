package ParallelTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class DriverClass {
	
	public static  ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void driver() throws IllegalAccessException {
		System.setProperty("webdriver.chrome.driver","D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new WebDriverFactory().create("Chrome");
		setDriver(driver);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void setDriver(WebDriver driver) {
		dr.set(driver);
	}
	public WebDriver getDriver() {		
		return dr.get();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().close();
		dr.set(null);
	}

}
