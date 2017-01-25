package tests;

import org.testng.annotations.Test;

import pages.FlightsListingPage;
import pages.HomePage;
import pages.JourneyDetailsPage;
import pages.SearchFlightPage;
import pages.SelectPaymentModePage;
import pages.TravellerDetailsPage;
import utils.AppLauncher;

public class PaymentPageTest extends AppLauncher{
	
	HomePage homePage = new HomePage();
	SearchFlightPage searchFlight = new SearchFlightPage();
	FlightsListingPage flightsList = new FlightsListingPage();
	JourneyDetailsPage journeydetails = new JourneyDetailsPage();
	TravellerDetailsPage travellerDetails = new TravellerDetailsPage();
	SelectPaymentModePage paymentModes = new SelectPaymentModePage();
	
	
	@Test
	public void paymentGatewayPageTest(){
		homePage.selectFlightBoking();
		searchFlight.setTravelDetailsAndSearchFlight("Goa", "New Delhi");
		flightsList.clickOnBook();
		journeydetails.clickOnContinue();
		travellerDetails.fillTravellerDetailsAndContactDetails();
		travellerDetails.goToPaymentsModePage();
		paymentModes.isValid();
	}

}
