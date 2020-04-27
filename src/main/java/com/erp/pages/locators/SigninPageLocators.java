package com.erp.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPageLocators {
	
	
	@FindBy(css="#login")
	public WebElement email;
	@FindBy(css="#password")
	public WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;

}
