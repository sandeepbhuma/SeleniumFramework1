package utils;

public class ExcelUtilsPractiseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath = System.getProperty("user.dir");
		String sheetName = "Sheet1";
		ExcelUtilsPractise e1 = new ExcelUtilsPractise(projectpath+"/exceldata/data.xlsx",sheetName);
		e1.getRowCount();
		e1.getCellDataString(0, 0);
		e1.getCellDataNumber(1, 1);
		e1.getColCount();

	}

}
