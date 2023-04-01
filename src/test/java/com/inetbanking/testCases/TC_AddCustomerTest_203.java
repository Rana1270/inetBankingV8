package com.inetbanking.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_203 extends BaseClass 
{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("User password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		
		logger.info("customer info is provided");
		addcust.clickAddNewCustomer();
		addcust.custName("Rana");
		addcust.custgender("male");
		addcust.custdob("01", "01", "1988");
		Thread.sleep(3000);
		addcust.custaddress("Zakir");
		addcust.custcity("Fairfax");
		addcust.custstate("VA");
		addcust.custpinno("654321");
		addcust.custtelephoneno("0987654321");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		Thread.sleep(5000);
		addcust.custpassword("lmnop");
		addcust.custsubmit();
		
		Thread.sleep(5000);
		
		logger.info("validation is started.....");
		
		boolean res =driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case is passed");
		}
		else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			logger.info("test case is failed");
		}
	}
	
}









