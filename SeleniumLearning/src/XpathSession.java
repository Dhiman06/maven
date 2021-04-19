import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathSession {

	public static void main(String[] args) {
		WebDriver driver=null;
		try {
		System.setProperty("webdriver.chrome.driver", "D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
//		// 1.xpath
////		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Dhiman");
////		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Roy");
////		driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("Test@test.com");
//
//		// 2.id
//		driver.findElement(By.id("firstName")).sendKeys("Dhiman");
//		driver.findElement(By.id("lastName")).sendKeys("Roy");
//		
//		driver.findElement(By.id("userEmail")).sendKeys("test@test.com");
//		driver.findElement(By.id("gender-radio-1")).click();
//			WebElement e = driver.findElement(By.id("gender-radio-1"));
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", e);
		// 3.Name
		// 4.LinkText
		// 5.PartialLinkText--not recommended
		// 6.CSSLocator
		// 7.ClassName--not recommended
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			driver.close();
		}
		
		

	}

}
