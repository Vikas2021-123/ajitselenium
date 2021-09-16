package sonamstudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelsheetWrite {

	public static void write() throws IOException
	{
		String path = System.getProperty("user.dir")+"//sonamraut.xlsx";
		
		File src = new File(path);
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
		File source = new File(path);
		
		
		FileOutputStream fo = new FileOutputStream(source);
		sh1.getRow(0).getCell(0).setCellValue("velocity");
		
		wb.write(fo);
		
		
		
		
	}
	
	public static void main(String[] args) throws IOException {
		write();
		
		
	}
}
