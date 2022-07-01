package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class PotentialsPage {
	
	
    @FindBy(xpath="//input[@value='New Potential']") private WebElement newPotentialsButton;
	
    public 	PotentialsPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }
    
    
	
    public WebElement getNewPotentialsButton()
    {
    	return newPotentialsButton;
    }
    
    
    
    public void clickNewPotentialsButton()
    {
    	newPotentialsButton.click();
    }

}
