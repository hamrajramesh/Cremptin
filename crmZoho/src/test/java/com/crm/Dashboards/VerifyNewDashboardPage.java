package com.crm.Dashboards;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.FileLib;
import com.crm.Genriclib.WebDriverCommonLib;
import com.crm.login.SignIn;
import com.crm.pages.DashboardListPage;
import com.crm.pages.DashboardPage;
import com.crm.pages.HomePage;
import com.crm.pages.NewDashboardPage;

@Listeners(com.crm.Genriclib.MyListeners.class)
public class VerifyNewDashboardPage extends BaseTest {
	
	@Test
	public void VerifyNewDashboardText() throws Throwable
	{
		SignIn si=new SignIn();
		si.validSigninTest();
		
		HomePage hp=new HomePage();
		hp.clickDashboardsTab();
		
		DashboardPage dp=new DashboardPage();
		dp.DashboardListPage();
		
		NewDashboardPage ndp=new NewDashboardPage();
		FileLib flib=new FileLib();
		String DashboardName=flib.readExcelData(EXCEL_PATH, "Dashboard", 0, 1);
		
		ndp.CreateNewDashboard(DashboardName);
				
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		DashboardListPage dlp=new DashboardListPage();
		wlib.verify(dlp.getDashboardNameText(), flib.readExcelData(EXCEL_PATH, "Dashboard", 0, 1), "DashboardNameText");
		
		
		
		
				
	   	
	}
	
	
	

}
