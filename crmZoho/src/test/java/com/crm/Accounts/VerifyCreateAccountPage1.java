package com.crm.Accounts;

import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.FileLib;
import com.crm.Genriclib.WebDriverCommonLib;
import com.crm.login.SignIn;
import com.crm.pages.AccountsPage;

import com.crm.pages.CreateAccountPage;
import com.crm.pages.HomePage;

public class VerifyCreateAccountPage1 extends BaseTest {
	
	

	public void VerifyCreateAccountText1() throws Throwable
	{
		SignIn si=new SignIn();
		si.validSigninTest();
		
		HomePage hp=new HomePage();
		hp.clickAccountsTab();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		
		AccountsPage ap=new AccountsPage();
		wlib.elementDisplayed(ap.getAccountsPageAddress(), "Accounts Text");
		
		AccountsPage ap1=new AccountsPage();
		ap1.clickNewAccountButton();
		

		FileLib flib=new FileLib();
		
		wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "CreateAccountTitle"), "CreateAccountPage");
		
		
		CreateAccountPage cap=new CreateAccountPage();
		cap.clickAccountNameLookupTab();
		
		
	
		
	}

}
