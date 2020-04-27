package com.erp.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.erp.base.Page;
import com.erp.pages.actions.CompOffApplyPage;
import com.erp.pages.actions.SigninPage;
import com.erp.utilities.Utilities;

public class CompOffApplyTest {
	@BeforeMethod
	public void login() {
		Page.initConfiguration();
		SigninPage sip = new SigninPage();
		sip.doLogin("Anitha.Selvakumar@revolutionit.com.au", "Ani@revit20");
		
	}
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority=1)
	public void compOffApplyTest(Hashtable<String, String> data) throws Throwable {

		if (data.get("runmode").equalsIgnoreCase("N")) {
			throw new SkipException("Skipping the test as the Run mode is NO");
		}
		CompOffApplyPage cap = new CompOffApplyPage();
		Page.topNav.gotoCompoffApply();
		cap.compOffApply(data.get("compoffdate"), data.get("reason"),data.get("halfday"), data.get("session"));
	}
	

	@AfterMethod
	public void tearDown()  {
		if (Page.driver != null) {
			Page.topNav.logout();
			Page.quitBrowser();
		}
	}

}
