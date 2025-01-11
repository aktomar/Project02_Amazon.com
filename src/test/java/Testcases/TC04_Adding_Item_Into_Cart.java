package Testcases;

import org.testng.annotations.Test;

import Base.Base_Class;
import WebPages.Add_to_Cart_Item;
import WebPages.Login_Page;
import WebPages.Login_User_Details;
import WebPages.Search_Item_On_Amazon;

public class TC04_Adding_Item_Into_Cart extends Base_Class {
	
	@Test(description="Adding item into the cart")
	public void Verify_AddingItem_IntoCart() throws InterruptedException {
		
		//Login Page class Object..
		Login_Page login_page = new Login_Page(driver);
		login_page.AmazonSignIn();
		
		//Login_user_details class Object..
		Login_User_Details user_detail = new Login_User_Details(driver);
		user_detail.Enter_User_Details(Username,Password);
		
		//Search_Item_On_Amazon class Object..
		Search_Item_On_Amazon search_item = new Search_Item_On_Amazon(driver);
		search_item.Enter_item_in_SearchBar(Search_Item);
		search_item.Click_On_SearchButton();
		search_item.Click_On_Searched_Item();
		
		//Adding & Checking item into the cart..
		Add_to_Cart_Item ItemInCart = new Add_to_Cart_Item(driver);
		ItemInCart.Add_item_into_Cart();
		ItemInCart.Click_On_Cart();
		
	}

}
