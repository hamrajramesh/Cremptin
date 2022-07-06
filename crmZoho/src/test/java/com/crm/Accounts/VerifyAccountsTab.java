package com.crm.Accounts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.WebDriverCommonLib;
import com.crm.login.SignIn;
import com.crm.pages.AccountsPage;
import com.crm.pages.HomePage;

@Listeners(com.crm.Genriclib.MyListeners.class)
public class VerifyAccountsTab extends BaseTest {
	
   // verify Accounts
	public void VerifyAccountsTest() throws Throwable
	{
		SignIn si=new SignIn();
		si.validSigninTest();
		
		HomePage hp=new HomePage();
		hp.clickAccountsTab();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		
		AccountsPage ap=new AccountsPage();
		wlib.elementDisplayed(ap.getAccountsPageAddress(), "Accounts Text");
				
		
		
	}
	
	
	
	
}
