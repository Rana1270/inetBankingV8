package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
	WebDriver ldriver;
	
	public DeleteCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath ="//a[normalize-space()='Delete Customer']")
	@CacheLookup
	WebElement linkDeleteCustomer;
	
	@FindBy(name="cusid")
	@CacheLookup
	WebElement txtCustomervalidid;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickDeleteCustomer()
	{
		linkDeleteCustomer.click();
	}
	public void custvalidid(String cvalidid)
	{
		txtCustomervalidid.sendKeys(cvalidid);
	}
	public void custidsubmit()
	{
		btnSubmit.click();
	}
	
	

}











