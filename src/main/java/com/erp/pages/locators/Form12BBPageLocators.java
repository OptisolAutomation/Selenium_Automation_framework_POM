package com.erp.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Form12BBPageLocators {
	
	@FindBy(xpath="//div[contains(text(),'List View')]")
	public WebElement listviewbtn;
	
	@FindBy(xpath=" //div[contains(text(),'back')]")
	public WebElement backbtn;
	
	@FindBy(xpath="//div[contains(text(),'Applied')]")
	public WebElement appliedbtn;
	

	@FindBy(xpath="//div[contains(text(),'Approved')]")
	public WebElement approvedbtn;
	

	@FindBy(xpath="//div[contains(text(),'Rejected')]")
	public WebElement rejectedbtn;
	
}
