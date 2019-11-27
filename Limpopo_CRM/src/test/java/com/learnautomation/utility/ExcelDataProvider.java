package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider(){
		File scr = new File("./TestData/Data.xlsx");
		
		try{
			FileInputStream fis = new FileInputStream(scr);
			wb = new XSSFWorkbook(fis);
		}
		catch(Exception e){
			System.out.println("Unable to read Excel file "+e.getMessage());
		}
	}
	//method to read the data from the excel
	public double getNumericData(String sheetName, int row, int column){
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	public String getStringData(int sheetIndex, int row, int column){
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();		
	}
	public String getStringData(String sheetName, int row, int column){
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
}