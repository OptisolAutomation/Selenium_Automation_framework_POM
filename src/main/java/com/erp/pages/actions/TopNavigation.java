package com.erp.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.erp.base.Page;
import com.erp.pages.locators.TopNavigationLocators;
import com.relevantcodes.extentreports.LogStatus;

public class TopNavigation {

	public TopNavigationLocators topNavigation;

	public TopNavigation(WebDriver driver) {

		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.topNavigation);

	}

	public MyProfilePage gotomyprofile() {
		Page.click(topNavigation.myprofile);
		Page.test.log(LogStatus.INFO, "Clicking on My profile Button: " + topNavigation.myprofile);
		return new MyProfilePage();
	}

	public LeaveApplyPage leaveApply() {
		Page.click(topNavigation.leaveapply);
		Page.test.log(LogStatus.INFO, "Clicking on Leave Apply Button: " + topNavigation.leaveapply);
		return new LeaveApplyPage();
	}

	public HolidayListPage gotoHolidayList() {
		Page.click(topNavigation.holidayslist);
		Page.test.log(LogStatus.INFO, "Clicking on Holiday List Button: " + topNavigation.holidayslist);
		return new HolidayListPage();
	}

	public PoliciesPage gotoPolicies() {
		Page.click(topNavigation.policies);
		Page.test.log(LogStatus.INFO, "Clicking on : Policies Button " + topNavigation.holidayslist);
		return new PoliciesPage();
	}

	public Form12BBPage gotoForm12BB() {
		Page.click(topNavigation.form12bb);
		Page.test.log(LogStatus.INFO, "Clicking on : Form 12BB Button " + topNavigation.form12bb);
		return new Form12BBPage();
	}

	public String validname() {

		return topNavigation.validname.getText();
	}

	public void logout() {

		Page.click(topNavigation.logout);
		Page.test.log(LogStatus.INFO, "Clicking on Logout Button ");
	}

	public WFHApplyPage gotoWFHApply() {
		Page.click(topNavigation.wfhapply);
		Page.test.log(LogStatus.INFO, "Clicking on WFH Apply Button: " + topNavigation.wfhapply);
		return new WFHApplyPage();
	}

	public PermissionApplyPage gotoPermissionApply() {
		Page.click(topNavigation.permissionapply);
		Page.test.log(LogStatus.INFO, "Clicking on  Permission Apply Button: " + topNavigation.permissionapply);
		return new PermissionApplyPage();
	}

	public CompOffApplyPage gotoCompoffApply() {
		Page.click(topNavigation.compoffapply);
		Page.test.log(LogStatus.INFO, "Clicking on Compoff Apply Button: " + topNavigation.compoffapply);
		return new CompOffApplyPage();
	}

	public OndutyApplyPage gotoondutyApply() {
		Page.click(topNavigation.ondutyapply);
		Page.test.log(LogStatus.INFO, "Clicking on Onduty Apply Button : " + topNavigation.ondutyapply);
		return new OndutyApplyPage();
	}
}
