package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googlesearchpageobjects {
	WebDriver driver = null;
	By textbox_serach = By.id("lst-ib");
	By button_search = By.name("btnK");
	
	public Googlesearchpageobjects(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setsearchbox(String Text)
	{
		driver.findElement(textbox_serach).sendKeys(Text);
	}
	
	public void buttonsearch()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
