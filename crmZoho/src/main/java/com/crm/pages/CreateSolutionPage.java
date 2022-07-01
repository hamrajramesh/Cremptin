package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class CreateSolutionPage {
	
	@FindBy(xpath="//input[@name='property(Solution Title)']") private WebElement solutionTitleTextbox;
	@FindBy(xpath="//textarea[@name='property(Question)']") private WebElement questionTextbox;
	@FindBy(xpath="//textarea[@name='property(Answer)']") private WebElement answerTextbox;
	@FindBy(xpath="//img[@title='Product Name Lookup']") private WebElement productNameLookupIcon;
	@FindBy(xpath="//td[contains(text(),' Create Solution')]/ancestor::table/following-sibling::table[2]//input[@value='Save']") private WebElement saveButton;
	
	public CreateSolutionPage()
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
	
	
	
	public WebElement getSolutionTitleTextbox() 
	{
		return solutionTitleTextbox;
	}

	public WebElement getQuestionTextbox() 
	{
		return questionTextbox;
	}

	public WebElement getAnswerTextbox() 
	{
		return answerTextbox;
	}

	
	
	public void TypesolutionTitleTextbox(String ProjectStatus)
	{
		solutionTitleTextbox.sendKeys(ProjectStatus);
		
	}
	
	public void TypequestionTextbox(String ProjectCompletionStatus)
	{
		questionTextbox.sendKeys(ProjectCompletionStatus);
	}
	
	public void TypeanswerTextbox(String Completed)
	{
		answerTextbox.sendKeys(Completed);
	}
	
	public void clickproductNameLookupIcon()
	{
		productNameLookupIcon.click();
	}
	
	public void CreateNewSolutionPage(String SolutionTitle,String Question,String Answer )
	{
		solutionTitleTextbox.sendKeys(SolutionTitle);
		questionTextbox.sendKeys(Question);
		answerTextbox.sendKeys(Answer);
		productNameLookupIcon.click();
		




	}
	
	
	

}
