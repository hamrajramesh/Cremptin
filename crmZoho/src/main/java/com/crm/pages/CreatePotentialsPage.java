package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.WebDriverCommonLib;

public class CreatePotentialsPage {
	
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accountNameLookupIcon;
	@FindBy(xpath="//input[@name='property(Potential Name)']") private WebElement potentialName;
	@FindBy(xpath="//select[@name='property(Stage)']") private WebElement stageDropdown;
	@FindBy(xpath="//img[@title='Calendar']") private WebElement calenderIcon;
	@FindBy(xpath="//td[contains(text(),' Create Potential')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;
	public CreatePotentialsPage()
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
	
	public void clickstageDropdown()
	{
		stageDropdown.click();
	}
	
	public WebElement getPotentialName()
	{
		return potentialName;
	}
	
	public void TypegetPotentialName(String PotentialName)
	{
		potentialName.sendKeys(PotentialName);
	}
	
	public void clickAccountNameLookupIcon()
	{
		accountNameLookupIcon.click();
	}
	public void clickcalenderIcon()
	{
		calenderIcon.click();
	}
	
	public void CreateNewPotentialPage(String StageText,String PotentialName )
	{
		potentialName.sendKeys(PotentialName);
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.selectOption(StageText, stageDropdown);
		accountNameLookupIcon.click();
		calenderIcon.click();
		saveButton.click();

		

		



		

	}
	
	
	
	
	
	

}
