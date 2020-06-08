import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoard {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement FName = driver.findElement(By.xpath("//input[@id='userName']"));
		
		WebElement UEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		
		WebElement CAddrs = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		
		WebElement Paddrs = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		WebElement SubmitBtn =  driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		
		Actions action = new Actions(driver);
		
		FName.sendKeys("Ravi nangare");
		
		UEmail.sendKeys("ravinangre@gmail.com");
		
		CAddrs.sendKeys("Ambajogai Beed");
		
		action.keyDown(CAddrs,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Paddrs, Keys.CONTROL).perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,250)");
		
		js.executeScript("arguments[0].click();",SubmitBtn);
		
		js.executeScript("history.go(0)");
		
		js.executeScript("alert('hello world');"); 
		
		driver.switchTo().alert().dismiss();
		
		driver.close();
	
	}
	}
		
		