package com.erp.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.erp.base.Page;
import com.erp.pages.actions.Form12BBPage;
import com.erp.pages.actions.SigninPage;

public class Form12BBTest {

	@BeforeTest
	public void login() {
		Page.initConfiguration();
		SigninPage sip = new SigninPage();
		sip.doLogin("Anitha.Selvakumar@revolutionit.com.au", "Ani@revit20");
		
	}
	@Test (testName="Clicking on the buttons in Form12BB")
	public void clickonButtonsForm12BB() throws Exception {
		Page.topNav.gotoForm12BB();
		Thread.sleep(3000);
		Form12BBPage fbb= new Form12BBPage();
		fbb.clickListViewBtn();
		Thread.sleep(3000);
		fbb.clickApprovedBtn();
		Thread.sleep(3000);
		fbb.clickAppliedBtn();
		Thread.sleep(3000);
		fbb.clickRejectedBtn();
		Thread.sleep(3000);
		fbb.clickBackBtn();
	}
	
	@AfterTest
	public void tearDown()  {
		if (Page.driver != null) {
			Page.topNav.logout();
			Page.quitBrowser();
		}
	}
}
