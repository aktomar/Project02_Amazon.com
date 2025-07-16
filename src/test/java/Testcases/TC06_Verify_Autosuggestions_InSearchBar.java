package Testcases;

import org.testng.annotations.Test;

import Base.Base_Class;
import WebPages.Check_AutosuggestionIn_SearchBar;


public class TC06_Verify_Autosuggestions_InSearchBar extends Base_Class {
	
	
	@Test(description="Verifying the autosuggestions for the items in search Bar")
	public void Validate_Autosuggestion_for_Items() throws InterruptedException {

				
		Check_AutosuggestionIn_SearchBar autosuggestion = new Check_AutosuggestionIn_SearchBar(driver);
		autosuggestion.Search_Item_In_SearchBar(Search_Item);
		autosuggestion.Fatch_AutoSuggestions();
		
	}

}
