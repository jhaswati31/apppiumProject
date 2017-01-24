package utils;

import org.openqa.selenium.WebElement;
import static utils.AppLauncher.driver;

public class HelperMethods {
	
	public WebElement findElementById(String id){
		return driver.findElementById(id);
		
	}
}
