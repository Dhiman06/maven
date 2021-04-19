package SeleniumRevise;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class XpathConcept {

	@Test
	public void XpathRevise() {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html"));
		driver.manage().window().maximize();
		
		//********************How to get current date/month/year***************************************//
//		LocalDate currentdate= java.time.LocalDate.now();
//		System.out.println(currentdate);
//		
//		int day = currentdate.getDayOfMonth();
//		System.out.println(day);
//		
//		Month month = currentdate.getMonth();
//		System.out.println(month);
//		
//		int year = currentdate.getYear();
//		System.out.println(year);
		//********************How to get current date/month/year***************************************//
		
		// driver.findElement(By.xpath("//input[@name='radiooptions' and
		// @value='FeMale']")).click();
		// WebElement elemnt =
		// driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		// driver.switchTo().frame(elemnt);
		// WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		// drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		// Actions action = new Actions(driver);
		// action.moveToElement(drop).dragAndDrop(drag, drop).build().perform();

		// elmnt = driver.findElement(By.id("checkbox1"));
		// elmnt.click();

//		List<WebElement> options = driver.findElements(By.xpath("//select[@id='Skills']/option"));
//		System.out.println(options.size());
//		
//		String dropVal;
//		for(int i=0;i<options.size();i++) {
//			dropVal = options.get(i).getAttribute("value");
//			if(dropVal.equals("XHTML")) {
//				options.get(i).click();
//			}
//		}
//		Select select =new Select(elmnt);
//		select.selectByValue("XML");

//		List<WebElement> chkbox = driver.findElements(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/div/input"));
//		
//		for(WebElement e :chkbox) {
//			if(e.getAttribute("value").equals("Cricket")||
//					e.getAttribute("value").equals("Movies")) {
//				e.click();
//			}
//		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		String expMonth = sc.nextLine();
//		String expYear = sc.nextLine();
//		String expDate = sc.nextLine();
//
//		driver.findElement(By.id("datepicker")).click();
//		String monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//		System.out.println(monthYear);
//		String month = monthYear.split(" ")[0].trim();
//		String year = monthYear.split(" ")[1].trim();
//
//		while (!(getMonthYear(monthYear)[0]).equals(expMonth) && (getMonthYear(monthYear)[1]).equals(expYear)) {
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//
//			monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//			System.out.println(monthYear);
//			month = monthYear.split(" ")[0].trim();
//			year = monthYear.split(" ")[1].trim();
//		}
//		driver.findElement(By.xpath("//a[text()='" + expDate + "']")).click();
//
	}
//	
//	public static String[] getMonthYear(String monthYear) {
//		return monthYear.split(" ");
//	}

}
