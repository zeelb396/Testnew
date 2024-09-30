package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Listeners(utilities.Listener.class)
public class ExtentReport {
	static ExtentReports extent;
	static ExtentSparkReporter reporter;
	static String Dir = "C:\\";
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	static String strDate = dateFormat.format(date);
	static SimpleDateFormat dateFormatReport = new SimpleDateFormat("dd-MMM-yyyy_hhmmss_a");
	static String strDateReport = dateFormatReport.format(date);
	// public static String vFolder = "./reports/CPQAutomation" + strDate;
	public static String AutomationReportFolderName = Dir + File.separator + "AutomationReports";
	public static String demoFolder = AutomationReportFolderName + File.separator + "TestAutomation";
	public static String UniqueDateFolder = demoFolder + File.separator + strDate;
	public static String FileName= "Automation Report";
	
	public static void createFolder(String folderPath) {
		File f = new File(folderPath);
		if (!f.exists()) {
			f.mkdir();
		}
	}

	public static ExtentReports getData() {
		createFolder(AutomationReportFolderName);
		createFolder(demoFolder);
		createFolder(UniqueDateFolder);
		reporter = new ExtentSparkReporter( UniqueDateFolder+ File.separatorChar + FileName+ "_TestReport_" + strDateReport + ".html");
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Automation Report");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Akash");
		return extent;
	}

}
