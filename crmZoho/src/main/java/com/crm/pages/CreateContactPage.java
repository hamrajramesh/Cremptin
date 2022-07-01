package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class CreateContactPage {
	

@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lastNameButton;

@FindBy(xpath="//td[contains(text(),' Create Contact')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;

public CreateContactPage()
{
   PageFactory.initElements(BaseTest.driver, this);
}




public WebElement getLastNameButton()
{
	return lastNameButton;
}

public void TypeLastNameButton(String LastName)
{
	lastNameButton.sendKeys(LastName);
}


public WebElement getSaveButton() 
{
	return saveButton;
}

public void clickSaveButton()
{
	saveButton.click();	
}



public void CreateNewContactPage(String LastName)
{
	lastNameButton.sendKeys(LastName);
	
	




	saveButton.click();	

}





    

}
