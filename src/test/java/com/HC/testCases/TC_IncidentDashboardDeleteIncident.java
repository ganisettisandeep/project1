package com.HC.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.HC.pageObjects.LoginPage;
import com.HC.utilities.Constants;
import com.HC.utilities.XLUtils;

public class TC_IncidentDashboardDeleteIncident extends BaseClass {
	@Test
	public void TC_IncidentDashboardDeleteIncident() throws IOException, InterruptedException{
			
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		System.out.println("Entered Username -->" + username);
		Thread.sleep(1000);
		lp.setPassword(password);
		System.out.println("Entered Password --->" + password);
		Thread.sleep(1000);
		logger.info("Entered Password");
		lp.clicksubmit();
		logger.info("Login button pressed");
		Thread.sleep(5000);

		//incident Time
		String timeformat = XLUtils.getCellData(Constants.Path_IncidentData,"TC_IncidentReport", 1,0);
		System.out.println("Time format -->" + timeformat);
		lp.intdate(timeformat);
		Thread.sleep(2000);
		
		//location of incident
		String loc = XLUtils.getCellData(Constants.Path_IncidentData,"TC_IncidentReport", 1, 1);
		System.out.println("loc>" + loc);
		driver.findElement(By.xpath("//*[@class=\"reactSelect__input\" and @aria-describedby=\"react-select-2-placeholder\"]")).sendKeys(loc,Keys.RETURN);
		System.out.println("while selecting");
		System.out.println("after selecting");
		Thread.sleep(2000);
		logger.info("Incident Location entered");
		Thread.sleep(2000);
								
		//for Location details
		String detail = XLUtils.getCellData(Constants.Path_IncidentData,"TC_IncidentReport", 1, 2);
		System.out.println("detail is:"+detail);
		lp.setlocationdetail(detail);
		System.out.println("Location details are set");
		Thread.sleep(2000);
		
		//type of incident
		lp.settypeincident();
		logger.info("Incident type clicked");
		Thread.sleep(2000);
		
		//category
		String cat = XLUtils.getCellData(Constants.Path_IncidentData,"TC_IncidentReport", 1, 3);
		System.out.println("cat is: "+cat);
		driver.findElement(By.xpath("//*[@class=\"reactSelect__input\" and @aria-describedby=\"react-select-3-placeholder\"]")).sendKeys(cat,Keys.RETURN);
		logger.info("Incident Category entered");
		Thread.sleep(2000);
				
		//subcat
		String subcat = XLUtils.getCellData(Constants.Path_IncidentData,"TC_IncidentReport", 1, 4);
		System.out.println("subcat is: "+subcat);
		driver.findElement(By.xpath("//*[@class=\"reactSelect__input\" and @aria-describedby=\"react-select-4-placeholder\"]")).sendKeys(subcat,Keys.RETURN);
		logger.info("Incident sub-category entered");
		
		//description
		String dec = XLUtils.getCellData(Constants.Path_IncidentData,"TC_IncidentReport", 1, 5);
		lp.setincidescrep(dec);
		logger.info("Incident decscription entered");
		Thread.sleep(2000);
		
		//Save
		lp.incidentsave();
		logger.info("Save button clicked");
		Thread.sleep(2500);
		lp.popsave();
		Thread.sleep(2500);
		
		//dashboard
		lp.clickincidentdashboard();
		logger.info("dashboard button clicked");
		Thread.sleep(2500);

		//delete
		lp.deleteButton();
		logger.info("delete button clicked");
		Thread.sleep(2500);
		boolean delete = lp.popClickDelete();
		Thread.sleep(2500);
		Assert.assertTrue(delete);
						
	}
}
