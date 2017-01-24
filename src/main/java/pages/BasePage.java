package pages;

import utils.HelperMethods;

abstract class BasePage {
	
	protected HelperMethods helper = new HelperMethods();
	
	public abstract void isValid();

}
