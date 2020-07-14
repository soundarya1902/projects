package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage 
{

	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By SignIN=By.xpath("//span[contains(text(),'Login')]");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By tabs=By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a");
	
	
	
	public WebElement ClickSignIN()
	{
		return driver.findElement(SignIN);
	}
	
	public WebElement title()
	{
		return driver.findElement(title);
	}
	public List<WebElement> getabs()
	{
		return driver.findElements(tabs);
	}
}
