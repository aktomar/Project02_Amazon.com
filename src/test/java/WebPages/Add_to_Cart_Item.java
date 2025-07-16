package WebPages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_to_Cart_Item {
	
	WebDriver driver ;
	
	By add_to_cart = By.xpath("//*[@id=\"add-to-cart-button\"]");
	By Click_On_Cart = By.xpath("//*[@id=\"nav-cart\"]");
	
	
	//Method 01: Adding item into the cart...
	public void Add_item_into_Cart() throws InterruptedException {
		
		//Fatching the different window id's....
		Set<String> wid = driver.getWindowHandles();
		for(String i: wid) {
			
		String title = driver.switchTo().window(i).getTitle();
		
		if(title.equals("Urbano Plus Men's Cream Cotton Regular Fit Casual Chinos Trousers Stretch (pluschinop-cream-44) : Amazon.in: Fashion"))
				{
					driver.findElement(add_to_cart).click();
					break;
				}
			//System.out.println(title);
		}
		
		Thread.sleep(10000);
		
	}
	
	//Method 02 : Click on Cart to verify the item to added or not
	public void Click_On_Cart() throws InterruptedException {
		
		Set<String> wid = driver.getWindowHandles();
		for(String i: wid) {
			
		String title = driver.switchTo().window(i).getTitle();
		if(title.equals("Buy PARK AVENUE Men's Regular Trouser (PMTX07251-H3_Medium Khakhi_82) at Amazon.in")) {}
			driver.findElement(Click_On_Cart).click();
			break;
		
		}
		Thread.sleep(5000);
	}
	
	
	//Constructor...
	public Add_to_Cart_Item(WebDriver driver) {
		
		this.driver=driver;
	}

}
