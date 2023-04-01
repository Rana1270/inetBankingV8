package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DepositeCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DepositeAmountTest_207 extends BaseClass 
{
	@Test
	public void depositeCustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("User password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		DepositeCustomerPage depamount = new DepositeCustomerPage(driver);
		depamount.clickDeposite();
		depamount.validAcno("119527");
		depamount.depositeAmount("300.00");
		depamount.depositeDes("cash");
		depamount.clicksubmit();
	}
	

}
