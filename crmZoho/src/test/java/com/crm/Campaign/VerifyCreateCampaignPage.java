package com.crm.Campaign;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.FileLib;
import com.crm.Genriclib.WebDriverCommonLib;
import com.crm.login.SignIn;
import com.crm.pages.CampaignDetailsPage;
import com.crm.pages.CampaignsPage;
import com.crm.pages.CreateCampaignPage;
import com.crm.pages.HomePage;

@Listeners(com.crm.Genriclib.MyListeners.class)                                         
public class VerifyCreateCampaignPage extends BaseTest {
	
	@Test
	public void VerifyCreateCampaignText() throws Throwable 
	{
		SignIn si=new SignIn();
		si.validSigninTest();
		
		HomePage hp=new HomePage();
		hp.clickCampaignsTab();
		
		CampaignsPage cp=new CampaignsPage();
		cp.clickNewCampaignButton();
		
		CreateCampaignPage ccp=new CreateCampaignPage();
		FileLib flib=new FileLib();
		String CampaignName=flib.readExcelData(EXCEL_PATH, "Campaign", 0, 1);
		
		ccp.CreateNewCampaginPage(CampaignName);
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		CampaignDetailsPage cdp=new CampaignDetailsPage();
		wlib.verify(cdp.getCampaignNameText(), flib.readExcelData(EXCEL_PATH, "Campaign", 0, 1), "CampaignNameText");
		
		
		
		
       		
		
		
		
		
		
	}

}
