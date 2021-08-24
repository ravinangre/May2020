import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dp {
public WebDriver driver;
@BeforeMethod
public void bmethod()
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	   
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://www.facebook.com");

    driver.manage().window().maximize();
    }

	@Test(dataProvider="facebookdata")
	public void logintofacebook(String sUsername, String sPassword) throws InterruptedException{
		      driver.findElement(By.xpath("//input[@id='email']")).sendKeys(sUsername);
				 
		      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(sPassword);
		 
		      driver.findElement(By.xpath("//button[@name='login']")).click();
		      
		      String title="Facebook";
		        
		      System.out.println("Page Title"+title);
		      Assert.assertNotEquals(title, driver.getTitle());
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

	@DataProvider(name="facebookdata")
	public Object [][] passData()
	{
	return new Object[][] {{"admin","admin123"}, {"9423111564","7875888498"},{"12345","147857"}};
	}
}

