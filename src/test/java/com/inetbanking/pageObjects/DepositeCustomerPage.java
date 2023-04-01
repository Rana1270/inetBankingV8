package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositeCustomerPage {
	
	WebDriver ldriver;
	
	public DepositeCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Deposit']")
	@CacheLookup
	WebElement linkCustomerDeposite;
	
	@FindBy(name="accountno")
	@CacheLookup
	WebElement depAccountno;

	@FindBy(name="ammount")
	@CacheLookup
	WebElement depAmount;
	
	@FindBy(name="desc")
	@CacheLookup
	WebElement depDescript;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement clickSubmit;
	
	public void clickDeposite()
	{
		linkCustomerDeposite.click();
	}
	public void validAcno(String custacno)
	{
		depAccountno.sendKeys(String.valueOf(custacno));
	}
	public void depositeAmount(String camount)
	{
		depAccountno.sendKeys(String.valueOf(camount));
	}
	public void depositeDes(String cdescrip)
	{
		depDescript.sendKeys(cdescrip);
	}
	public void clicksubmit()
	{
		clickSubmit.click();
	}
	
}




