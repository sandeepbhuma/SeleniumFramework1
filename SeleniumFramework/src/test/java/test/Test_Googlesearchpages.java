package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Googlesearchpages;

public class Test_Googlesearchpages {

	//private static WebElement element = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep\\Downloads\\latest selenium drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		 Googlesearchpages.textbox_search(driver).sendKeys("selenium");
		 Googlesearchpages.button_click(driver).sendKeys(Keys.RETURN);
		
	}

}
