package com.restdatadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenUtil {

	@SuppressWarnings("deprecation")
	public ArrayList<String> getData(String testcaseName, String sheetName) throws IOException {
		ArrayList<String> array = new ArrayList<>();
		// fileinputstream argument

		FileInputStream file = new FileInputStream("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\CoachingNotes\\src\\main\\resource\\demo.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		int sheets = workbook.getNumberOfSheets();
		System.out.println("number of sheets: "+sheets);
		
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				
				// Identify Testcases column by scanning the entire ist row
				Iterator<Row> rows = sheet.iterator(); // sheet is collection of rows
				Row firstrow = rows.next();
				Iterator<Cell> cells = firstrow.cellIterator(); // row is collection of cells
				
				int k = 0;
				int column = 0;
				while (cells.hasNext()) {
					Cell value = cells.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcases")) {
						// desired column
						column = k;
					}
					k++;
				}
				
				// once column is identified then scan entire testcase column to identify purchase testcase row
				while (rows.hasNext()) {
					Row r = rows.next();
					//if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						// after you grab purchase testcase row = pull all the data of that row and feed into test
						Iterator<Cell> c = r.cellIterator();
			
						while (c.hasNext()) {
							 //System.out.println(c.next().getStringCellValue());
							Cell cell=c.next();
							
							if(cell.getCellTypeEnum()== CellType.STRING){
							array.add(cell.getStringCellValue());
						}
							else{
								array.add(NumberToTextConverter.toText(cell.getNumericCellValue()))	;
							}
							
						}
						
					}
				
				}
			}
		//}
		return array;

	}
}
