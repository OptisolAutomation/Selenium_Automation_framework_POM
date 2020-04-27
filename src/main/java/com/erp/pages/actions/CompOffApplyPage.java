package com.erp.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.erp.base.Page;
import com.erp.pages.locators.CompOffApplyPageLocators;

public class CompOffApplyPage extends Page {

	public CompOffApplyPageLocators compoffApply;

	public CompOffApplyPage() {

		this.compoffApply = new CompOffApplyPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.compoffApply);

	}

	public void compOffApply(String compoffdate, String reason, String halfday, String session) throws Exception {
		click(compoffApply.compoffdate);
		click(compoffApply.selectdate);
		//click(compoffApply.selectdate);
		Thread.sleep(5000);
		if (halfday.equalsIgnoreCase("y")) {
			click(compoffApply.Halfday);
			Thread.sleep(3000);
			if (session == "morning") {
				click(compoffApply.morning);
			} else if (session == "afternoon") {
				click(compoffApply.afternoon);
			}
		}
		type(compoffApply.reason, reason);
		// click(compoffApply.save);
	}
}
