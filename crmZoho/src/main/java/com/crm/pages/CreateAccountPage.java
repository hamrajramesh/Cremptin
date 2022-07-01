package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class CreateAccountPage {
	

@FindBy(xpath="//input[@name='property(Account Name)']") private WebElement accountNameTextBox;
@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accountNameLookupTab;
@FindBy(xpath="//td[contains(text(),' Create Account')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;


public CreateAccountPage()
{
	PageFactory.initElements(BaseTest.driver, this);
	
}

public WebElement getAccountNameTextBox()
{

   return accountNameTextBox;
}

public void TypeAccountNameTextBox(String AccountName )
{
	accountNameTextBox.sendKeys(AccountName);   
}


public WebElement getSaveButton()
{
	 return saveButton;
}

public void clickSaveButton()
{
	saveButton.click();
}



public void CreateNewAccountPage(String AccountName )
{
	
	accountNameTextBox.sendKeys(AccountName); 
	saveButton.click();


    	
}

public void clickAccountNameLookupTab()
{
	accountNameLookupTab.click();
}




















}