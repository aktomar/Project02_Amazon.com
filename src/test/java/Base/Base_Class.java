package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Utilities.Read_Configuration;

public class Base_Class {
	
	
	Read_Configuration rc = new Read_Configuration();
	public String DriverPath = rc.GetDriverPath();
	public String Amazon_Url = rc.GetSiteUrl();
	public String Username = rc.GetUsername();
	public String Password = rc.GetPassword();
	public String Search_Item  =rc.Search_Item();
	

	
	
	public static WebDriver driver;
	
	@BeforeClass
	public void SetUpBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",DriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(Amazon_Url);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		}
	
	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
	}
	
	
	

}
