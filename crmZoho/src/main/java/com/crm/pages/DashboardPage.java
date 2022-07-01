package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class DashboardPage {
	
	@FindBy(xpath="//a[text()='Go to Dashboard List']") private WebElement goToDashboardListLink;
	@FindBy(xpath="//input[@name='newDashboard']") private WebElement createNewDashboardButton;
	
	public DashboardPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getCreateNewDashboardButton()
	{
		return createNewDashboardButton;
	}
	
	public void clickCreateNewDashboardButton()
	{
		
		createNewDashboardButton.click();
	}
	
	public WebElement getGoToDashboardListLink()
	{
		return goToDashboardListLink;
	}
	
	public void clickGoToDashboardListLink()
	{
		goToDashboardListLink.click();
	}
	
	public void DashboardListPage()
	{
		goToDashboardListLink.click();
		createNewDashboardButton.click();


	}
	
	
	
	
	
	

}
