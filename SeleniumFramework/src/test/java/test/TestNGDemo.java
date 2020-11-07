package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Googlesearchpages;

public class TestNGDemo {

	WebDriver driver = null;
	
	@BeforeTest
	public void setup()
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void googlepagesearch()
	{
		driver.get("https://www.google.com/");
		Googlesearchpages.textbox_search(driver).sendKeys("Selenium");	
		Googlesearchpages.button_click(driver).sendKeys(Keys.RETURN);
		
		}
	

}

