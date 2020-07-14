package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeDriver
{
	public WebDriver driver;
	public WebDriver InvokeDriver() throws IOException   
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\sarikati\\TestingSelenium\\QaClick\\src\\main\\java\\resources\\browser.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String browser,url;
		browser=prop.getProperty("browser");
		url=prop.getProperty("url");
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
}
