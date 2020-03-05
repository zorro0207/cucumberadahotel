package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends LibGlobal {
	public SearchPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement roomNo;
	
	
	
	@FindBy(id="adult_room")
	private WebElement noOfAdult;
	
	
	@FindBy(id="child_room")
	private WebElement noOfChild;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getNoOfAdult() {
		return noOfAdult;
	}

	public WebElement getNoOfChild() {
		return noOfChild;
	}

	public WebElement getSearch() {
		return search;
	}

	
	
	
	
	
	
	

}
