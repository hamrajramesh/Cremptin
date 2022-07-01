package com.crm.Quotes;

import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.login.SignIn;
import com.crm.pages.HomePage;

public class VerifyQuotesTab extends BaseTest {
	
	@Test
	public void VerifyQuotesElement() throws Throwable
	{
		SignIn si=new SignIn();
		si.validSigninTest();
		
		HomePage hp=new HomePage();
		hp.clickQuotesElement();
		
		
				
	}

}
