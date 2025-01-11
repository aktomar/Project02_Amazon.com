package Testcases;

import org.testng.annotations.Test;

import Base.Base_Class;
import WebPages.Login_Page;
import WebPages.Login_User_Details;

public class TC02_VerifyAmazonUserLoginsDetails extends Base_Class{
	
	
	@Test(description ="Entering amazon login details...")
	public void VerifyUserLoginsDetails() throws InterruptedException {
		
		//Login Page class Object...
		Login_Page login_page = new Login_Page(driver);
		login_page.AmazonSignIn();
		
		//Login_user_details class Object...
		Login_User_Details user_detail = new Login_User_Details(driver);
		user_detail.Enter_User_Details(Username,Password);
		
		
		
	}

}
