package DataDrivenUSingTestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PassFailSkipInTestNG {
	
	@Test
	public void loginFB()
	{
		System.out.println("Login in FB");
	}
	@Test
	public void loginGmail()
	{
		System.out.println("Login in Gmail");
		//throw new SkipException("Login in gamil is not working at the moment");
		
	}
	@Test
	public void loginInsta()
	{
		System.out.println("Login in Insta");
	}


}
