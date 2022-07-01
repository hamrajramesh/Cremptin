package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class LeadsPage {
	
	@FindBy(xpath="//td[contains(text(),'Leads: ')]") private WebElement leadsPageAddress;
	@FindBy(xpath="//input[@value='New Lead']") private WebElement newLeadButton;
	
	public WebElement getNewLeadButton()
	{
		return newLeadButton;
	}
	
	public void clickNewLeadButton()
	{
		newLeadButton.click();
	}

	public LeadsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getLeadsTextAddress()
	{
		return leadsPageAddress;
	}
	
	public String getLeadsText()
	{
		return leadsPageAddress.getText();
	}

}
