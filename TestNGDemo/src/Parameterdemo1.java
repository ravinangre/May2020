import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterdemo1 {
public WebDriver driver;
	
	
	@Parameters({"username","password"})
	@Test
	
	public void logintofacebook(String sUsername, String sPassword) throws InterruptedException{

		   	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		   
		      driver = new ChromeDriver();
		 
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		      driver.get("https://www.facebook.com");
		 
		      driver.manage().window().maximize();
		      
		      driver.findElement(By.xpath("//input[@id='email']")).sendKeys(sUsername);
				 
		      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(sPassword);
		 
		      driver.findElement(By.xpath("//input[@value='Log In']")).click();
		      
		      String title=driver.getTitle();
		      
		      System.out.println("Page Title"+title);
		      
		      Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
