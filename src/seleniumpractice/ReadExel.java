package seleniumpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class ReadExel {
	
	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"//sonam.xlsx";
		
		File src = new File(path);
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		
		
		
		
		
	}

}
