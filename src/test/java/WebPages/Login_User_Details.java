package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_User_Details {
	
	WebDriver driver;
	
	
	
	
	By user = By.xpath("//*[@id='ap_email']");
	By ClickContinue = By.xpath("//input[@id='continue']");
	By pass = By.xpath("//*[@id='ap_password']");
	By ClickSignIn = By.xpath("//input[@id='signInSubmit']");
	
	
	public void Enter_User_Details(String username,String password) throws InterruptedException {
		
		driver.findElement(user).sendKeys(username);
		driver.findElement(ClickContinue).click();
		driver.findElement(pass).sendKeys(password);
		driver.findElement(ClickSignIn).click();
		
		Thread.sleep(20000);
		
	}
	
	//Constructure....
	public Login_User_Details(WebDriver driver) {
		
		this.driver=driver;
	}

}
