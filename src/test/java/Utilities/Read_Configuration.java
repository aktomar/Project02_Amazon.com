package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_Configuration {
	
	Properties pro;
	
	public Read_Configuration() {
		
		File src = new File("./Configuration/Config.properties");
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e){
			System.out.println("Exception is" + e.getMessage());
		}
		
		
	}
	
	//Reading the content from properties files..
	
	//Getting driver path...
	public String GetDriverPath() {
		
		String driverpath = pro.getProperty("DriverPath");
		return driverpath;
	}
	
	//Getting website URL...
	public String GetSiteUrl() {
		
		String url = pro.getProperty("WebsiteUrl");
		return url;
	}
	
	//Getting username...
	public String GetUsername() {
		
		String user = pro.getProperty("Username");
		return user;
	}
	
	//Getting password..
	public String GetPassword() {
		
		String pass = pro.getProperty("Password");
		return pass;
	}
	
	//Searching an item..
	public String Search_Item() {
		
		String srch_item = pro.getProperty("searchItem");
		return srch_item;
	}

}
