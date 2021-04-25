package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * erster Weg
		getRowCount();
		getCellDataString(0,0);
		getCellDataString(0,1);
		getCellDataString(1,1);
		getCellDataNumber(1,1);

		 */
	}
	
	public static void  getRowCount() {
		
		try {
			int rowCount = sheet.getPhysicalNumberOfRows();	
			System.out.println("Number of rows is :" + rowCount);
			
		}catch(Exception exp) {
			System.out.println("Exception");
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void getCellDataString(int rowNum, int colNum) {
		
		try {
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();	
			System.out.println("Data is : " + cellData);
			
		}catch(Exception exp) {
			System.out.println("Exception");
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void getCellDataNumber(int rowNum, int colNum) {
		
		try {
			double cellData11 = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();	
			System.out.println("Data is : " + cellData11);
			
		}catch(Exception exp) {
			System.out.println("Exception");
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
