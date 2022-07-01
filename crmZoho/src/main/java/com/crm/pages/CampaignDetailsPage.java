package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class CampaignDetailsPage {
	
	@FindBy(xpath="//td[contains(text(),'Campaign Name')]/following-sibling::td[1]") private WebElement campaignNameText;
	
	public CampaignDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getCampaignName()
	{
		return campaignNameText;
	}
	
	public String getCampaignNameText()
	{
		return campaignNameText.getText();
	}
	
	
	

}
