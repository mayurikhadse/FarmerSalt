package MainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginClass 
{
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement pass;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement loginbutton;
	
	
	
	
	public LoginClass (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Username() 
	{
		Username.sendKeys("mayurikhadse");
		}
	
	public void pass()
	{
		pass.sendKeys("12346785");
		}
	
	public void login() throws InterruptedException
	{
		loginbutton.click();
		Thread.sleep(2000);
		driver.navigate().back();

		
	}
	
	

}
