package com.erp.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WFHApplyPageLocators {
	
	@FindBy (css="#date-from-wfh")
	public WebElement wfhdate;
	
	@FindBy (css="#time-from-wfh")
	public WebElement timefromwfh;
	
	@FindBy (css=" //div[@class='xdsoft_time xdsoft_current'][contains(text(),'08:30')]")
	public WebElement selectfromtime;
	
	@FindBy (css="#time-to-wfh")
	public WebElement timetowfh;
	
	@FindBy (css=" //div[@class='xdsoft_time xdsoft_current'][contains(text(),'5:30')]")
	public WebElement selecttotime;
	
	@FindBy (xpath="//input[@placeholder='Total Hours']")
	public WebElement totalhrs;
	
	@FindBy (xpath="//input[@placeholder='Description']")
	public WebElement description;
	
	@FindBy (xpath="//div[contains(text(),'Save')]")
	public WebElement save;
	
	@FindBy (xpath="//div[.='12']")
	public WebElement selectdate;
}
