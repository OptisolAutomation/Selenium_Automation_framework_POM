package com.erp.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompOffApplyPageLocators {

	@FindBy (css="#from-date-comp")
	public WebElement compoffdate;
	
	@FindBy (xpath="//div[.='20']")
	public WebElement selectdate;
	
	@FindBy (xpath="//input[@placeholder='Reason']")
	public WebElement reason;
	
	@FindBy (xpath="//div[contains(text(),'Save')]")
	public WebElement save;

	@FindBy (xpath="//div[contains(text(),'Half Day')]")
	public WebElement Halfday;

	@FindBy (xpath="//div[contains(text(),'Morning')]")
	public WebElement morning;
	
	@FindBy (xpath="//div[contains(text(),'Afternoon')]")
	public WebElement afternoon;
	
}
