package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class ContactPage {
	
	@FindBy(xpath="//input[@value='New Contact']") private WebElement newContactButton;
	
	public ContactPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getNewContactButton()
	{
		return newContactButton;
	}
	
	public void clickNewContactButton()
	{
		newContactButton.click();
	}
	
	
	
	
	

}
