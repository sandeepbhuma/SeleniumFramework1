package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsPractise {
	static String projectpath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet worksheet;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getRowCount();
		//getCellDataString();
		//getCellDataNumber();
	}
	
	public ExcelUtilsPractise(String excelPath,String sheetName)
	{
		try {
			//Creating reference for Excel Workbook
			workbook = new XSSFWorkbook(excelPath);
			//Creating reference for Excel Worksheet
			worksheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static int getRowCount()
	
	{	int Rownumbers = 0;
		
		try {
			
			
			Rownumbers= worksheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows in the sheet are: "+ Rownumbers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}return Rownumbers;
	}
	
	public static int getColCount()
	{
		int Colnumbers=0;
		Colnumbers=worksheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of Columns in the sheet are: "+ Colnumbers);
		return Colnumbers;
	}
	public static String getCellDataString(int rowNum,int colNum)
	
	{
		String celldata = null;
		
		try {
			
			//Call below function for getting String value of the cell
			celldata = worksheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println("Cell value is :"+celldata);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}return celldata;
	}
public static void getCellDataNumber(int rowNum,int colNum)
	
	{
		
		try {
		
			//Call below function for getting Numeric value of the cell
			double celldata = worksheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("Cell value is :"+celldata);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
