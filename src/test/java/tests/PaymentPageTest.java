package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchFlightPage;
import utils.AppLauncher;

public class PaymentPageTest extends AppLauncher{
	
	HomePage homePage = new HomePage();
	SearchFlightPage searchFlight = new SearchFlightPage();
	
	@Test
	public void paymentGatewayPageTest(){
		homePage.selectFlightBoking();
		searchFlight.setFromDestination("New Delhi");
		searchFlight.setToDestination("Ranchi");
		searchFlight.setDepartureDate();
		searchFlight.setReturnDate();
		searchFlight.clickOnSearch();
	}

}
