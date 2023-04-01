package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewAccountPage;
import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddNewAccountTest_206 extends BaseClass
{

	@Test
	public void addNewAccount() throws InterruptedException, IOException
	{

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("User password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddNewAccountPage addnewac =new AddNewAccountPage(driver);
		logger.info("new customer is providing info");
		addnewac.clickNewAccount();
		logger.info("elemeht is clicked");
		addnewac.custvalidid("18953");
		logger.info("customer id is provided");
		Thread.sleep(3000);
		addnewac.selectAccountType("Current");
		Thread.sleep(2000);
		addnewac.inideposite("5000.00");
		addnewac.custsubmit();
		
		Thread.sleep(2000);
		
		logger.info("validation is started");
		
		boolean acgen = driver.getPageSource().contains("Account Generated Successfully!!!");
		if(acgen==true)
		{
			Assert.assertTrue(true);
			logger.info("test case is passed");
		}
		else
		{
			captureScreen(driver,"addNewAccount");
			Assert.assertTrue(false);
			logger.info("test case is failed");
		}
				
	}
}
