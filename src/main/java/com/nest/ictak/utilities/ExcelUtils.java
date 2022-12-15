package com.nest.ictak.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFWorkbook xlsxBook;
	private static XSSFSheet xlsxSheet;
	
	public static String readExcelData(int row, int col) throws IOException
	{
		FileInputStream excelFileData = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\testData.xlsx");
		xlsxBook = new XSSFWorkbook(excelFileData);
		xlsxSheet = xlsxBook.getSheetAt(0);
		return xlsxSheet.getRow(row).getCell(col).getStringCellValue();
	}
}
