package com.crm.login;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.FileLib;
import com.crm.Genriclib.WebDriverCommonLib;
import com.crm.pages.SigninPage;

@Listeners(com.crm.Genriclib.MyListeners.class)
public class SignIn extends BaseTest {
	
   
	public void validSigninTest() throws Throwable {
		
		//open the browser
		//Enter the test URL
		//Verify LoginPage is Displayed
	    FileLib flib=new FileLib();
		//Login to App
		SigninPage lp=new SigninPage();
		
		lp.login(flib.readPropertyData(PROP_PATH, "username"),
	             flib.readPropertyData(PROP_PATH, "password"));
		
		//Verify Home Page is Displayed
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(wlib.getPageTitle(), 
				flib.readPropertyData(PROP_PATH, "homeTitle"),
				"Home Page");
	}

}
