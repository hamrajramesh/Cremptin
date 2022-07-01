package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class AccountsPage {
	
	
	@FindBy(xpath="//td[contains(text(),'Accounts: ')]") private WebElement AccountsPageAddress;
	@FindBy(xpath="//input[@value='New Account']") private WebElement newAccountButton;
	
	public AccountsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getAccountsPageAddress() 
	{
		return AccountsPageAddress;
	}
	
	public String getAccountsPageText()
	{
		return AccountsPageAddress.getText();
	}
	
	public WebElement getNewAccountButton()
	{
		return newAccountButton;
	}
	
	public void clickNewAccountButton()
	{
		newAccountButton.click();
	}
	
	

}
