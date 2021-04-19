package DataDrivenUSingTestNG;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerTopics extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("String not matched");
	}
	public void onTestSuccess(ITestResult tr) {
		System.out.println("TestCase pass");
	}
	
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test case skipped");
	}
}
