package study2;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicComponentMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList/reset/1");
	
		driver.navigate().forward();
		driver.get("https://web.whatsapp.com/");
		driver.navigate().back();
//    String url = driver.getCurrentUrl();
//	System.out.println(url);
//	String title = driver.getTitle();
//	System.out.println(title);
driver.close();
	//driver.navigate().to("https://web.whatsapp.com/");	Thread.sleep(2000);
	//Thread.sleep(2000);
	}
}