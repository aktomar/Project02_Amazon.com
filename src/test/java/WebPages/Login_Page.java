package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	
	WebDriver driver;
	
	
	
	
	//WebElements...
	By SignIn = By.xpath("//a[@id=\"nav-link-accountList\"]/child::span[@class='nav-line-2 ']");
	
	
	//Clicking the sign In Option on Amazon Page
	public void AmazonSignIn() throws InterruptedException {
		
		driver.findElement(SignIn).click();
		Thread.sleep(3000);
		
	}
	
	//construtor..
		public Login_Page(WebDriver driver) {
			
			this.driver=driver ;
		}
	
	

}
