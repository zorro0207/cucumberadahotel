package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUser;
	@FindBy(id="password")
	private WebElement txtpass;
	@FindBy(id="login")
	private WebElement btnLogn;
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnLogn() {
		return btnLogn;
	}
	

}
