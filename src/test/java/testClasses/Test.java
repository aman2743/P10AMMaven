package testClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class Test {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\\\Users\\\\Aman\\\\eclipse-workspace2\\\\P10AMMaven\\\\testData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		int colCount = ws.getRow(0).getLastCellNum();
		for (int r = 0; r < rowCount; r++) {
			XSSFRow row = ws.getRow(r + 1);
			for (int c = 0; c < colCount; c++) {
				XSSFCell cell = row.getCell(c);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println((int)cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
				default:
					break;
				}
			}
		}
	}
}