package utils;

public class Excelutilscalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath = System.getProperty("user.dir");
		ExcelutilsCallingexternals e1 = new ExcelutilsCallingexternals(projectpath+"/exceldata/data.xlsx", "Sheet1");
		e1.getRowCount();
		e1.getCellDataString(1,0);
		e1.getCellDataNumber(1, 1);

	}

}
