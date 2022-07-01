package com.crm.Contacts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.FileLib;
import com.crm.Genriclib.WebDriverCommonLib;
import com.crm.login.SignIn;
import com.crm.pages.ContactPage;
import com.crm.pages.ContactsDetailPage;
import com.crm.pages.CreateContactPage;
import com.crm.pages.HomePage;

@Listeners(com.crm.Genriclib.MyListeners.class)
public class VerifyCreateContactPage extends BaseTest {
	
	
    

	@Test
	public void VerifyCreateContactPageText() throws Throwable
	{
		
		SignIn si=new SignIn();
		si.validSigninTest();
		
		HomePage hp=new HomePage();
		hp.clickContactsTab();
		
		ContactPage cp=new ContactPage();
	    cp.clickNewContactButton();
		
		CreateContactPage ccp=new CreateContactPage();
		
		FileLib flib=new FileLib();
		String lastName=flib.readExcelData(EXCEL_PATH, "Contacts", 0, 1);
		
		ccp.CreateNewContactPage(lastName);
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		
		ContactsDetailPage cdp=new ContactsDetailPage();
		wlib.verify(cdp.getContactNameText(), flib.readExcelData(EXCEL_PATH, "Contacts", 0, 1), "Last Name Text");
		
		
		
		
		
		
		
		
		
	
		
		
	
		
		
		
	
		
		
		
		

		
		
		
	}

}
