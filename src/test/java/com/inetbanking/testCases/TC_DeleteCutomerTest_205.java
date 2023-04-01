package com.inetbanking.testCases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DeleteCutomerTest_205 extends BaseClass
{

	@Test
	public void deleteCustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("User password is provided");
		lp.clickSubmit();
		
		Thread.sleep(5000);
		
		DeleteCustomerPage delcust = new DeleteCustomerPage(driver);
		delcust.clickDeleteCustomer();
	
		
		delcust.custvalidid("47736");
		Thread.sleep(3000);
		delcust.custidsubmit();
		Thread.sleep(2000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			Assert.assertTrue(true);
			logger.info("Delete customer test is passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Delete customer test is failed");
		}
		
		
	}
	public boolean isAlertPresent()
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	

}


