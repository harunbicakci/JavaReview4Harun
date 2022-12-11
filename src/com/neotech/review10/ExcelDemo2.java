package com.neotech.review10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo2 {

	public static void main(String[] args) throws IOException {
		
		String fullPath = System.getProperty("user.dir") + "/extra/Excel.xlsx";
		FileInputStream fis = new FileInputStream(fullPath);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet 1");
		
		Row row1 = sheet.getRow(1);
		System.out.println(row1);
		Cell cell1 = row1.getCell(3);
		System.out.println(cell1);
		
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		int[] rowsArr = new int[sheet.getPhysicalNumberOfRows()];
		
		
		
		
		
		
		

	}

}
