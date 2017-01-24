package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import utils.AppLauncher;

public class PaymentPageTest extends AppLauncher{
	
	HomePage homePage = new HomePage();
	
	@Test
	public void paymentGatewayPageTest(){
		homePage.selectFlightBoking();
	}

}
