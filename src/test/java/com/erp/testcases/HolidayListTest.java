package com.erp.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.erp.base.Page;
import com.erp.pages.actions.HolidayListPage;
import com.erp.pages.actions.SigninPage;

public class HolidayListTest {
	@BeforeTest
	public void login() {
		Page.initConfiguration();
		SigninPage sip = new SigninPage();
		sip.doLogin("Anitha.Selvakumar@revolutionit.com.au", "Ani@revit20");
		HolidayListPage hlp = new HolidayListPage();

	}

	@Test(testName="Get Names in Holiday List Page")
	public void getHolidayNames() throws Exception {
		Page.topNav.gotoHolidayList();

		HolidayListPage hlp = new HolidayListPage();
		Thread.sleep(3000);
		hlp.getHolidayNames();
		hlp.clickbackbtn();

	}

	@AfterTest
	public void tearDown() {
		if (Page.driver != null) {
			Page.topNav.logout();
			Page.quitBrowser();
		}

	}
}
