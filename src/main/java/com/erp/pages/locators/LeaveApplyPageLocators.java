package com.erp.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveApplyPageLocators {
	
	//locators for selecting elements to apply leave
		@FindBy(xpath = ".//div[normalize-space(text())='Leave Type']//following-sibling::div//select")
		public WebElement selectleavetype;
		
		@FindBy(css="div >select>option:nth-child(2)")
		public WebElement casualleave;
		
		@FindBy(css="div >select>option:nth-child(3)")
		public WebElement sickleave;
		
		@FindBy(css = "#leave-date-from")
		public WebElement durationfrom;
		
		@FindBy(css = "#leave-date-to")
		public WebElement durationto;
		
		@FindBy(xpath = "//div[contains(text(),'Half Day')]")
		public WebElement halfday;
		
		@FindBy(xpath = "//input[@placeholder='Reason']")
		public WebElement reason;
		
		@FindBy(css = "div[role='button']  .hc.s.t.wc")
		public WebElement save;
		
		@FindBy(xpath="//div[.='20']")
		public WebElement date;
		
		@FindBy(xpath="//div[contains(text(),'Morning')]")
		public WebElement morning;

		@FindBy(xpath="//div[contains(text(),'Afternoon')]")
		public WebElement afternoon;

}
