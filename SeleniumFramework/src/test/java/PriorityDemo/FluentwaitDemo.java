package PriorityDemo;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.testng.util.TimeUtils;

import com.google.common.base.Function;

public class FluentwaitDemo {
	
	public static void main(String[] args) throws   Exception {
		Fluenttest();
	}
	public static void Fluenttest() throws Exception
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("//span[.='ABCD - NIMH Data Archive - NIH']")).click();
	//	Thread.sleep(3000);
		
		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
				 .ignoring(NoSuchElementException.class);

		   @SuppressWarnings("unused")
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 WebElement linkelement = driver.findElement(By.xpath("//span[.='ABCD - NIMH Data Archive - NIH']"));
		       //return driver.findElement(By.id("foo"));
		       
		       if (linkelement.isEnabled())
		       {
		    	   System.out.println("LinkElement found");
		    	   
		       }
		       return linkelement;
		     }
		   });
		   element.click();	
		   Thread.sleep(3003);
		driver.close();
		driver.quit();
		
		}
}


