package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath = System.getProperty("user.dir");
		WebDriver driver = null;
		//String excelpath = projectpath+"/exceldata/data.xlsx";
		//String sheetName = "Sheet1";
      //testData(excelpath, sheetName);
	//}
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "testData1")
	public void test1(String username,String password) throws Exception
	{
		System.out.println(username + "|"+ password);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	@DataProvider(name = "testData1")
	public  Object[][] getData()
	{
	//String projectpath = System.getProperty("user.dir");
	String excelpath = projectpath+"/exceldata/data.xlsx";
	String sheetName = "Sheet1";
	
		Object data[][] = testData(excelpath, sheetName);
		return data;
	}
	
	public  Object[][] testData(String excelpath,String sheetName)
	{
		Excelutils1 e1 = new Excelutils1(excelpath, sheetName);
		int rowCount = e1.getRowCount();
		int colCount = e1.getColCount();
		Object data[][] = new Object[rowCount-1][colCount];
		for(int i = 1; i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String cellData = e1.getCellDataString(i, j);
			//	System.out.print(cellData+"|");
				data[i-1][j] = cellData;
			}
		//System.out.println();
		}
		return data;
		}

}
