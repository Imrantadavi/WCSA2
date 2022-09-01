package HandleExcelFile;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {
	public static void main(String[] args) throws Exception, IOException {
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(4);
		Cell cell = row.createCell(4);
		cell.setCellValue("automation");
		
		FileOutputStream fos = new FileOutputStream("./Data/TestData.xlsx");
		wb.write(fos);
		
	
	}

}
