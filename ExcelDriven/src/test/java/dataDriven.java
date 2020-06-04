
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

public class dataDriven {
	XSSFWorkbook workbook;
	FileInputStream fis;

	public ArrayList<String> getData(String testcasename) throws IOException{
		ArrayList<String> arraylist=new ArrayList<String>();

		fis=new FileInputStream("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\ExcelDriven\\Excel\\demotest.xlsx");
		workbook=new XSSFWorkbook(fis);

		int sheets=workbook.getNumberOfSheets();
		for(int index=0;index<sheets;index++){

			if(workbook.getSheetName(index).equalsIgnoreCase("demo")){
				XSSFSheet sheet=workbook.getSheetAt(index);
				Iterator<Row> rows=sheet.iterator();
				Row firstrow=rows.next();
				Iterator<Cell> cells=firstrow.cellIterator();
				int k=0;
				int column = 0;
				while(cells.hasNext()){
					Cell value=cells.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCases")){
						column=k;
					}
					k++;
				}
				System.out.println(column);

				while(rows.hasNext()){
					Row row=rows.next();
					if(row.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)){
						Iterator<Cell> cell=row.cellIterator();
						while(cell.hasNext()){
							Cell c=cell.next();
							if(c.getCellTypeEnum()==CellType.STRING){
								arraylist.add(c.getStringCellValue());
								//arraylist.add(cell.next().getStringCellValue());
							}
							else {
								arraylist.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}

						}

					}
				}
			}
		}

		return arraylist;
	}

}
