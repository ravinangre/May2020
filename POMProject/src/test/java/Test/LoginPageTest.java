package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.HomePagePageFactory;
import Page.LoginPagePageFactory;
import junit.framework.Assert;

public class LoginPageTest {
String driverpath = "C:\\Users\\Sharayu\\Desktop\\chromedriver.exe";
	
	WebDriver driver;
	
	LoginPagePageFactory Lpage;
	
	HomePagePageFactory Hpage;
	
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
		Lpage = new LoginPagePageFactory(driver);
		
		String LoginpageTitle = Lpage.getLoginTitle();
		
		//Assert.assertTrue(LoginpageTitle.contains("Facebook – log in or sign up"));
		
		Lpage.loginFacebook("8830158607","9423111564");
		
		Hpage = new HomePagePageFactory(driver);
		
		Assert.assertTrue(Hpage.getUserHomepageName().contains("Ravi B"));
	}
}

