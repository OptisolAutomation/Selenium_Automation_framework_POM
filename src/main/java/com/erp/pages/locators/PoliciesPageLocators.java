package com.erp.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PoliciesPageLocators {

	@FindBy(css = ".font-size-42 > div:nth-child(1)")
	public WebElement policiesheader;
	
	@FindBy(xpath = "//div[@class='s t wc hc'][contains(text(),'Download')]")
	public WebElement downloadlink;

}
