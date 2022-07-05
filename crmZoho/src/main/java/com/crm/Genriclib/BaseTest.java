package com.crm.Genriclib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//written in global repo(Github)
//written in local repo(Git)
public class BaseTest implements IAutoConst{
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browserName=flib.readPropertyData(PROP_PATH,"browser");
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Dabba Fello,Enter Proper Browser Name");
		}
		String appURL = flib.readPropertyData(PROP_PATH, "url");
		driver.get(appURL);
		driver.manage().window().maximize();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "loginTitle"), 
				"Signin Page");
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}

