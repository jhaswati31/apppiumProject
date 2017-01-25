package utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

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
	        
	        capabilities.setCapability("appium-version", "1.4.16");
	        
	        capabilities.setCapability("autoAcceptAlerts", true);
	        
	        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4444/wd/hub"),capabilities);
	        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        return driver;
	    }
	 
	 @AfterSuite
	 public void tearDown(){
		 driver.quit();
	 }

}
