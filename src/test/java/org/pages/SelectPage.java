package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends LibGlobal {
	public SelectPage() {
PageFactory.initElements(driver,this);
}
	
	@FindBy(id="radiobutton_0")
	private WebElement hotelselect;

	@FindBy(id="continue")
	private WebElement hotelSelectOn;

	public WebElement getHotelselect() {
		return hotelselect;
	}

	public WebElement getHotelSelectOn() {
		return hotelSelectOn;
	}

}
