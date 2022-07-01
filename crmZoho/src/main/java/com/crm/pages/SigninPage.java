package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class SigninPage {
	
	@FindBy(id="userName") private WebElement userNameTextBox;
	@FindBy(id="passWord") private WebElement passwordTextBox;
    @FindBy(xpath="//input[@title='Sign In']") private WebElement signinButton;

  public SigninPage()
  {
	  PageFactory.initElements(BaseTest.driver,this);
	  
  }
  
  public void login(String un,String pw)
  {
	  userNameTextBox.sendKeys(un);
	  passwordTextBox.sendKeys(pw);
	  signinButton.click();
  }

public WebElement getUntb() {
	return userNameTextBox;
}

public WebElement getPwtb() {
	return passwordTextBox;
}

public WebElement getLoginBtn() {
	return signinButton;
}
  
  
}


