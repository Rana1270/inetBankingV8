package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
	WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver)	
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath ="//a[normalize-space()='Edit Customer']")
	@CacheLookup
	WebElement linkEditCustomer;
	
	@FindBy(name="cusid")
	@CacheLookup
	WebElement txtCustomervalidid;
	
	@FindBy(name="AccSubmit")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement clickSubmit;
	
	public void clickEditCustomer()
	{
		linkEditCustomer.click();
	}
	public void custvalidid(String cvalidid)
	{
		txtCustomervalidid.sendKeys(cvalidid);
	}
	public void custidsubmit()
	{
		btnSubmit.click();
	}
	public void custEditaddress(String eaddress)
	{
		txtaddress.sendKeys(eaddress);
	}
	public void custEditcity(String ecity)
	{
		txtaddress.sendKeys(ecity);
	}
	public void custEditstate(String estate)
	{
		txtaddress.sendKeys(estate);
	}
	public void editbtnsubmit()
	{
		clickSubmit.click();
	}
	
	
	
	
	
	
	
	
	

}
