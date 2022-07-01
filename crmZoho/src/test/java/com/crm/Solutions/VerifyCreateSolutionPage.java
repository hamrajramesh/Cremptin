package com.crm.Solutions;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.Genriclib.BaseTest;
import com.crm.Genriclib.FileLib;
import com.crm.login.SignIn;
import com.crm.pages.CreateSolutionPage;
import com.crm.pages.HomePage;
import com.crm.pages.SolutionsPage;

public class VerifyCreateSolutionPage extends BaseTest {
	
	
	
    public void VerifyCreateSolutionText() throws Throwable
    {
    	SignIn si=new SignIn();
    	si.validSigninTest();
    	
    	HomePage hp=new HomePage();
    	hp.clickSolutionsElement();
    	
    	SolutionsPage sp=new SolutionsPage();
    	sp.clickNewSolutionButton();
    	
    	CreateSolutionPage csp=new CreateSolutionPage();
        FileLib flib=new FileLib();
        String SolutionTitle=flib.readExcelData(EXCEL_PATH, "Solutions", 0, 1);
        String Question= flib.readExcelData(EXCEL_PATH, "Solutions", 1, 1);
        String Answer=flib.readExcelData(EXCEL_PATH, "Solutions", 2, 1);
        
        csp.CreateNewSolutionPage(SolutionTitle, Question, Answer);
        
        
        
        
        
        Set<String> allWindows = driver.getWindowHandles();
		
		for(String oneWindow:allWindows)
		{
			
		String	title=driver.switchTo().window(oneWindow).getTitle();
		if(title.contains("Zoho CRM - Product Name Lookup"))
		{
			driver.findElement(By.xpath("(//table)[3]//tr[2]//a[text()='bluewings']")).click();
		     break;
	    }
		
		
		}
		
		csp.clickSaveButton();
		
		
		
    	
    	
    	
    	
    	
    }

}
