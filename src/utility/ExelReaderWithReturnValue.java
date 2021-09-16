package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelReaderWithReturnValue {
	public static String readData(int row, int coloumn) throws IOException {
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
		
		// dataformate converting any datatype into String
		
		DataFormatter df = new DataFormatter();
		
		String formatdatavalue = df.formatCellValue(sh1.getRow(row).getCell(coloumn) );
		
		return formatdatavalue; 

	
		
	}
}
