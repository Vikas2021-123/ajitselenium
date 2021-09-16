package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {

	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='txtUsername']")   
	private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")   
	private WebElement password;
	
	
	@FindBy(xpath = "//input[@name='Submit']")   
	private WebElement loginbutton;
	
	
	public Loginpage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	public void loginToApp()
	{	username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbutton.click();
	}


}
