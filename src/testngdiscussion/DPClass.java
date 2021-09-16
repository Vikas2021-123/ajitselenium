package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class DPClass {

	@DataProvider(name="testdata")
	public static String[][] dpTest() throws IOException {
		
		String path = "C:\\Users\\User\\Desktop\\sarthak.xlsx";
		
		File src = new File(path);
		
		FileInputStream fis= new FileInputStream(src);
		
	XSSFWorkbook  wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheet("Sheet1");
	
	 
		
		int rowcount = sh1.getLastRowNum();
		System.out.println(rowcount);
		
		int colcount = sh1.getRow(0).getLastCellNum();
		
		System.out.println(colcount);
		
		
		String data[][]=new String[rowcount][colcount];
		
		
		for(int i=1; i<rowcount; i++)
		{  
			
			for(int j=0; j<colcount; j++)
			{
				data[i-1][j]=sh1.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		
		return data;
	}
	

}
