package com.erp.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HolidayListPageLocators {
	
	@FindBy(xpath="//div[@class='hc font-size-42 fc-245-130-31-255 s e wc']")
public WebElement holidaylistheader;
	
	@FindBy(xpath="//div[contains(text(),'back')]")
	public WebElement backbtn;
	
}
