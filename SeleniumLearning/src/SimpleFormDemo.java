import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormDemo {

	public static void main(String[] args) {
		WebDriver driver = null;
		WebElement el = null;
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
			driver.manage().window().maximize();
			// xpaths:
			el = driver.findElement(By.xpath("//input[@id='user-message']"));
			WebElement showbtn = driver.findElement(By.xpath("//*[text()='Show Message']"));
			WebElement urmsg = driver.findElement(By.id("display"));
			WebElement a = driver.findElement(By.id("sum1"));
			WebElement b = driver.findElement(By.id("sum2"));
			WebElement total = driver.findElement(By.xpath("//*[text()='Get Total']"));
			WebElement getTotal = driver.findElement(By.xpath("//*[text()=' Total a + b = ']"));
			WebElement totalAmnt = driver.findElement(By.id("displayvalue"));

			Scanner sc = new Scanner(System.in);
			System.out.println("Please provide the form value");
			String s3 = sc.nextLine();
			el.sendKeys(s3);
			showbtn.click();
			String s1 = urmsg.getText();
			System.out.println(s3);
			System.out.println(urmsg);
			if (s1.equals(s3)) {
				System.out.println("pass");
			} else {
				System.out.println("Fail");
			}

			int a1 = sc.nextInt();
			String h1 = Integer.toString(a1);
			int b1 = sc.nextInt();
			String s2 = Integer.toString(b1);
			a.sendKeys(h1);
			b.sendKeys(s2);
			total.click();

			int c1 = a1 + b1;
			String h2 =Integer.toString(c1);
			//String totaltext = getTotal.getText();
			System.out.println(h2);
			String totlValue = totalAmnt.getText();
			System.out.println(totlValue);

			if (h2.equals(totlValue)) {
				System.out.println("Value matched");
			} else {
				System.out.println("Value not matched");
			}

		} catch (Exception e) {
			e.printStackTrace();

		} 
//		finally {
//			driver.close();
//		}
	}

}
