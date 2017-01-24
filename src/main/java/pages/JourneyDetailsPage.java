package pages;

public class JourneyDetailsPage extends BasePage{

	String continueButtonId = "com.makemytrip:id/continue_text";
	
	@Override
	public void isValid() {
		// TODO Auto-generated method stub
		
	}
	
	public void clickOnContinue(){
		helper.findElementById(continueButtonId).click();
	}

}
