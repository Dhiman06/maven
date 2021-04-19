import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		// 1.Firefox browser
		System.setProperty("webdriver.gecko.driver",
				"D:\\Softy\\SeleniumJar\\geckodriver-v0.29.0-win32\\geckodriver.exe");
		WebDriver fx = new FirefoxDriver();
		fx.get("https://www.google.com/");
		fx.manage().window().maximize();
		String title = fx.getTitle();
		System.out.println(title);

		if (title.equals("Google")) {
			System.out.println("Title is correct : pass");
		} else {
			System.out.println("In-correct Title : Fail");
		}
//		String s1 = fx.getCurrentUrl();
//		System.out.println(s1);
//		
//		String s2 = fx.getPageSource();
//		System.out.println(s2);
		// 2.Chrome Browser
//		System.setProperty("webdriver.chrome.driver", "D:\\Softy\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
//		WebDriver ch = new ChromeDriver();
//		ch.get("https://www.google.com/");
	}

}
