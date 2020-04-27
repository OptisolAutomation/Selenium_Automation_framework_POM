package com.erp.rough;

import org.testng.Assert;

import com.erp.base.Page;
import com.erp.pages.actions.CompOffApplyPage;
import com.erp.pages.actions.SigninPage;

public class login {

	public static void main(String[] args) throws Exception {

		Page.initConfiguration();
		SigninPage sip = new SigninPage();
		sip.doLogin("Anitha.Selvakumar@revolutionit.com.au", "Ani@revit20");
		Assert.assertEquals(Page.topNav.validname(), "Anitha S");
		CompOffApplyPage cap= new CompOffApplyPage();
		Page.topNav.gotoCompoffApply();
		cap.compOffApply("2020-04-20", "Complete Work", "Y", "afternoon");
	}
		
		/*
		 * WFHApplyPage wfhpl= new WFHApplyPage(); Page.topNav.gotoWFHApply();
		 * wfhpl.applyWFH("2020-04-20", "7.00", "16:00", "8.00", "WFH Covid19");
		 */
		
		/*
		 * LeaveApplyPage lap = new LeaveApplyPage(); Page.topNav.leaveApply();
		 * lap.leaveApply("Sick Leaves", "2020-04-30", "2020-04-30", "N", "Afternoon",
		 * "Personal");
		 */
		/*
		 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy/MM/dd" );
		 * LocalDate localDate = LocalDate.parse( "2020/04/12" , formatter ); int year =
		 * localDate.getYear(); int month = localDate.getMonthValue(); int dayOfMonth =
		 * localDate.getDayOfMonth(); System.out.println(year);
		 * System.out.println(month); System.out.println(dayOfMonth);
		 * Page.driver.findElement(By.cssSelector("#leave-date-from")).click();
		 * Page.driver.findElement(By.cssSelector("##leave-date-to")).click();
		 * //Page.driver.findElement(By.xpath("//div[.='+dayOfMonth+']")).click();
		 * //public WebElement durationfrom;
		 */
		
		/*
		 * HolidayListPage hlp = new HolidayListPage(); Page.topNav.gotoHolidayList();
		 * Thread.sleep(5000); hlp.getHolidayNames();
		 */
		/*
		 * Thread.sleep(3000); MyProfilePage map = new MyProfilePage();
		 * map.clickPersonalInfo(); Thread.sleep(3000); map.clickContactInfo();
		 * Thread.sleep(3000); map.clickProfileInfo(); Thread.sleep(3000);
		 */
		/*
		 * PoliciesPage pp= new PoliciesPage(); Page.topNav.gotoPolicies();
		 * Thread.sleep(3000); pp.downloadlink();
		 */
}