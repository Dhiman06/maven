import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

public class FormattingExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Formatting");
		XSSFRow row = sheet.createRow(0);
		
		XSSFCellStyle style1 = workbook.createCellStyle();
		style1.setFillBackgroundColor(IndexedColors.BROWN.getIndex());
		style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		
		XSSFCell col = row.createCell(0);
		col.setCellValue("SLNo");
		col.setCellStyle(style1);
		
		FileOutputStream fos = new FileOutputStream(".\\DataSource\\Fomatting.xlsx");
		workbook.write(fos);
		workbook.close();
		System.out.println("Formatting Successfull");

	}

}
