package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_204 extends BaseClass {
	
	@Test
	public void editCustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("User password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		EditCustomerPage editcust = new EditCustomerPage(driver);
		logger.info("customer able to edit");
		editcust.clickEditCustomer();
		
		editcust.custvalidid("67845");
		Thread.sleep(3000);
		editcust.custidsubmit();
		editcust.custEditaddress("Vienna");
		editcust.custEditcity("Woodbridge");
		editcust.custEditstate("NC");
		
		Thread.sleep(3000);
		
		boolean edi=driver.getPageSource().contains("Edit Customer");
		if(edi==true)
		{
			Assert.assertTrue(true);
			logger.info("test case is passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("test case is failed");
		}
		
	}

}
