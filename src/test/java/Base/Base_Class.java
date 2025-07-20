package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Utilities.Logs;


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
		
		Logs.info("Setting system properties");
		System.setProperty("webdriver.chrome.driver",DriverPath);
		driver = new ChromeDriver();
		Logs.info("Launching the browser");
		driver.manage().window().maximize();
		Logs.info("Maximize Browser");
		driver.navigate().to(Amazon_Url);
		Logs.info("Navigate to the application");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Logs.info("Refreshing the webpages");
		Thread.sleep(5000);
		
		}
	
	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
		Logs.info("Closing the browser...");
	}
	
	
	

}
