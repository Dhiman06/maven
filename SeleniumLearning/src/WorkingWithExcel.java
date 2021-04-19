import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class WorkingWithExcel {

	public static void main(String[] args) throws IOException {

		String filePath = ".\\DataSource\\DataFile.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(1).getLastCellNum();
		
		//using for loop
		/*for(int r=0;r<=rowCount;r++) {
			XSSFRow row= sheet.getRow(r);
			for(int c=0;c<rowCount;c++) {
				XSSFCell col = row.getCell(c);
				switch(col.getCellType()) {
				case STRING: System.out.print(col.getStringCellValue());
				break;
				case NUMERIC: System.out.print(col.getNumericCellValue());
				break;
				case BOOLEAN: System.out.print(col.getBooleanCellValue());
				break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}*/
		//using Iterator
		Iterator it = sheet.iterator();
		while(it.hasNext()) {
			XSSFRow row = (XSSFRow) it.next();
			Iterator celIt = row.iterator();
			while(celIt.hasNext()) {
				XSSFCell col = (XSSFCell)celIt.next();
				switch(col.getCellType()) {
				case STRING: System.out.print(col.getStringCellValue());
				break;
				case NUMERIC: System.out.print(col.getNumericCellValue());
				break;
				case BOOLEAN: System.out.print(col.getBooleanCellValue());
				break;
				}
				System.out.print(" | ");
			}
			System.out.println();
			
		}

	}

}
