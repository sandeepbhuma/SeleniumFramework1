package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static String projectpath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRowCount();
		getCellDataString();
		getCellDataNumber();
		

	}
public static void getRowCount()
{
 
 try
 {
 workbook = new XSSFWorkbook(projectpath+"/exceldata/data.xlsx");
 sheet = workbook.getSheet("Sheet1");
int Rownumbers = sheet.getPhysicalNumberOfRows();
System.out.println("Row numbers is: "+Rownumbers);
 
 }
 catch(Exception exp)
 {
	 System.out.println(exp.getMessage());
	 System.out.println(exp.getCause());
	 exp.getStackTrace();
 }
}

public static void getCellDataString()
{
	try 
	{
		workbook = new XSSFWorkbook(projectpath+"/exceldata/data.xlsx");
		 sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellData);
		
	} 
	catch(Exception exp)
	 {
		 System.out.println(exp.getMessage());
		 System.out.println(exp.getCause());
		 exp.printStackTrace();
		 }
}

public static void getCellDataNumber()
{
	try {
	workbook = new XSSFWorkbook(projectpath+"/exceldata/data.xlsx");
	sheet = workbook.getSheet("Sheet1");
	double celldata = sheet.getRow(1).getCell(1).getNumericCellValue();
	System.out.println(celldata);
	}
	
	catch(Exception exp)
	 {
		 System.out.println(exp.getMessage());
		 System.out.println(exp.getCause());
		 exp.printStackTrace();
		 }
	
}
}
