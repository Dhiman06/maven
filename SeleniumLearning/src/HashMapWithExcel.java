import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.*;


public class HashMapWithExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet =workbook.createSheet("Salary");
		
		Map<Integer,String> hashmap = new HashMap<Integer, String>();
		hashmap.put(10000, "Dhiman");
		hashmap.put(50000, "Coco");
		hashmap.put(100000, "Dina");
		hashmap.put(500000, "Ronty");
		
		int r = 0;
		for(Map.Entry entry:hashmap.entrySet()) {
			XSSFRow row = sheet.createRow(r++);
			row.createCell(0).setCellValue((Integer)entry.getKey());
			row.createCell(1).setCellValue((String)entry.getValue());
		}
		FileOutputStream fos = new FileOutputStream(".\\DataSource\\Salary.xlsx");
		workbook.write(fos);
		workbook.close();
		System.out.println("Completed!!");
	}

}
