package utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends ExtentReport implements ITestListener {

	public static ExtentTest test;
	ExtentReports extent = ExtentReport.getData();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
		extentTest.set(test);
		Listener.test.log(Status.INFO, "Start of the Test case");
	}

	public void onTestSuccess(ITestResult result) {
		Listener.test.log(Status.INFO, "End of the Test case");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
