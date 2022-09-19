package MainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount 
{
	WebDriver driver;
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement create;
	@FindBy(xpath = "//input[@name='firstname']")
    private WebElement Name;
    
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement Lastname;
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement Email;
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement Pass;
	
	@FindBy(xpath = "//select[@name='birthday_day']")
	private WebElement Bday;
	@FindBy(xpath = "//select[@name='birthday_month']")
	private WebElement Bmonth;
	@FindBy (xpath = "//select[@name='birthday_year']")
	private WebElement Byear;
	
	public CreateNewAccount (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void create()
	{create.click();}

	public void Name() 
	{
		Name.sendKeys("Mayuri");
	}
	public void Lastname() 
	{
		Lastname.sendKeys("Khadse");
	}
	public void Email() 
	{
		Email.sendKeys("Khadsemayuri@123");
	}
	public void Pass() 
	{
		Pass.sendKeys("948736");
	}
	
	public void Bday() 
	{
		Select s1 = new Select (Bday);
		s1.selectByIndex(8);
	}
	public void Bmonth() 
	{
		Select s2 = new Select(Bmonth);
		s2.selectByValue("18");
	}
	public void Byear()
	{
		Select s3 = new Select(Byear);
		s3.deselectByVisibleText("2022");
	}
	
	
	

}
