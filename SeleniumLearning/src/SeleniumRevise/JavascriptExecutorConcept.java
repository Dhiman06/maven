package SeleniumRevise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorConcept {

	/*
	 * Actions JavascriptExecutor can perform 1.Flashing an element 2.Drawing a
	 * border around the element 3.Capture title of the page 4.Click on some element
	 * 5.Generate Alert info 6.Refreshing page 7.Scrolling page
	 */

	/***************************
	 * Flashing an element
	 *********************************/

	public static void flashElement(WebDriver driver, WebElement element) {

		String bgcolor = element.getCssValue("backgroundColor");
		System.out.println(bgcolor);

		for (int i = 0; i < 50; i++) {
			colorChange("#000000", driver, element);
			colorChange(bgcolor, driver, element);
		}

	}

	public static void colorChange(String color, WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);

		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

	/***************************
	 * Drawing a border around the element
	 *********************************/

	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);

		try {
			Thread.sleep(20);

		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

	/***************************
	 * Capture title of the page
	 *********************************/

	public static String getTitle(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return documnet.title;").toString();
		return title;
	}

	/*************************** Click on element *********************************/
	public static void clickElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	/*************************** Generate Alert *********************************/

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+ message + "')");
	}
	
	/*************************** RefreshPage *********************************/
	
	public static void refreshPage(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0);");
	}
	
	/*************************** ScrollPage *********************************/
	
	
	public static void ScrollPage(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	
	
	
}
