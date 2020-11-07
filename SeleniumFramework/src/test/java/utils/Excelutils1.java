package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils1 {
	static String projectpath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	//static int rowNum,colNum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getRowCount();
		//getCellDataString(1,0);
		//getCellDataNumber(1,1);	

	}
	//Constructor
	public Excelutils1(String excelPath,String sheetName)
	{
		try
		{
			workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
	public static  int getRowCount()
	{
		int Rownumbers = 0;
		try
		{

			 Rownumbers = sheet.getPhysicalNumberOfRows();
			System.out.println("Row numbers is: "+Rownumbers);

		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
		}
		return Rownumbers;
	}
	
	public static  int getColCount()
	{
		int Colnumbers =0;
		try
		{

			Colnumbers = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Column number is: "+Colnumbers);

		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
		}
		return Colnumbers;
	}

	public static String getCellDataString(int rowNum,int colNum)
	{
		String cellData = null;
		try 
		{

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);

		} 
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}

	public static void getCellDataNumber(int rowNum,int colNum)
	{
		try {

			double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
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
