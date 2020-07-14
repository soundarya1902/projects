package E2E.QaClick;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import resources.InvokeDriver;


public class LoginTest extends InvokeDriver
{
	private static final Logger log = LogManager.getLogger(LoginTest.class.getName());
	public LoginPage lp;
	public HomePage hp;
	
	
	@BeforeMethod
	public void open_browser() throws IOException
	{
		driver=InvokeDriver();
		lp=new LoginPage(driver);
		hp=new HomePage(driver);
	}
	
	@Test(dataProvider="getdata")
	public void clickSignin(String access,String un,String pwd) throws IOException
	{
		System.out.println("login page");
		hp.ClickSignIN().click();
		log.info("Click singiN");
		lp.EnterEmail().sendKeys(un);
		log.info("Enter Email");
		lp.EnterPassword().sendKeys(pwd);
		log.info("Enter Password");
		lp.ClickLogin().click();
		log.info("Click login");
		System.out.println(access);
		
	}
	@Test
	public void checktext() throws IOException
	{
		System.out.println("checktext method");
//		driver=InvokeDriver();
//		HomePage hp=new HomePage(driver);
		Assert.assertEquals(hp.title().getText(),"FEATURED COURSES");
		
		System.out.println("This is debugging:Featured courses is verified");
	}
	
	@AfterMethod
	public void closebrowser() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		
	}
	@AfterClass
	public void closedriver() throws InterruptedException
	{
		
		driver.quit();
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data= new Object[2][3];
		
		data[0][0]="non-restricted";
		data[0][1]="test.gunti@gmail.com";
		data[0][2]="Adi1.vara";
		
		data[1][0]="restricted";
		data[1][1]="soundarya.gunti@gmail.com";
		data[1][2]="Adi1.vara";
		
		return data;
	}
}

