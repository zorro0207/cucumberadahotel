package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends LibGlobal {
	public ConfirmationPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement book;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bookeditinerary;

	@FindBy(name = "cancelall")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getBookeditinerary() {
		return bookeditinerary;
	}

}
