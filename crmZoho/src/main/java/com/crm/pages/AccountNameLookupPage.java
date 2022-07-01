package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class AccountNameLookupPage {
	
	@FindBy(xpath="(//table)[3]//tr[2]//a[text()='QSpiders Bull Temple']") private WebElement qspidersBullTempleText;
	
	public AccountNameLookupPage()
	{
	    PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getQspidersBullTempleText()
	{
		return qspidersBullTempleText;
	}
	
	
	public void clickQspidersBullTempleText()
	{
		qspidersBullTempleText.click();
	}

}
