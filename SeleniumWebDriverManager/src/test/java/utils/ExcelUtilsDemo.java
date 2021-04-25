package utils;

public class ExcelUtilsDemo {

	private static String projectLocation = System.getProperty("user.dir");
	
	private static String excelFile = "/excel/data.xlsx";
	private static String excelFile97 = "/excel/data.xls";
	
	private static String sheetName = "Tabelle1";
	
	public static void main(String[] args) {
			
		ExcelUtils excel = new ExcelUtils(projectLocation + excelFile, sheetName);
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataString(1, 0);
		excel.getCellDataString(0, 1);
		excel.getCellDataNumber(1, 1);
	}
	
}
