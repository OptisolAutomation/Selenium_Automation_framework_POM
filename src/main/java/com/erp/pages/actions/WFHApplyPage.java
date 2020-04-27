package com.erp.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.erp.base.Page;
import com.erp.pages.locators.WFHApplyPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class WFHApplyPage extends Page {

	public WFHApplyPageLocators wfhPageLocators;

	public WFHApplyPage() {

		this.wfhPageLocators = new WFHApplyPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.wfhPageLocators);

	}

	public void applyWFH(String date, String timefrom, String timeto, String totalhrs, String description)
			throws Exception {

		click(wfhPageLocators.wfhdate);
		Thread.sleep(3000);
		//test.log(LogStatus.INFO, "Clicking on : " + wfhPageLocators.wfhdate);
		click(wfhPageLocators.selectdate);
		Thread.sleep(3000);
		//test.log(LogStatus.INFO, "Selecting date : " + wfhPageLocators.selectdate);
		/*
		 * click(wfhPageLocators.timefromwfh); click(wfhPageLocators.selectfromtime);
		 * //test.log(LogStatus.INFO, "Selecting time from : " +
		 * wfhPageLocators.timefromwfh); Thread.sleep(3000);
		 * click(wfhPageLocators.timetowfh); click(wfhPageLocators.selecttotime);
		 * //test.log(LogStatus.INFO, "Selecting time to : " +
		 * wfhPageLocators.timetowfh); Thread.sleep(3000);
		 * type(wfhPageLocators.totalhrs, totalhrs); Thread.sleep(3000);
		 */
		//test.log(LogStatus.INFO, "Typing Total Hours : " + wfhPageLocators.totalhrs + "Value = " + totalhrs);
		type(wfhPageLocators.description, description);
		Thread.sleep(3000);
		//test.log(LogStatus.INFO, "Typing Total Hours : " + wfhPageLocators.totalhrs + "Value = " + totalhrs);
		//click(wfhPageLocators.save);
		//test.log(LogStatus.INFO, "Clicking Save : " + wfhPageLocators.save);
	}
}
