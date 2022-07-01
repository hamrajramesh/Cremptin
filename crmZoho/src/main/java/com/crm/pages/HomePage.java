package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class HomePage {
	
	
	@FindBy(xpath="//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath="//a[text()='Accounts']") private WebElement accountsTab;
	@FindBy(xpath="//a[text()='Contacts']") private WebElement contactsTab;
	@FindBy(xpath="//a[contains(text(),'Campaigns')]") private WebElement campaignsTab;
	@FindBy(xpath="//a[text()='Dashboards']") private WebElement dashboardsTab;
	@FindBy(xpath="//a[text()='Quotes']") private WebElement quotesTab;
	@FindBy(id="scrollright") private WebElement scrollrightButton;
	@FindBy(xpath="//a[text()='Potentials']") private WebElement potentialsTab;
	@FindBy(xpath="//a[text()='Solutions']") private WebElement solutionsTab;
	
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public WebElement getSolutionsTab()
	{
		return solutionsTab;
	}
	
	public void clickSolutionsTab()
	{
		
		solutionsTab.click();
	}
	
	  public WebElement getPotentialsTab()
	    {
	    	return potentialsTab;
	    }
	  
	  public void clickPotentialsTab()
	    {
	    	potentialsTab.click();
	    }

	
   public WebElement  getDashboardsTab()
   {
	   return dashboardsTab;
   }
   
   public void clickDashboardsTab()
   {
	   dashboardsTab.click();
   }

	public WebElement getLeadsTab() 
	{
		return leadsTab;
	}
	
	public void clickLeadsTab()
	{
		leadsTab.click();
	}


	public WebElement getAccountsTab() 
	{
		return accountsTab;
	}
	
	public void clickAccountsTab()
	{
		accountsTab.click();
	}
	
	public WebElement getContactsTab()
	{
		return contactsTab;
	}
	
	public void clickContactsTab()
	{
		contactsTab.click();
	}
	
	public WebElement getCampaignsTab()
	{
		return campaignsTab;
	}
	
	public void clickCampaignsTab()
	{
		campaignsTab.click();
	}
	
	public WebElement getScrollrightButton()
	{
		return scrollrightButton;
	}
	
	public WebElement getQuotesTab()
	{
		return quotesTab;
	}
	
	public void clickScrollrightButton()
	{
		scrollrightButton.click();
	}
	
	public void clickQuotesTab()
	{
		quotesTab.click();
	}
	
	public void clickQuotesElement()
	{
		for(int i=0;i<=20;i++)
		{
			if(getQuotesTab().isDisplayed())
			{
				clickQuotesTab();
				break;
			}
			else
			{
				
				clickScrollrightButton();
				
			}
			
		}
	}
	
	public void clickSolutionsElement()
	{
		for(int i=0;i<=20;i++)
		{
			if(getSolutionsTab().isDisplayed())
			{
				clickSolutionsTab();
				break;
			}
			else
			{
				clickScrollrightButton();
			}
		}
	}
	
	
	
	
	
	
	
}
