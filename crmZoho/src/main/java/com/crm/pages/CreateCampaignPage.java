package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class CreateCampaignPage {
	
	
	@FindBy(xpath="//input[@name='property(Campaign Name)']") private WebElement campaignName;
	@FindBy(xpath="//td[contains(text(),' Create Campaign')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;
	
	public CreateCampaignPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	
	public WebElement getCampaignName()
	{
		return campaignName;
	}
	
	public void TypeCampaignName(String CampaignName )
	{
		campaignName.sendKeys(CampaignName);
	}
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
   public void clickSaveButton()
   {
	   saveButton.click();
   }
   
   public void CreateNewCampaginPage(String CampaignName )
   {
		campaignName.sendKeys(CampaignName);
		   saveButton.click();

   }
   
   
   
   
   

}
