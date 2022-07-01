package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class ContactsDetailPage {
	
	
	
	@FindBy(xpath="//td[contains(text(),'Contact Name')]/following-sibling::td") private WebElement contactName;
	
	public ContactsDetailPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	 public WebElement getContactName()
	 {
		 return contactName;
	 }
	 
	 public String getContactNameText()
	 {
		 return contactName.getText();
	 }
	 
	 
	 
	 

}
