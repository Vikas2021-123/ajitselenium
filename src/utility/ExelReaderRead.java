package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExelReaderRead { 
	
	public static void main(String[] args) throws IOException 
	{
		// locate a path
		String path = System.getProperty("user.dir")+"//ajit.xlsx";
		// handle the file by using object, and that object is of  file class
		File src = new File(path);
		// to load the exel file for input stream  for performing action
		FileInputStream fis  = new FileInputStream(src);
		
		// accessing the workbook by creating a object of work book class taking from org.apache.poi
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		// taking our sheet with sheetname 
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
		//accecing the values from sheet
		//String value= sh1.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(value);
		String value= sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		// int rowcount = sh1.getLastRowNum()+1;
		//System.out.println(rowcount); // rowcount
		
		//int coloumncount = sh1.getRow(0).getLastCellNum(); // coloumncount
		//System.out.println(coloumncount);
		//System.out.println(value);
		
		// counting all rows and coloumn
		/*
		for(int row=0; row<rowcount; row++)
		{
			for(int coloumn=0; coloumn<coloumncount; coloumn++)
			{

				String value= sh1.getRow(row).getCell(coloumn).getStringCellValue();
				System.out.println(value);
			}
		}
		
		*/
		
		
		
		
		
		
		
		
	}
 
}
  