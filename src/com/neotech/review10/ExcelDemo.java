package com.neotech.review10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {

		String fullPath = System.getProperty("user.dir") + "/extra/Excel.xlsx";
		
		FileInputStream fis = new FileInputStream(fullPath);
		
		// read the whole excel file
		Workbook book = new XSSFWorkbook(fis);
		
		// get the sheet from the excel file
		Sheet sheet = book.getSheet("Sheet1");
		
		// get th row (with index 2) from the sheet
		Row row2 = sheet.getRow(2);
		
		// get the cell (with index 0) from the row
		Cell cell0 = row2.getCell(0);
		
		// printing the information
		System.out.println(cell0.toString());
		
		// lets get all the headers of the sheet and print them
		Row headerRow = sheet.getRow(0);
		
		int cellNumber = headerRow.getLastCellNum();
		
		System.out.println("--------------------------------");
		
		for (int i = 0; i < cellNumber; i++) {
			String cellData = headerRow.getCell(i).toString();
			System.out.print(cellData + "\t");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		// how many rows are in the sheet?
		int rows = sheet.getPhysicalNumberOfRows();
		
		// I am skipping row with index 0, because I already printed it
		for (int row = 1; row < rows; row++) {
			
			// for each row, go from cell 0 to the last cell
			for ( int cell = 0; cell < cellNumber; cell++) {
				String cellInfo = sheet.getRow(row).getCell(cell).toString();
				System.out.print(cellInfo + " \t\t");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
