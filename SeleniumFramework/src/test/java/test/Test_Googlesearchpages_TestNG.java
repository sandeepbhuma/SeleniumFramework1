package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Googlesearchpages;

public class Test_Googlesearchpages_TestNG {

	//private static WebElement element = null;
	WebDriver driver = null;
	@BeforeTest
	public void setuptest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep\\Downloads\\latest selenium drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void googlesearch()
	{
		// TODO Auto-generated method stub
		driver.get("https://www.google.com/");
		 Googlesearchpages.textbox_search(driver).sendKeys("selenium");
		 Googlesearchpages.button_click(driver).sendKeys(Keys.RETURN);
		
	}

}
