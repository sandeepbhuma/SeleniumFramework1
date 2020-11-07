package PriorityDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	String projectpath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName)

	{
		System.out.println("Browser Name is : "+browserName);
		System.out.println("Thread name is "+Thread.currentThread().getId());
	if (browserName.equalsIgnoreCase("chrome"))

	{
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if (browserName.equalsIgnoreCase("firefox"))

	{
		System.setProperty("webdriver.gecko.driver", projectpath+"/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	}
	@Test
	public void test() throws Exception
	{
		driver.get("https:/www.google.com/");
		Thread.sleep(4000);
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		System.out.println("Test completed successfully");
	}
}
