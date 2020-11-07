package PriorityDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoItDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		test();

	}

	
	public static void test() throws Exception 
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.name("uploaded_file"))).click().build().perform();
		//driver.findElement(By.name("uploaded_file")).click();
		//driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]")).click();
		
				Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\Auto It\\Fileuploadscript.exe");
		//Thread.sleep(3000);
		driver.close();
	}
}
