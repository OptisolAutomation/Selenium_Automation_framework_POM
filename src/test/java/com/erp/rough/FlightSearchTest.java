package com.erp.rough;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.erp.base.Page;
import com.erp.pages.actions.HomePage;

public class FlightSearchTest {
	
	public static void main(String[] args) {
		
		/*
		 * Page.initConfiguration(); HomePage home = new HomePage();
		 * Assert.assertEquals(home.findTabCount(), "6");
		 * home.gotoFlights().bookAFlight("Delhi, India (DEL-Indira Gandhi Intl.)",
		 * "Seattle, WA, United States (SEA-Seattle - Tacoma Intl.)", "12/12/2017",
		 * "14/12/2017", "2", "2"); Page.quitBrowser();
		 */
		//String str = driver.findElement(By.xpath("xpath")).getText();
		String str="Shipping Payment Options";
		 
		assertTrue(str.contains("Shipping"));
		
		
		
	}
	
	

}
