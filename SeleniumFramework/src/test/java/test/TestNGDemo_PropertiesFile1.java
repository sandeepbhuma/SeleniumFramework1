package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Googlesearchpages;
import config.Propertiesfile1;


public class TestNGDemo_PropertiesFile1 {
	WebDriver driver = null;
    public static String browsername = null;
    String projectpath = System.getProperty("user.dir");
	@BeforeTest
	public void setup()
	
	
	{
		Propertiesfile1.getProperties();
	if(browsername.equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver",projectpath+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.chrome.driver",projectpath+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			
	}
	}
@Test
public void googlepagessearch()
{
	
driver.get("https://www.google.com/");
Googlesearchpages.textbox_search(driver).sendKeys("selenium");
Googlesearchpages.button_click(driver).sendKeys(Keys.RETURN);
}
}
