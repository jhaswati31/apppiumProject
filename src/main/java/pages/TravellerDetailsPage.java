package pages;

public class TravellerDetailsPage extends BasePage{

	String addAdultButtonId = "com.makemytrip:id/traveller_add_new_pax_text";
	String firstNameFieldId = "com.makemytrip:id/pax_first_name";
	String lastnameFieldId = "com.makemytrip:id/pax_last_name";
	String doneButtonId = "com.makemytrip:id/pax_add_traveller_button";
	String emailFieldId = "com.makemytrip:id/pax_email_til";
	String phoneFieldId = "com.makemytrip:id/pax_phone_number";
	String bookFlightButton = "com.makemytrip:id/df_book_flight";
	String phoneNumberText = "Phone Number";
	String insurancePopId = "android:id/content";
	String agreeAndContinueButtonForInsurance = "com.makemytrip:id/flight_agree_insurance_button";
	String skipButtonIdOnMealsPage = "com.makemytrip:id/tvSkipClearView";
	String fareChangeContinueButtonId = "com.makemytrip:id/button_fare_change_continue";
	
	@Override
	public void isValid() {
		// TODO Auto-generated method stub
		
	}
	
	public void addGuestDetails(){
		helper.findElementById(addAdultButtonId).click();
		helper.findElementById(firstNameFieldId).sendKeys("Aman");
		helper.findElementById(lastnameFieldId).sendKeys("Arora");
		helper.findElementById(doneButtonId).click();
	}
	
	public void setEmail(){
		helper.scrollToElement(phoneNumberText);
		helper.findElementById(emailFieldId).click();
		helper.findElementById(emailFieldId).sendKeys("test1@gmail.com");
		helper.hideKeyboard();
	}
	
	public void setPhoneNumber(){
		helper.findElementById(phoneFieldId).click();
		helper.findElementById(phoneFieldId).sendKeys("0000078978");
		helper.hideKeyboard();
	}
	
	public void clickOnBookFlight(){
		helper.findElementById(bookFlightButton).click();
	}
	
	public void acceptInsurance(){
		helper.findElementById(agreeAndContinueButtonForInsurance).click();
	}
	
	public void acceptFareChange(){
		if (helper.findElementById(fareChangeContinueButtonId).isDisplayed()){
			helper.findElementById(fareChangeContinueButtonId).click();
		}
	}
	
	public void skipAddingMeals(){
		helper.findElementById(skipButtonIdOnMealsPage).click();
	}
	
	public void fillTravellerDetailsAndContactDetails() {
		addGuestDetails();
		setEmail();
		setPhoneNumber();
	}
	
	public void goToPaymentsModePage(){
		clickOnBookFlight();
		acceptInsurance();
		acceptFareChange();
		clickOnBookFlight();
		helper.sleep(5000);
	}

}



