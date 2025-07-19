package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login_Page {
	
	WebDriver driver;
	
	
	
	
	//WebElements...
	
	By click_To_SignIn = By.xpath("//div[@class=\"nav-line-1-container\"]/child::span[contains(text(),'Hello, sign in')]");
	
	By SignIn = By.xpath("//div[@id='nav-al-signin']");
	
	
	//Mouse Hovering on SignIn option...
	public void HelloSignInMouseHover() {
		
		WebElement sg = driver.findElement(click_To_SignIn);
		
		Actions act = new Actions(driver);
		act.moveToElement(sg).perform();
	}
	
	
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
