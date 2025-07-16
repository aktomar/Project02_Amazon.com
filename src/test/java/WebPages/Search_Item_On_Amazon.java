package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_Item_On_Amazon {
	
	WebDriver driver;
	
	By Search_item = By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	By Click_search_Button = By.xpath("//*[@id=\"nav-search-submit-button\"]");
	By click_on_item = By.xpath("//*[@class=\"a-link-normal s-line-clamp-2 s-link-style a-text-normal\"]/descendant::span[1]");
	
	//Method 01 : Entering item in Amazon_Search_Bar...
	public void Enter_item_in_SearchBar(String search_item) {
		
		driver.findElement(Search_item).sendKeys(search_item);
		}
	
	//Method 02 : Click on Search button...
	public void Click_On_SearchButton() throws InterruptedException {
		
		driver.findElement(Click_search_Button).click();
		Thread.sleep(5000);
		}
	
	//Method 03 : Click on searched item on UI
	public void Click_On_Searched_Item() throws InterruptedException {
		
		driver.findElement(click_on_item).click();
		Thread.sleep(5000);
		}
	
	public Search_Item_On_Amazon(WebDriver driver) {
		
		this.driver = driver;
	}

}
