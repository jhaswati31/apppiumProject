package utils;

import io.appium.java_client.MobileElement;

import java.util.List;

import org.openqa.selenium.WebElement;

import static utils.AppLauncher.driver;

public class HelperMethods {
	
	org.openqa.selenium.Dimension size;
	
	public WebElement findElementById(String id){
		return driver.findElementById(id);
	}
	
	public List<MobileElement> findElementsById(String id){
		return driver.findElementsById(id);
		
	}
	
	public void swipePageFromBottomToTop() throws InterruptedException{
		//Get the size of screen.
		  size = driver.manage().window().getSize();
		  System.out.println(size);
		   
		  //Find swipe start and end point from screen's with and height.
		  //Find starty point which is at bottom side of screen.
		  int starty = (int) (size.height * 0.80);
		  //Find endy point which is at top side of screen.
		  int endy = (int) (size.height * 0.20);
		  //Find horizontal point where you wants to swipe. It is in middle of screen width.
		  int startx = size.width / 2;
		  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

		  //Swipe from Bottom to Top.
		  driver.swipe(startx, starty, startx, endy, 3000);
		  Thread.sleep(2000);
	
	}
}
