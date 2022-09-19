package TestPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MainPackage.CreateNewAccount;
import MainPackage.LoginClass;
import Utility.Pojo;

public class TestNGClass extends Pojo
{
	WebDriver driver;
	@BeforeClass()
	public void abc() 
	{
		WebDriver driver = openChromeBrowser();
				this.driver=driver;
	}
	
	
	@BeforeMethod ()
	public void mnb()
	{
		System.out.println(" ");
	}
	
@Test()
public void anb() throws InterruptedException
{
	CreateNewAccount create = new CreateNewAccount(driver);
     create.create();
     Thread.sleep(2000);
	 create.Name();
	 create.Lastname();
	 create.Email();
	 create.Bday();
	 create.Bmonth();
	 create.Byear();
	 
	
	
	
	
	
	
	
	
	
	
}
}
