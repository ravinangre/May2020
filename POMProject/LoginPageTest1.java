package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.LoginPage;
import junit.framework.Assert;

public class LoginPageTest1 {
String driverpath = "D:\\chromedriver.exe";
	
	WebDriver driver;
	
	LoginPage Lpage;
	
	HomePage Hpage;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
	@Test
	public void LoginFaceBook()
	{
		Lpage = new LoginPage(driver);
		
		String LoginpageTitle = Lpage.getLoginTitle();
		
		//Assert.assertTrue(LoginpageTitle.contains("Facebook – log in or sign up"));
		
		Lpage.loginFacebook("8830158607","9423111564");
		
		Hpage = new HomePage(driver);
		
		Assert.assertTrue(Hpage.getUserHomepageName().contains("Ravi B"));
	}
}
