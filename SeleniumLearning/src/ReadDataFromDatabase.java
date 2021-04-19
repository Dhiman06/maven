import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.*;

public class ReadDataFromDatabase {

	public static void main(String[] args) throws SQLException, IOException {

		// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionString = "jdbc:sqlserver://DESKTOP-TJNPJCV\\MSSQLSERVER;"
				+ "databaseName=STUDY;integratedSecurity=true";
		Connection conn = DriverManager.getConnection(connectionString);
		Statement stmt = conn.createStatement();
		String qry = "SELECT * FROM OD_STDT";
		ResultSet rs = stmt.executeQuery(qry);
//		while (rs.next()) {
//			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | "
//					+ rs.getString(4) + " | " + rs.getString(5) + " | " + rs.getString(6));
//		}

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Student_data");
		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("ST_ID");
		row.createCell(1).setCellValue("NAME");
		row.createCell(2).setCellValue("CITY");
		row.createCell(3).setCellValue("CLASS");
		row.createCell(4).setCellValue("DEPT");
		row.createCell(5).setCellValue("COUNTRY");

		int r = 1;
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | "
					+ rs.getString(4) + " | " + rs.getString(5) + " | " + rs.getString(6));
			Integer stid = rs.getInt("ST_ID");
			String name = rs.getString("NAME");
			String city = rs.getString("CITY");
			String cls = rs.getString("CLASS");
			String dept = rs.getString("DEPT");
			String cntry = rs.getString("COUNTRY");

			XSSFRow row1 = sheet.createRow(r++);

			row1.createCell(0).setCellValue(stid);
			row1.createCell(1).setCellValue(name);
			row1.createCell(2).setCellValue(city);
			row1.createCell(3).setCellValue(cls);
			row1.createCell(4).setCellValue(dept);
			row1.createCell(5).setCellValue(cntry);
		}

		FileOutputStream fos = new FileOutputStream(".\\DataSource\\Student_Data.xlsx");
		workbook.write(fos);
		workbook.close();
		System.out.println("Completed!!");

	}

}
