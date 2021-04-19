package DataDrivenUSingTestNG;

import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProviderClass = FirsttestNGClass.class,dataProvider = "data")
	public void test1(String userName, String pwd, String exp) {
		System.out.println(userName + pwd + exp);
	}
	@Test(dataProviderClass = FirsttestNGClass.class,dataProvider = "data")
	public void test2(String userName, String pwd) {
		System.out.println(userName + pwd);
	}
}
