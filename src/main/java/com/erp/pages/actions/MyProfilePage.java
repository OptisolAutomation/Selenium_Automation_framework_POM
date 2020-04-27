package com.erp.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.erp.base.Page;
import com.erp.pages.locators.MyProfilePageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class MyProfilePage extends Page {

	public MyProfilePageLocators myProfile;

	public MyProfilePage() {

		this.myProfile = new MyProfilePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.myProfile);

	}

	public void clickProfileInfo() {
		click(myProfile.profileinfo);
		test.log(LogStatus.INFO, "Clicking on : " + myProfile.profileinfo);

	}

	public void clickPersonalInfo() {
		click(myProfile.personalinfo);
		test.log(LogStatus.INFO, "Clicking on : " + myProfile.personalinfo);

	}

	public void clickContactInfo() {
		click(myProfile.contactinfo);
		test.log(LogStatus.INFO, "Clicking on : " + myProfile.contactinfo);

	}
}
