import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Sharayu\\Desktop\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://mail.yahoo.com");
		
		// using Implicit Wait. 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[1]/a[2]/span")).click();
		 
		// using Thread.sleep
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("ravinangre");
		
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		 	
	}

}
