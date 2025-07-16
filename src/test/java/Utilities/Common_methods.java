package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Common_methods {
	
	WebDriver driver;
	
	
	public void TakeScreenshot() throws IOException {
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(source, new File("./Screenshots/sc01.png"));
		
		
	}
	
	public Common_methods(WebDriver driver) {
		
		this.driver=driver;
		
	}

}
