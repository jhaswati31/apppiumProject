package tests;

import org.testng.annotations.Test;

import pages.FlightsListingPage;
import pages.HomePage;
import pages.JourneyDetailsPage;
import pages.SearchFlightPage;
import pages.TravellerDetailsPage;
import utils.AppLauncher;
import utils.HelperMethods;

public class PaymentPageTest extends AppLauncher{
	
	HomePage homePage = new HomePage();
	SearchFlightPage searchFlight = new SearchFlightPage();
	FlightsListingPage flightsList = new FlightsListingPage();
	JourneyDetailsPage journeydetails = new JourneyDetailsPage();
	TravellerDetailsPage travellerDetails = new TravellerDetailsPage();
	HelperMethods helperMethods = new HelperMethods();
	
	@Test
	public void paymentGatewayPageTest(){
		homePage.selectFlightBoking();
		searchFlight.setFromDestination("New Delhi");
		searchFlight.setToDestination("Bangalore");
		searchFlight.setDepartureDate();
		searchFlight.setReturnDate();
		searchFlight.clickOnSearch();
		helperMethods.sleep(5000);
		flightsList.clickOnBook();
		journeydetails.clickOnContinue();
		travellerDetails.fillTravellerDetails();
	}

}
