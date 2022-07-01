package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class LeadDatailsPage {
	
	
	@FindBy(xpath="//td[contains(text(),'Lead Name')]/following-sibling::td") private WebElement leadName;
    
    public LeadDatailsPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    public WebElement getLeadName()
    {
       return leadName;
    }
    
    public String  getLeadNameText()
    {
    	return leadName.getText();
    }
    
    
    
}
