package utils;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppLauncher {
	
	public static AndroidDriver<MobileElement> driver;
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	 @BeforeSuite
	    public AndroidDriver<MobileElement> setUp() throws Exception {

	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	        
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY2232B2NV"); 
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
	        
	        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"com.makemytrip");
	        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.mmt.travel.app.home.ui.SplashActivity");
	        
	        capabilities.setCapability(MobileCapabilityType.LAUNCH_TIMEOUT,"300000");
	        

	        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
	        capabilities.setCapability("appium-version", "1.4.16");
	        
	        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4444/wd/hub"),capabilities);
	        
	        return driver;
	    }
	 
	 @Test
	 public void clickOnFlight(){
		 driver.findElementById("com.makemytrip:id/activity_home_lc_flights_txtvw");
		 Assert.assertTrue(driver.findElementById("com.makemytrip:id/activity_home_lc_flights_txtvw").isDisplayed());
	 }
}
