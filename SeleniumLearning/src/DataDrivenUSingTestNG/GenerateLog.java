package DataDrivenUSingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class GenerateLog {
	
	@Test
	public void Log()
	{
		Logger log = Logger.getLogger(GenerateLog.class);		
		System.setProperty("webdriver.chrome.driver","D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.info("Launch Broser");
		driver.get("https://login.yahoo.com/");
		log.info("Browser laucnhed success");
		
		String title = driver.getTitle();
		System.out.println(title);
		log.info("title value is "+title);
		
	}

}
