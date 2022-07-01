package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class CampaignsPage {
	
	@FindBy(xpath="//input[@value='New Campaign']") private WebElement newCampaignButton;
	
	
	public CampaignsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getNewCampaignButton()
	{
	  return newCampaignButton;
	}
	
	public void clickNewCampaignButton()
	{
		newCampaignButton.click();
	}
	
	
	
	
	
	
	
	
	
}
