import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = null;
		WebElement el = null;
		WebElement el1 = null;
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
			driver.manage().window().maximize();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please provide the day");
			String day = sc.nextLine();
			System.out.println(day);
						
			el = driver.findElement(By.id("select-demo"));
			el1 = driver.findElement(By.className("selected-value"));
			
			//Select dropdown using Select class
			Select sct= new Select(el);
			sct.selectByVisibleText(day);
			
			String dayVal = el1.getText();
			System.out.println(dayVal);
			if(dayVal.contains(day)) {
				System.out.println("value matched");
			}
			else {
				System.out.println("Value not matched");			}
			
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
//		finally {
//			driver.close();			
//		}
		


	}

}
