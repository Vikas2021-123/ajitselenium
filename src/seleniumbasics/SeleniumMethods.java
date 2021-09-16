package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
	public static void main(String[] args) throws InterruptedException  // here throws InterruptException bcz
	{                                                                     // Thread.sleep is a intrruptexception

		
		System.setProperty("webdriver.chrome.driver", "D:\\IMP FILE\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.youtube.com/");  // get the web  page of that  perticular url :- YOUTUBE PAGE
		driver.get("https://touch.facebook.com/");   //  get the web  page of that  perticular url :- FACEBOOK PAGE
		 
		driver.manage().window().maximize(); //   Maximize the browser
		
        Thread.sleep(2000); // providing some times in second to hold the screen/webpage
        
		driver.navigate().back(); // back to prevoius web page 
		
		driver.navigate().forward(); // again forward to next webpage
		
		driver.navigate().refresh();  */
		
		driver.get("https://web.whatsapp.com/"); // returns the title of the page
		String title = driver.getTitle(); // returns the title of the page
		System.out.println(title); // returns the title of the page
		
		driver.get("https://www.google.com/search?q=ipl&rlz=1C1CHZN_enIN958IN958&oq=ipl&aqs=chrome..69i57.1846j0j7&sourceid=chrome&ie=UTF-8"); // returns the title of the page
		String title1 = driver.getTitle(); // returns the title of the page
		System.out.println(title1); // returns the title of the page
		
		
		/*driver.getCurrentUrl();  // returns the url of current page
		String url=driver.getCurrentUrl(); // returns the url of current page
		System.out.println(url); // returns the url of current page
		*/
		//driver.navigate().to("https://web.whatsapp.com/");     
		
		//driver.quit();  // clossing all the tabs, browser and windows associated with the driver
		
		driver.close(); // close the current windows of browser
		
		
		
		
	}

}
