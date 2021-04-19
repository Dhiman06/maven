//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class AlertandPopUp {
//
//	public static void main(String[] args) {
//		
//		WebDriver wb = null;
//		WebElement el = null;
//		String s1 = "Please enter a valid user name";
//		
//		try {
//			System.setProperty("webdriver.chrome.driver","D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
//			wb = new ChromeDriver();
//			wb.get("https://mail.rediff.com/cgi-bin/login.cgi");
//			wb.manage().window().maximize();
//			el = wb.findElement(By.name("proceed"));
//			el.click();
//			Thread.sleep(5000);
//			Alert alt = wb.switchTo().alert();
//			String altText = alt.getText();
//			System.out.println(altText);
//			if(s1.equals(altText)) {
//				System.out.println("Pass");
//			}
//			else {
//				System.out.println("Fail");
//			}			
//			alt.accept();
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			wb.close();
//		}
//		
//
//	}
//
//}
