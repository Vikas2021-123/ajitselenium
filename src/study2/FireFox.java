package study2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FireFox {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\IMP FILE\\geckodriver.exe");
		ChromeDriver driver = new FireFoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList/reset/1");
	
		driver.navigate().forward();
		driver.get("https://web.whatsapp.com/");
	

}
}