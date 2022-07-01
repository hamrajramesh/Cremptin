package com.crm.Leads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.FileLib;
import com.crm.Genriclib.WebDriverCommonLib;
import com.crm.login.SignIn;
import com.crm.pages.CreateLeadPage;
import com.crm.pages.HomePage;
import com.crm.pages.LeadDatailsPage;
import com.crm.pages.LeadsPage;

@Listeners(com.crm.Genriclib.MyListeners.class)
public class VerifyCreateLeadPage extends BaseTest {
	
      @Test
	public void VerifyCreateLeadText() throws Throwable
	{
	    //verify home page	
		SignIn SI=new SignIn();
		SI.validSigninTest();
		
		HomePage hp=new HomePage();
		hp.clickLeadsTab();
		
		LeadsPage lp=new LeadsPage();
		lp.clickNewLeadButton();
		
		CreateLeadPage clp=new CreateLeadPage();
		
		FileLib flib=new FileLib();
		
		 String SalutationDropdown=flib.readExcelData(EXCEL_PATH, "Lead", 0, 1);
         
		 String fitstName=flib.readExcelData(EXCEL_PATH, "Lead", 1, 1);		
		
         String lastName=flib.readExcelData(EXCEL_PATH, "Lead", 2, 1);		
    
         String companyName=flib.readExcelData(EXCEL_PATH, "Lead", 3, 1);		
         
         clp.CreateNewLeadPage(SalutationDropdown ,fitstName, lastName, companyName);
         
         
         WebDriverCommonLib wlib=new WebDriverCommonLib();
         LeadDatailsPage ldp=new LeadDatailsPage();
        
         wlib.verify(ldp.getLeadNameText(), flib.readExcelData(EXCEL_PATH, "Lead", 4, 1), "Lead Name Text");
         
         
         
         
         
         
         
         
         
       }

}
