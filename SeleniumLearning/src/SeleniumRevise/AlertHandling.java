package SeleniumRevise;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {

	@Test
	public void HandleAlert() {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert"));
		driver.manage().window().maximize();

		WebElement frm = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frm);
		// driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		((JavascriptExecutor) driver).executeScript("myFunction()");
		
		
		String S1 = driver.switchTo().alert().getText();
		System.out.println(S1);
		driver.switchTo().alert().accept();

	}

}
