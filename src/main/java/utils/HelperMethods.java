package utils;

import io.appium.java_client.MobileElement;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static utils.AppLauncher.driver;

public class HelperMethods {
	
	org.openqa.selenium.Dimension size;
	
	public WebElement findElementById(String id){
		waitForElementVisibility(driver.findElementById(id), 5000);
		return driver.findElementById(id);
	}
	
	public List<MobileElement> findElementsById(String id){
		return driver.findElementsById(id);
	}
	
	public void sleep(int ms){
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			System.out.println("waiting for " + ms +" milliseconds");
			e.printStackTrace();
		}
	}
	
	public void scrollToElement(String text){
		driver.scrollTo(text);
	}
	
	public void waitForElementVisibility(MobileElement mobileElement, long timeOutInSeconds){
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(mobileElement));
	}
	
	public void hideKeyboard(){
		driver.hideKeyboard();
	}
	
}
