package com.erp.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.erp.base.Page;
import com.erp.pages.actions.PoliciesPage;
import com.erp.pages.actions.SigninPage;

public class PoliciesPageTest {
	PoliciesPage pp= new PoliciesPage();

	@BeforeTest
	public void login() {
		Page.initConfiguration();
		SigninPage sip = new SigninPage();
		sip.doLogin("Anitha.Selvakumar@revolutionit.com.au", "Ani@revit20");

	}

	@Test
	public void PoliciesDownload() throws Exception {

		PoliciesPage pp= new PoliciesPage();
	//	pp.getPoliciesHeader();
		Page.topNav.gotoPolicies();
		Thread.sleep(3000);
		pp.downloadlink();
		
	}
	
	@AfterTest
	public void tearDown()  {
		if (Page.driver != null) {
			Page.topNav.logout();
			Page.quitBrowser();
		}
	}

}
