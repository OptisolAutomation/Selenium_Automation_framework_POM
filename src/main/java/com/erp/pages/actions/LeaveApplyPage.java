package com.erp.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.erp.base.Page;
import com.erp.pages.locators.LeaveApplyPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class LeaveApplyPage extends Page {

	public LeaveApplyPageLocators leaveApply;

	public LeaveApplyPage() {

		this.leaveApply = new LeaveApplyPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.leaveApply);

	}

	public void leaveApply(String LeaveType, String DurationFrom, String DurationTo, String Reason, String Halfday,
			String MRN) throws Exception {
		if (Halfday.equalsIgnoreCase("Y")) {
			click(leaveApply.selectleavetype);
			test.log(LogStatus.INFO, "clicking on Select Leave Type: " + leaveApply.selectleavetype);
			if (LeaveType.equalsIgnoreCase("Casual Leaves")) {
				click(leaveApply.casualleave);
				test.log(LogStatus.INFO, "Selecting on Casual Leaves: " + leaveApply.casualleave);
			}
			if (LeaveType.equalsIgnoreCase("Sick Leaves")) {
				click(leaveApply.sickleave);
				test.log(LogStatus.INFO, "Selecting on Sick Leaves:: " + leaveApply.sickleave);
			}
			click(leaveApply.halfday);
			test.log(LogStatus.INFO, "Selecting on Sick Leaves:: " + leaveApply.sickleave);
			click(leaveApply.durationfrom);
			click(leaveApply.date);
			test.log(LogStatus.INFO, "Selecting on From Date:: " + leaveApply.durationfrom);
			if (MRN == "morning") {
				click(leaveApply.morning);
				test.log(LogStatus.INFO, "Clicking on Morning: " + leaveApply.morning);
			} else if (MRN == "afternoon") {
				click(leaveApply.afternoon);
				test.log(LogStatus.INFO, "Clicking on Afternoon: " + leaveApply.afternoon);
			}
			type(leaveApply.reason, Reason);
			test.log(LogStatus.INFO, "Entering Reason: " + Reason);
		} else if (Halfday.equalsIgnoreCase("N")) {
			click(leaveApply.selectleavetype);
			test.log(LogStatus.INFO, "clicking on Select Leave Type: " + leaveApply.selectleavetype);
			if (LeaveType.equalsIgnoreCase("Casual Leaves")) {
				click(leaveApply.casualleave);
				test.log(LogStatus.INFO, "Selecting on Casual Leaves: " + leaveApply.casualleave);
			}
			if (LeaveType.equalsIgnoreCase("Sick Leaves")) {
				click(leaveApply.sickleave);
				test.log(LogStatus.INFO, "Selecting on Sick Leaves:: " + leaveApply.sickleave);
			}
			click(leaveApply.durationfrom);
			test.log(LogStatus.INFO, "Selecting on From Date:: " + leaveApply.durationfrom);
			click(leaveApply.date);
			click(leaveApply.durationto);
			click(leaveApply.date);
			test.log(LogStatus.INFO, "Selecting on From Date:: " + leaveApply.durationto);
			type(leaveApply.reason, Reason);
			test.log(LogStatus.INFO, "Entering Reason: " + Reason);
			// click(leaveApply.save);
		}
	}

}
