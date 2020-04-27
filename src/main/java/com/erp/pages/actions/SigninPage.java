package com.erp.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.erp.base.Page;
import com.erp.pages.locators.SigninPageLocators;
import com.relevantcodes.extentreports.LogStatus;

public class SigninPage extends Page {
	
	
	public SigninPageLocators signinPage;
	

	public SigninPage(){
		
		this.signinPage = new SigninPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.signinPage);
		
	}
	
	public void doLogin(String username,String password){
		
		
		type(signinPage.email,username);
		//test.log(LogStatus.INFO, "Typing in : " + signinPage.email + " entered value as " + username);
		type(signinPage.password,password);
		//test.log(LogStatus.INFO, "Typing in : " + signinPage.password + " entered value as **********" );
		click(signinPage.submit);
		//test.log(LogStatus.INFO, "Clicking on : " + signinPage.submit);
		
	}
	
public void login(String username,String password){
		
		
		type(signinPage.email,username);
		test.log(LogStatus.INFO, "Typing in : " + signinPage.email + " entered value as " + username);
		type(signinPage.password,password);
		test.log(LogStatus.INFO, "Typing in : " + signinPage.password + " entered value as ********** " );
		click(signinPage.submit);
		test.log(LogStatus.INFO, "Clicking on : " + signinPage.submit);
		
	}

}
