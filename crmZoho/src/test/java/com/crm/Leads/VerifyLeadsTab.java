package com.crm.Leads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.WebDriverCommonLib;
import com.crm.login.SignIn;
import com.crm.pages.HomePage;
import com.crm.pages.LeadsPage;


@Listeners(com.crm.Genriclib.MyListeners.class)
public class VerifyLeadsTab extends BaseTest {
	
	
	
	public void VerifyLeadsTabsTest() throws Throwable
	{
		SignIn si=new SignIn();
		si.validSigninTest();
		
		HomePage hp=new HomePage();
		hp.clickLeadsTab();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		
		LeadsPage lp=new LeadsPage();
		
		wlib.elementDisplayed(lp.getLeadsTextAddress(), "Leads Text");
		
		
	
		
		
		
		
		
	}
	
	
	
	
	
	

}
