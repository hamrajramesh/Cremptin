package com.crm.Potentials;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.FileLib;

import com.crm.login.SignIn;

import com.crm.pages.CreatePotentialsPage;
import com.crm.pages.HomePage;
import com.crm.pages.PotentialsPage;

public class VerifyCreatePotentialsPage extends BaseTest {
	
	
	public void VerifyCreatePotentialsText() throws Throwable
	{
		SignIn si=new SignIn();
		si.validSigninTest();
		
		HomePage hp=new HomePage();
		hp.clickPotentialsTab();
		
		PotentialsPage pp=new PotentialsPage();
		pp.clickNewPotentialsButton();
		
	
		 FileLib flib=new FileLib();
		
		String PotentialName=flib.readExcelData(EXCEL_PATH, "Potential", 0, 1);
		String stageDropdown=flib.readExcelData(EXCEL_PATH, "Potential", 1, 1);
		
		CreatePotentialsPage cpp=new CreatePotentialsPage();
		cpp.CreateNewPotentialPage(stageDropdown, PotentialName);
		
		
		
	Set<String> allWindows = driver.getWindowHandles();
		
		for(String oneWindow:allWindows)
		{
			
		String	title=driver.switchTo().window(oneWindow).getTitle();
		if(title.contains("Zoho CRM - Account Name Lookup"))
		{
			driver.findElement(By.xpath("(//table)[3]//tr[2]//a[text()='QSpiders Bull Temple']")).click();
			break;
	    }
		
		}
		
		for(String oneWindow:allWindows)
		{
		    String title=driver.switchTo().window(oneWindow).getTitle();
		    if(title.contains("Closing Date"))
		    {
		    	driver.findElement(By.xpath("(//table)[3]//tr[6]//a[text()='27']")).click();
		    	break;
		    }
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
		
	

}
