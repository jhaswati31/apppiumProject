package tests;

import org.testng.annotations.Test;

import pages.FlightsListingPage;
import pages.HomePage;
import pages.JourneyDetailsPage;
import pages.SearchFlightPage;
import pages.TravellerDetailsPage;
import utils.AppLauncher;

public class PaymentPageTest extends AppLauncher{
	
	HomePage homePage = new HomePage();
	SearchFlightPage searchFlight = new SearchFlightPage();
	FlightsListingPage flightsList = new FlightsListingPage();
	JourneyDetailsPage journeydetails = new JourneyDetailsPage();
	TravellerDetailsPage travellerDetails = new TravellerDetailsPage();
	
	@Test
	public void paymentGatewayPageTest(){
		homePage.selectFlightBoking();
		searchFlight.setFromDestination("New Delhi");
		searchFlight.setToDestination("Bangalore");
		searchFlight.setDepartureDate();
		searchFlight.setReturnDate();
		searchFlight.clickOnSearch();
		flightsList.clickOnBook();
		journeydetails.clickOnContinue();
		travellerDetails.fillTravellerDetails();
	}

}
