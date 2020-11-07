package listners;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.SkipException;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listners.TestNGlistnersExample.class)
public class TestNGlistinersSeleniumDemo {

	@Test
	public void test7()
	{
		System.out.println("I am inside test1");
	}
	@Test
	public void test8()
	{
		System.out.println("I am inside test2");
		//Assert.assertTrue(false);
		
		String Projectpath = System.getProperty("user.dir");
		System.out.println(Projectpath);
		
		System.setProperty("webdriver.chrome.driver",Projectpath+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("sandeep");
		//driver.findElement(By.name("email12")).sendKeys("sandeep");
		driver.close();
	}
	
}
