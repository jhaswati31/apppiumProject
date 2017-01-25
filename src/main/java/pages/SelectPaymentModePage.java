package pages;

import org.testng.Assert;

public class SelectPaymentModePage extends BasePage {
	
	String paymentsModeTextId = "com.makemytrip:id/payment_option_header_layout";
	String paymentModesListId = "com.makemytrip:id/payment_option_header_textView";
	String creditCardText = "Credit Card";
	String debitCardText = "Debit Card";
	
	
	@Override
	public void isValid() {
		String creditCard = helper.findElementsById(paymentModesListId).get(0).getText();
		String debitCard = helper.findElementsById(paymentModesListId).get(1).getText();
		Assert.assertEquals(creditCard, creditCardText);
		Assert.assertEquals(debitCard, debitCardText);
	}
	
	public void verifyPresenceOfPaymentModes(){
		helper.findElementById(paymentsModeTextId).isDisplayed();
	}
	
}
