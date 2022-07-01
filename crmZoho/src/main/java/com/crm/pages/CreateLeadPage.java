package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.WebDriverCommonLib;

public class CreateLeadPage {
	
	
	@FindBy(xpath="//input[@name='property(First Name)']") private WebElement firstNameTextBox;
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lastNameTextBox;
	@FindBy(xpath="//input[@name='property(Company)']") private WebElement companyNameTextBox;
	@FindBy(xpath="//td[contains(text(),' Create Lead')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;
	@FindBy(xpath="//select[@name='property(saltName)']") private WebElement salutationDropdown;
	public CreateLeadPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getCompanyNameTextBox() {
		return companyNameTextBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void TypeFirstNameTextBox(String firstName)
	{
		firstNameTextBox.sendKeys(firstName);
	}
	
	public void TypeLastNameTextBox(String lastName )
	{
		lastNameTextBox.sendKeys(lastName);
	}
	
	public void TypeCompanyNameTextBox(String companyName)
	{
		companyNameTextBox.sendKeys(companyName);
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	
	public void CreateNewLeadPage(String SalutationText, String firstName,String lastName,String companyName )
	{
		
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.selectOption(SalutationText, salutationDropdown);
				
		firstNameTextBox.sendKeys(firstName);
		lastNameTextBox.sendKeys(lastName);
		companyNameTextBox.sendKeys(companyName);
		saveButton.click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
