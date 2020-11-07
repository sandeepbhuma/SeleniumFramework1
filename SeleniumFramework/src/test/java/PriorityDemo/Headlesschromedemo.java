package PriorityDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesschromedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test();
	}

	public static void test()
	{
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless");
		//  options.addArguments("window-size=1366,768");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		System.out.println("completed");
		driver.close();
		driver.quit();
		
	}
}
