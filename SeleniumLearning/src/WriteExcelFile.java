import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import org.apache.poi.xssf.usermodel.*;

public class WriteExcelFile {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Status_Report");
		Object student[][] = { { "SL.No", "Name", "Age", "Department", "Year" }, { 1, "Dhiman Roy", 23, "IT", "4th" },
				{ 2, "Coco Roy", 21, "CSE", "2nd" }, { 3, "Dina Roy", 22, "IT", "3rd" },
				{ 4, "Ronty Dutta", 20, "IT", "1st" } };

		int rowCount = student.length;
		int colCount = student[0].length;

		for (int r = 0; r < rowCount; r++) {
			XSSFRow row = sheet.createRow(r);
			for (int c = 0; c < colCount; c++) {
				XSSFCell col = row.createCell(c);
				Object value = student[r][c];
				if (value instanceof String)
					col.setCellValue((String) value);
				if (value instanceof Integer)
					col.setCellValue((Integer) value);
			}
		}
		String filepath = ".\\DataSource\\Student_Info.xlsx";
		FileOutputStream outStrm = new FileOutputStream(filepath);
		workbook.write(outStrm);
		outStrm.close();
		System.out.println("File written successfully");
	}

}
