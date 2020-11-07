package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Googlesearchpageobjects;

public class Test_Googlesearchpageobjects {
	
	public static void main(String[] args) {
		googlesearch();
	}

public static void googlesearch()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep\\Downloads\\latest selenium drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
 Googlesearchpageobjects obj1= new Googlesearchpageobjects(driver);
 driver.get("https://www.google.com/");
 obj1.setsearchbox("Selenium");
 obj1.buttonsearch();
 
}
}
