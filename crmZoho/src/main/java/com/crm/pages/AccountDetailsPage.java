package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class AccountDetailsPage {
	
	
	@FindBy(xpath="//td[contains(text(),'Account Name')]/following-sibling::td[1]") private WebElement accountName;
	
	public AccountDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getAccountName()
	{
		return accountName;
	}
	
	
	public String getAccountNameText()
	{
		return accountName.getText();
	}
	
	
	
	
	
	

}
