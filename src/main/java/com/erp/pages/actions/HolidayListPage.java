package com.erp.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.erp.base.Page;
import com.erp.pages.locators.HolidayListPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class HolidayListPage extends Page {

	public HolidayListPageLocators hlp;

	public HolidayListPage() {

		this.hlp = new HolidayListPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.hlp);
		//topNav.gotoHolidayList();
	}

	public void validateHeader() {
		Assert.assertEquals(hlp.holidaylistheader, "Holiday List");
		test.log(LogStatus.INFO, "Header Matches : " + hlp.holidaylistheader);

	}

	public void clickbackbtn() {
		click(hlp.backbtn);
		test.log(LogStatus.INFO, "Clicking on : " + hlp.backbtn);

	}
	
	public void getHolidayNames() {
		String arr[] = new String [15];
		String name;
		for (int i=2; i<=15; i++)
		{
				name= driver.findElement(By.xpath("//div[@class='gp grid-pos-"+i+"-2-1-1 s e']")).getText();
				arr[i-2]=name;
		}
		for (int i=0; i<=14; i++)
		{
			test.log(LogStatus.INFO, "HolidayNames : " + arr[i]);
		}
		
	}
	}
