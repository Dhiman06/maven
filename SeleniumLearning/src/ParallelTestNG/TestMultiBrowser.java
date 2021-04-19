package ParallelTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestMultiBrowser extends DriverClass {
	
	@Test
	public void test_01() {
		getDriver().get("https://www.w3schools.com/");
		getDriver().findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[25]")).click();
	}
	 
	@Test
	public void test_02() {
		getDriver().get("https://www.w3schools.com/");
		getDriver().findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[25]")).click();
	}

}
