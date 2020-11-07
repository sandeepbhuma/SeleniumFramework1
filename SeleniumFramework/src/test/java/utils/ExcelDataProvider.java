package utils;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	 String projectpath = System.getProperty("user.dir");
	 String sheetName = "Sheet1";
	 WebDriver driver = null;
	 
	 @BeforeTest
	 public void setup()
	 {
		 System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	 }
	 
	 @Test(dataProvider = "test1data")
	 public void test1(String username,String password) throws Exception
	 {
		 System.out.println(username+"|"+password);
		 driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
			Thread.sleep(2000);
	 }
	
@DataProvider(name = "test1data")
	public Object[][] getdata()
	{
		Object data[][]=testdata(projectpath+"/exceldata/data.xlsx", sheetName);
		return data;
	}
	public  Object[][] testdata(String excelpath,String sheetName)
	{
		ExcelUtilsPractise e1= new ExcelUtilsPractise(excelpath, sheetName);
		int rowCount=e1.getRowCount();
		int colCount=e1.getColCount();
	Object data[][] = new Object[rowCount-1][colCount];
		for (int i = 1;i<rowCount;i++)
		{
			for(int j=0;j< colCount;j++)
			{
				String cellData=e1.getCellDataString(i, j);
				//System.out.print(cellData+"|");
				data[i-1][j] = cellData;
			}
		//System.out.println();
	}
		return data;
		}
}
