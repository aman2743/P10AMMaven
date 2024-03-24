package testClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportDataFromExcel {
	public static void main(String[] args) throws IOException {
		 String path="C:\\Users\\Aman\\eclipse-workspace2\\P10AMMaven\\testData.xlsx";
	     File file=new File(path);
	     FileInputStream fis=new FileInputStream(file);
	     //.xlsx -XSSF
        XSSFWorkbook wb=new XSSFWorkbook(fis); 
        XSSFSheet ws=wb.getSheet("Sheet1");
        int rowNum=ws.getLastRowNum();
//	    System.out.println(rowNum);
        int colNum=ws.getRow(0).getLastCellNum();
//        System.out.println(colNum);
        
        for(int r=0;r<rowNum;r++) {
        	for(int c=0;c<colNum;c++) {
        		System.out.print(ws.getRow(r+1).getCell(c).getStringCellValue());
        		System.out.print(" ");
        	}
     	  System.out.println();
        }
	     
	     
	}
}