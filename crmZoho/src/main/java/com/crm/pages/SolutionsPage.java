package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class SolutionsPage {
	
	@FindBy(xpath="//input[@value='New Solution']") private WebElement newSolutionButton;
	
	public SolutionsPage()
	{
	   PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getNewSolutionButton()
	{
		return newSolutionButton;
	}
	
	public void clickNewSolutionButton()
	{
		newSolutionButton.click();
	}
	

}
