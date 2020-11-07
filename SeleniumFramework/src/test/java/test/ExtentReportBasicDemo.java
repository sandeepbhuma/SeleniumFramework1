package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import com.aventstack.extentreports.reporter.ExtentReporter;

public class ExtentReportBasicDemo {
	static ExtentReports report;
	static ExtentTest test1;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	@BeforeClass
	public static void startTest()
	{
		report  = new ExtentReports("C:\\Users\\sandeep\\Downloads\\ExtentReportBasicDemo.html");
		
		 test1 = report.startTest("ExtentReportBasicDemo");
		
	}
		
	@Test
	public void ExtentDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep\\Downloads\\latest selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String Title = driver.getTitle();
		System.out.println(Title);
		if(Title.equals("Google"))
		{
			test1.log(LogStatus.PASS, "Navigated to current URL");
		}
		
		else
		{
			test1.log(LogStatus.FAIL, "Navigated to wrong URL");
			
		}
	}
		@AfterClass
		public static void endTest()
		{
		report.endTest(test1);
		report.flush();
		}
		
		
	
			

	

}
