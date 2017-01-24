package pages;

public class FlightsListingPage extends BasePage {

	String bookButtonId = "com.makemytrip:id/split_book_btn";
	
	@Override
	public void isValid() {
		// TODO Auto-generated method stub
	}
	
	public void clickOnBook(){
		helper.findElementById(bookButtonId).click();
	}
	
	

}
