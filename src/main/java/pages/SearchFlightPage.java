package pages;

public class SearchFlightPage extends BasePage{
	
	String fromDestinationFieldId = "com.makemytrip:id/depCityCodeAndAirportName";
	String toDestinationFieldId = "com.makemytrip:id/arrCityCodeAndAirportName";
	String departureDateFieldId = "com.makemytrip:id/depDateLayout";
	String returnDateFieldId = "com.makemytrip:id/returnDateLayout";
	String searchButtonId = "com.makemytrip:id/searchFlights";
	
	@Override
	public void isValid() {
		// TODO Auto-generated method stub
		
	}
	
	public void setFromDestination(String departureCity){
		helper.findElementById(fromDestinationFieldId).click();
		
	}
	
	public void setToDestination(){
		
	}
	
	public void setDepartureDate(){
		
	}
	
	public void setReturnDate(){
		
	}
	
	public void clickOnSearch(){
		
	}
	

}
