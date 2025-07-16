package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_the_Selected_Item {
	
	WebDriver driver;

	By Procead_to_Buy = By.xpath("//*[@name=\"proceedToRetailCheckout\"]");
	
	//Method 01: Clicking on the procead to But item...
	public void Buy_the_selected_Item() throws InterruptedException {
		
		driver.findElement(Procead_to_Buy).click();
		Thread.sleep(5000);
	}
	
	
	//Constructor..
	public Checkout_the_Selected_Item(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
}
