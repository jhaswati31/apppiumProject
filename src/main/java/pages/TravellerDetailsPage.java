package pages;

public class TravellerDetailsPage extends BasePage{

	String addAdultButtonId = "com.makemytrip:id/traveller_add_new_pax_text";
	String firstNameFieldId = "com.makemytrip:id/pax_first_name";
	String lastnameFieldId = "com.makemytrip:id/pax_last_name";
	String doneButtonId = "com.makemytrip:id/pax_add_traveller_button";
	String emailFieldId = "com.makemytrip:id/pax_email_til";
	String phoneFieldId = "com.makemytrip:id/pax_phone_number";
	String bookFlightButton = "com.makemytrip:id/df_book_flight";
	
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
		helper.findElementById(emailFieldId).sendKeys("test1@gmail.com");
	}
	
	public void setPhoneNumber(){
		helper.findElementById(phoneFieldId).sendKeys("000078978");
	}
	
	public void clickOnBookFlight(){
		helper.findElementById(bookFlightButton).click();
	}
	
	public void acceptInsurance(){
		
	}
	
	public void skipAddingMeals(){
		
	}
	
	public void clickOnBookFlightOnAddMealsPage(){
		
	}
	
	public void fillTravellerDetails() {
		addGuestDetails();
		try {
			helper.swipePageFromBottomToTop();
		} catch (InterruptedException e) {
			System.out.println("catching exception");
			e.printStackTrace();
		}
		setEmail();
		setPhoneNumber();
		clickOnBookFlight();
	}

}
