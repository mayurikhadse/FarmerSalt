package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo 
{
	
	public static WebDriver openChromeBrowser()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver ();
		 driver.get("https://www.facebook.com/");
		
		return driver;
		
		
	}
	
	
	
	
	
	

}
