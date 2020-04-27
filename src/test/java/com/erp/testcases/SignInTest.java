package com.erp.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.erp.base.Page;
import com.erp.pages.actions.SigninPage;
import com.erp.utilities.Utilities;

public class SignInTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp",testName="Login into ERP Application")
	public void signInTest(Hashtable<String, String> data) throws Exception {

		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the test as the Run mode is NO");

		}
		Page.initConfiguration();
		SigninPage sip = new SigninPage();
		sip.login(data.get("username"), data.get("password"));
		Thread.sleep(3000);
		Assert.assertEquals(Page.topNav.validname(), data.get("validname"));
	}

	@AfterMethod
	public void tearDown()  {
		if (Page.driver != null) {
			
			  Page.topNav.logout(); 
			  Page.quitBrowser();
			 
		}
	}
}
