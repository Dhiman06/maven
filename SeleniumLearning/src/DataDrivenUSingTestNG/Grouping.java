package DataDrivenUSingTestNG;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = {"FunctionalTest"})
	public void test1() {
		System.out.println("Funtional test1");
	}
	
	@Test(groups = {"FunctionalTest"})
	public void test2() {
		System.out.println("Funtional test2");
	}
	
	@Test(groups = {"RegressionTest"})
	public void test3() {
		System.out.println("Regression test1");
	}
	@Test(groups = {"RegressionTest"})
	public void test4() {
		System.out.println("Regression test2");
	}
	
	@Test(groups = {"FunctionalTest", "RegressionTest"})
	public void test5() {
		System.out.println("Functional and Regression test1");
	}
	@Test(groups = {"FunctionalTest", "RegressionTest"})
	public void test6() {
		System.out.println("Functional and Regression test2");
	}

}
