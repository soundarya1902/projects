package E2E.QaClick;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import resources.InvokeDriver;

public class HomeTest extends InvokeDriver
{
	private static final Logger log = LogManager.getLogger(HomeTest.class.getName());
	
	
	public LoginPage lp;
	public HomePage hp;
	
	
	@BeforeMethod
	public void open_browser() throws IOException
	{
		driver=InvokeDriver();
		lp=new LoginPage(driver);
		hp=new HomePage(driver);
	}
	@Test
	public void checktabs() throws IOException
	{
		System.out.println("This is home");
		HomePage hp=new HomePage(driver);
		String[] a= new String[10];
		
		int i;
		for(i=0;i<hp.getabs().size();i++)
		{
		   a[i]=hp.getabs().get(i).getText();
		
		   System.out.println(a[i]);
		}
		Assert.assertEquals(a[i-1], "CONTACT");
		log.info("Contact is verified");
		//System.out.println("Contact is verified in home page");
		
	}
	
	@AfterTest
	public void closebrowser() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
