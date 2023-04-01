package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewAccountPage {
	
	WebDriver rdriver;
	
	public AddNewAccountPage(WebDriver ldriver)
	{
		ldriver = rdriver;
		PageFactory.initElements( ldriver,this);
	}
	@FindBy(xpath="/html/body/div[3]/div/ul/li[5]/a")
	@CacheLookup
	WebElement linkAddNewAccount;
	
	@FindBy(name="cusid")
	@CacheLookup
	WebElement txtCustomervalidid;
	
	@FindBy(name="selaccount")
	@CacheLookup
	WebElement ddAccounttype;
	
	@FindBy(xpath="//option[@value='Current']")
	@CacheLookup
	WebElement ddAccountCurrent;
	
	@FindBy(name="inideposit")
	@CacheLookup
	WebElement textinideposit;
	
	@FindBy(name="button2")
	@CacheLookup
	WebElement btnsubmit;
	
	public void clickNewAccount() 
	{
		linkAddNewAccount.click();
	}
	public void custvalidid(String cvalidid) 
	{
		txtCustomervalidid.sendKeys(cvalidid);
	}
	public void custAccount()
	{
		ddAccounttype.click();
	}
	public void selectAccountType(String Current) 
	{
		Select select = new Select(ddAccounttype);
		select.selectByVisibleText(Current);
	}
	public void inideposite(String inicustdeposite)
	{
		textinideposit.sendKeys(String.valueOf(inicustdeposite));
	}
	public void custsubmit()
	{
		btnsubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
