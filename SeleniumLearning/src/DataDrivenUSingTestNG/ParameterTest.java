package DataDrivenUSingTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParameterTest {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"url"})
	public void setUp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@Test
	@Parameters({"username"})
	public void YahooTest(String username)
	{
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(username);
		driver.findElement(By.id("login-signin")).click();
	}
	
}
