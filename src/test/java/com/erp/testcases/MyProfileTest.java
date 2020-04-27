package com.erp.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.erp.base.Page;
import com.erp.pages.actions.MyProfilePage;
import com.erp.pages.actions.SigninPage;

public class MyProfileTest {
	
	@BeforeTest
	public void login() {
		Page.initConfiguration();
		SigninPage sip = new SigninPage();
		sip.doLogin("Anitha.Selvakumar@revolutionit.com.au", "Ani@revit20");
		
	}

	/*
	 * @Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority=1)
	 * public void signInTest(Hashtable<String, String> data) {
	 * 
	 * if (data.get("runmode").equalsIgnoreCase("N")) {
	 * 
	 * throw new SkipException("Skipping the test as the Run mode is NO");
	 * 
	 * } Page.initConfiguration(); SigninPage sip = new SigninPage();
	 * sip.doLogin(data.get("username"), data.get("password"));
	 * Assert.assertEquals(Page.topNav.validname(), data.get("validname"));
	 * 
	 * }
	 */
	
	@Test (testName="Check Tabs in My profile Page")
	public void checkprofileinfo() {
		MyProfilePage mpp= new MyProfilePage();
		mpp.clickPersonalInfo();
		mpp.clickContactInfo();
		mpp.clickProfileInfo();	
	}
	
	@AfterTest
	public void tearDown()  {
		if (Page.driver != null) {
			Page.topNav.logout();
			Page.quitBrowser();
		}
	}
}

