package com.erp.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.erp.base.Page;
import com.erp.pages.locators.Form12BBPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class Form12BBPage extends Page {
	
public Form12BBPageLocators form12BBPage;
	

	public Form12BBPage(){
		
		this.form12BBPage = new Form12BBPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.form12BBPage);
		
	}

	public void clickListViewBtn() {
		click(form12BBPage.listviewbtn);
		test.log(LogStatus.INFO, "Clicking on List View Button : " + form12BBPage.listviewbtn);
	}
	
	public void clickBackBtn() {
		click(form12BBPage.backbtn);
		test.log(LogStatus.INFO, "Clicking on List View Button : " + form12BBPage.backbtn);
	}
	
	public void clickApprovedBtn() {
		click(form12BBPage.approvedbtn);
		test.log(LogStatus.INFO, "Clicking on List View Button : " + form12BBPage.approvedbtn);
	}
	
	public void clickAppliedBtn() {
		click(form12BBPage.appliedbtn);
		test.log(LogStatus.INFO, "Clicking on List View Button : " + form12BBPage.appliedbtn);
	}
	
	public void clickRejectedBtn() {
		click(form12BBPage.rejectedbtn);
		test.log(LogStatus.INFO, "Clicking on List View Button : " + form12BBPage.rejectedbtn);
	}
}
