/*
 * package com.erp.testcases;
 * 
 * import java.util.Hashtable;
 * 
 * import org.testng.annotations.AfterMethod; import
 * org.testng.annotations.AfterTest; import org.testng.annotations.BeforeTest;
 * import org.testng.annotations.Test;
 * 
 * import com.erp.base.Page; import com.erp.errorcollectors.ErrorCollector;
 * import com.erp.pages.actions.HomePage; import com.erp.utilities.Utilities;
 * 
 * public class FlightSearchTest {
 * 
 * @BeforeTest public void setUp(){
 * 
 * Page.initConfiguration(); }
 * 
 * @Test(dataProviderClass=Utilities.class,dataProvider="dp") public void
 * flightSearchTest(Hashtable<String,String> data) {
 * 
 * 
 * System.out.println("Printing no of adults and children : "+data.get(
 * "noOfAdults")+"---"+ data.get("noOfChildern"));
 * 
 * HomePage home = new HomePage();
 * ErrorCollector.verifyEquals(home.findTabCount(), 5);
 * home.gotoFlights().bookAFlight(data.get("fromCity"), data.get("toCity"),
 * data.get("fromDate"), data.get("toDate"), data.get("noOfAdults"),
 * data.get("noOfChildern"));
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * @AfterMethod public void tearDown(){ if(Page.driver!=null){
 * Page.quitBrowser(); } }
 * 
 * 
 * }
 */