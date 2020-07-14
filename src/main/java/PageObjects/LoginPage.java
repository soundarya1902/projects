package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{

	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By Email=By.xpath("//input[@id='user_email']");
	By Password=By.xpath("//input[@id='user_password']");
	By login=By.xpath("//input[@name='commit']");
	
	
	public WebElement EnterEmail()
	{
		return driver.findElement(Email);
	}
	public WebElement EnterPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement ClickLogin()
	{
		return driver.findElement(login);
	}
}
