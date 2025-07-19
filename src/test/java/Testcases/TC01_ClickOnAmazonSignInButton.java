package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.Base_Class;
import Utilities.Common_methods;
import WebPages.Login_Page;


public class TC01_ClickOnAmazonSignInButton extends Base_Class{
	
	//WebDriver driver;
	
	@Test(description ="Verifying Amazon login UI pages..")
	public void VerifyClickOnAmazonSignInButton() throws InterruptedException, IOException {
		
		Common_methods cm = new Common_methods(driver);
		
		Login_Page lp = new Login_Page(driver);
		lp.HelloSignInMouseHover();
		lp.AmazonSignIn();
		cm.TakeScreenshot();
		
		
		
		
		
	}

}
