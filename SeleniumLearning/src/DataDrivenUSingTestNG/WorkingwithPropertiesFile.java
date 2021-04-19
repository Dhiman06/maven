package DataDrivenUSingTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WorkingwithPropertiesFile {
	
	@Test
	public void setUp() throws IOException
	{
	WebDriver driver;
	Properties prop = new Properties();
	FileInputStream fip = new FileInputStream(".\\src\\config.properties");
	prop.load(fip);
	System.setProperty("webdriver.chrome.driver","D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();	
	String urladrs = prop.getProperty("url");
	String userdetails = prop.getProperty("username");
	driver.get(urladrs);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	driver.findElement(By.id("login-username")).clear();
	driver.findElement(By.id("login-username")).sendKeys(userdetails);
	}
	
	

}
