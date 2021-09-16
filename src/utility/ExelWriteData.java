package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelWriteData {
	

	public static void readData() throws IOException {
		// locate a path
		
		String path = System.getProperty("user.dir")+"//velocity2.xlsx";
		
		// handle the file by using object, and that object is of  file class
		
		File src = new File(path);
		
		// to load the exel file for input stream  for performing action
		
		FileInputStream fis  = new FileInputStream(src);
		
		// accessing the workbook by creating a object of work book class taking from org.apache.poi
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		// taking our sheet with sheetname
		
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
				
		File fout = new File(path);
		
		FileOutputStream fo = new  FileOutputStream(fout);
		
		// for exsting row and exsting coloumn
		//sh1.getRow(0).getCell(0).setCellValue("ajit");
		//sh1.getRow(0).getCell(1).setCellValue("gupta");
		
		// for Existing row and non existing coloumn
		//sh1.getRow(0).createCell(2).setCellValue("velocity");
		
		// for exixting coloumn and non existing row
		sh1.createRow(25).createCell(6).setCellValue("corporate");
		//sh1.createRow(2).createCell(0).setCellValue("corporate");
		
		
		wb.write(fo);
	}
	
	public static void main(String[] args) throws IOException {
		
		readData();
	}
}