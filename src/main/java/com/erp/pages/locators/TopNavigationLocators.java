package com.erp.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {

	@FindBy(xpath="//*[contains(text(),'My Profile')]")
	public WebElement myprofile;
	
	@FindBy(xpath="//*[contains(text(),'Leave Apply')]")
	public WebElement leaveapply;
	
	@FindBy(xpath="//*[contains(text(),'WFH Apply')]")
	public WebElement wfhapply;
	
	@FindBy(xpath="//*[contains(text(),'Permission Apply')]")
	public WebElement permissionapply;
	
	@FindBy(xpath="//*[contains(text(),'Compoff Apply')]")
	public WebElement compoffapply;
	
	@FindBy(xpath="//*[contains(text(),'Holidays List')]")
	public WebElement holidayslist;
	
	@FindBy(xpath="//*[contains(text(),'Policies')]")
	public WebElement policies;
	
	@FindBy(xpath="//*[contains(text(),'Form - 12BB')]")
	public WebElement form12bb;
	
	@FindBy(xpath="//*[contains(text(),'Onduty Apply')]")
	public WebElement ondutyapply;
	
	@FindBy(css="div >div:nth-child(2)[class='hc s c wc ct cl']")
	public WebElement validname;
	
	@FindBy(css="div >div:nth-child(2)[class='s t wc hc']")
	public WebElement changepassword;
	
	@FindBy(css="u.s:nth-child(4) > a:nth-child(1) > div:nth-child(1) > s:nth-child(1) > div:nth-child(1) > svg:nth-child(1)")
	public WebElement logout;
	}
