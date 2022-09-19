 package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import MainPackage.LoginClass;
import Utility.Pojo;

public class TestNGClass1 extends Pojo
{
	WebDriver driver;
	@BeforeClass()
	public void mrk() 
	{
		WebDriver driver = openChromeBrowser();
	    this.driver = driver;
	}
//	@BeforeMethod()
//	public void abc() 
//	{
//		System.out.println();
//	}
	
	@Test(priority=1)
	public void tests() throws InterruptedException
	{
		LoginClass login = new LoginClass (driver);
			login.Username();
			Thread.sleep(2000);
			login.pass();
			Thread.sleep(2000);
			login.login();
			Thread.sleep(2000);
			driver.navigate().back();
			
			
			
		
	}
	@AfterMethod()
	public void aftermethod() 
	{
		System.out.println("");
	}
	
	
	
	
	@AfterClass()
	public void afterclass() 
	{
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
 