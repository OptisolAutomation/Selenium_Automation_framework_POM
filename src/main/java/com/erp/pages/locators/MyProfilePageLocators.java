package com.erp.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePageLocators {

	@FindBy(xpath="//div[contains(text(),'Profile Info')]")
    public WebElement profileinfo;
	
	@FindBy(xpath="//div[contains(text(),'Personal Info')]")
    public WebElement personalinfo;
	
	@FindBy(xpath="//div[contains(text(),'Contact Info')]")
    public WebElement contactinfo;
	
	@FindBy (xpath="//div[contains(text(),'Daily Attendance')]")
	public WebElement dailyattendance;
	
	@FindBy (xpath="//div[contains(text(),'Leave Info')]")
	public WebElement leaveinfo;
	
	@FindBy (xpath="//div[contains(text(),'Work Permission Info')]")
	public WebElement workpermissioninfo;
	
	@FindBy (xpath="//div[contains(text(),'On-duty Info')]")
	public WebElement ondutyinfo;
	
	@FindBy (xpath="//div[(text()='Attendance')]")
	public WebElement attendance;
	
	@FindBy (xpath="//div[contains(text(),'Work From Home Info')]")
	public WebElement wfhinfo;
	
	@FindBy (xpath="//div[contains(text(),'Payslips')]")
	public WebElement payslips;
	
	@FindBy (xpath="//div[contains(text(),'Daily Attendance')]")
	public WebElement compoffinfo;
	
	
	
	


}
