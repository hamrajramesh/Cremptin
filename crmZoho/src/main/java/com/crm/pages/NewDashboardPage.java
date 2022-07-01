package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class NewDashboardPage {
	
	
	@FindBy(xpath="//input[@name='dbName']") private WebElement dashboardNameTextBox;
	@FindBy(xpath="//input[@name='save']") private WebElement saveButton;
	
	public NewDashboardPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	public WebElement getDashboardNameTextBox()
	{
		return dashboardNameTextBox;
	}
	
	public void TypeDashboardNameTextBox(String DashboardName)
	{
		dashboardNameTextBox.sendKeys(DashboardName);
	}
	
	public void CreateNewDashboard(String DashboardName)
	{
		dashboardNameTextBox.sendKeys(DashboardName);
		
		saveButton.click();

	}
	
	
	

}
