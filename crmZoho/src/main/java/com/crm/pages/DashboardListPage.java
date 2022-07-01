package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Genriclib.BaseTest;

public class DashboardListPage {
	
@FindBy(xpath="//td[text()='Dashboard List']/following::table[3]//a[text()='Vendors Dashboard']") private WebElement DashboardName;

public DashboardListPage()
{
   PageFactory.initElements(BaseTest.driver, this);	
}

public WebElement getDashboardName()
{
  return DashboardName;	
}

  public String getDashboardNameText()
  {
	 return DashboardName.getText();
  }


}
