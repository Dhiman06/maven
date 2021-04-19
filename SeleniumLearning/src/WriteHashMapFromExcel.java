import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.*;

public class WriteHashMapFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream fip = new FileInputStream(".\\DataSource\\Salary.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fip);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		
		Map<Integer,String> hashmap = new HashMap<Integer,String>();
		
		for(int r=0;r<=rowCount;r++) {

			int key = (int) sheet.getRow(r).getCell(0).getNumericCellValue();
			String value = sheet.getRow(r).getCell(1).getStringCellValue();	
			hashmap.put(key, value);
		}
	for(Map.Entry entry:hashmap.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	System.out.println("data retrieved successfully");

	}

}
