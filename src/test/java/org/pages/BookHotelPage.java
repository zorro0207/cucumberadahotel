package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends LibGlobal {
	public BookHotelPage() {
PageFactory.initElements(driver, this);	

	}
	
	@FindBy(id="first_name")
	private WebElement FirstName;
	@FindBy(id="last_name")
	private WebElement LastName;
	@FindBy(id="address")
	private WebElement BillingAddress;
	
	@FindBy(id="cc_num")
	private WebElement creditCardNO ;
	
	@FindBy(id="cc_type")
	private WebElement creditType;
	
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement ccv;
	@FindBy(id="book_now")
	private WebElement book;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCardNO() {
		return creditCardNO;
	}

	public WebElement getCreditType() {
		return creditType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	

}
