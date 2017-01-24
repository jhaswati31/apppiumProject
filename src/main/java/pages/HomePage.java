package pages;

public class HomePage extends BasePage {
	
	String flightIconId = "com.makemytrip:id/activity_home_launcher_flights_imgvw";

	@Override
	public void isValid() {
		// TODO Auto-generated method stub
		
	}
	
	public void selectFlightBoking(){
		helper.findElementById(flightIconId).click();;
	}

}
