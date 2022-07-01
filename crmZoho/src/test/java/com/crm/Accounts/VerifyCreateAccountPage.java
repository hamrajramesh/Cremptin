package com.crm.Accounts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.FileLib;
import com.crm.Genriclib.WebDriverCommonLib;
import com.crm.login.SignIn;
import com.crm.pages.AccountDetailsPage;
import com.crm.pages.AccountsPage;
import com.crm.pages.CreateAccountPage;
import com.crm.pages.HomePage;

@Listeners(com.crm.Genriclib.MyListeners.class)
public class VerifyCreateAccountPage extends BaseTest {
	
	@Test
	public void VerifyCreateAccountText() throws Throwable
	{
		SignIn si=new SignIn();
		si.validSigninTest();
		
		HomePage hp=new HomePage();
		hp.clickAccountsTab();
		
		AccountsPage ap=new AccountsPage();
		ap.clickNewAccountButton();
		
		CreateAccountPage cap=new CreateAccountPage();
		
		FileLib flib=new FileLib();
		String AccountName=flib.readExcelData(EXCEL_PATH, "Account", 0, 1);
		
		
		cap.CreateNewAccountPage(AccountName);
		
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		
		AccountDetailsPage adp=new AccountDetailsPage();
		
		wlib.verify(adp.getAccountNameText(), flib.readExcelData(EXCEL_PATH, "Account", 0, 1), "Account Name Text");
		
		
	}
	
	
	
}
