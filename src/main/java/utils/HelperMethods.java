package utils;

import io.appium.java_client.MobileElement;

import java.util.List;

import org.openqa.selenium.WebElement;

import static utils.AppLauncher.driver;

public class HelperMethods {
	
	public WebElement findElementById(String id){
		return driver.findElementById(id);
	}
	
	public List<MobileElement> findElementsById(String id){
		return driver.findElementsById(id);
		
	}
}
