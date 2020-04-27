package com.erp.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.erp.base.Page;
import com.erp.pages.locators.PoliciesPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class PoliciesPage extends Page {
	public PoliciesPageLocators policiesPage;

	public PoliciesPage() {

		this.policiesPage = new PoliciesPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.policiesPage);

	}

	public void getPoliciesHeader() {
		Assert.assertEquals(policiesPage.policiesheader, "Policies");
		test.log(LogStatus.INFO, "Validating Header : " + policiesPage.policiesheader + " Actual Value is Policies");
	}
public void downloadlink() {
	click(policiesPage.downloadlink);
	test.log(LogStatus.INFO, "Clicking on Download Link: " + policiesPage.downloadlink);
}
}
