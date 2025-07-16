package WebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Check_AutosuggestionIn_SearchBar {
	
	WebDriver driver;
	
	By Search_item = By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	
	By Autosuggestion = By.xpath("//div[@class=\"left-pane-results-container\"]");
	
	//Method_01
	public void Search_Item_In_SearchBar(String searchItem) throws InterruptedException {
		
		driver.findElement(Search_item).sendKeys(searchItem);
		Thread.sleep(3000);
	}
	
	//Method_02
	public void Fatch_AutoSuggestions() {
		
		List<WebElement> Autosuggestions = driver.findElements(Autosuggestion);
		for(WebElement ele :Autosuggestions) {
			System.out.println(ele.getText());
		}
	}
	
	
	public Check_AutosuggestionIn_SearchBar(WebDriver driver) {
		
		this.driver = driver;
	}

}
