package SeleniumRevise;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptDemo {

	

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(("http://practice.automationtesting.in/"));
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.linkText("My Account"));
		
		//JavascriptExecutorConcept.flashElement(driver, element);
		
		//JavascriptExecutorConcept.drawBorder(driver, element);
		/***************************Capture screenshot *********************************/
		/*
		 * File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
		 * File trgt = new File("C://Users//dhima//eclipse-workspace//SeleniumLearning//ScreenShots//homeScreen.png"); 
		 * FileUtils.copyFile(src, trgt);
		 */
		
		//JavascriptExecutorConcept.getTitle(driver);
		
		JavascriptExecutorConcept.clickElement(driver, element);
		//JavascriptExecutorConcept.generateAlert(driver,"Clicked on My Account button");
		//JavascriptExecutorConcept.refreshPage(driver);
		
		WebElement subscribe = driver.findElement(By.xpath("//input[@value='Subscribe']"));
		JavascriptExecutorConcept.ScrollPage(driver, subscribe);
	}

}
