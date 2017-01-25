package pages;

import utils.HelperMethods;

public class SearchFlightPage extends BasePage{
	
	String fromDestinationFieldId = "com.makemytrip:id/depCityCodeAndAirportName";
	String toDestinationFieldId = "com.makemytrip:id/arrCityCodeAndAirportName";
	String departureDateFieldId = "com.makemytrip:id/depDateLayout";
	String returnDateFieldId = "com.makemytrip:id/returnDateLayout";
	String enterCityNameFieldId = "com.makemytrip:id/city_edit_text";
	String cityNameSuggestions = "com.makemytrip:id/cityPickerRow";
	String returnDate1FieldId= "com.makemytrip:id/calRetLayout";
	String okButtonId = "com.makemytrip:id/calOK";
	String searchButtonId = "com.makemytrip:id/searchFlights";
	
	HelperMethods helperMethods = new HelperMethods();
	
	@Override
	public void isValid() {
		// TODO Auto-generated method stub
		
	}
	
	public void setFromDestination(String departureCityName){
		helper.findElementById(fromDestinationFieldId).click();
		helper.findElementById(enterCityNameFieldId).sendKeys(departureCityName);
		helper.findElementsById(cityNameSuggestions).get(0).click();
	}
	
	public void setToDestination(String arrivalCityName){
		helper.findElementById(toDestinationFieldId).click();
		helper.findElementById(enterCityNameFieldId).sendKeys(arrivalCityName);
		helper.findElementsById(cityNameSuggestions).get(0).click();
	}
	
	public void setDepartureDate(){
		helper.findElementById(departureDateFieldId).click();
	}
	
	public void setReturnDate(){
		helper.findElementById(returnDate1FieldId).click();
		helper.findElementById(okButtonId).click();
	}
	
	public void clickOnSearch(){
		helper.findElementById(searchButtonId).click();
	}
	
	public void setTravelDetailsAndSearchFlight(String departureCityName, String arrivalCityName){
		setFromDestination(departureCityName);
		setToDestination(arrivalCityName);
		setDepartureDate();
		setReturnDate();
		clickOnSearch();
		helperMethods.sleep(5000);
	}
	

}
