import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Cliniq {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://globalpmstest-env.eba-ntz3fpgm.ap-south-1.elasticbeanstalk.com/org-CliniQ");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Login = driver.findElement(By.xpath("//input[@id='userNameId']"));
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwordId']"));
		
		Login.sendKeys("admin-digivillage");
		
		driver.findElement(By.xpath("//input[@id='user_div']")).click();
		
		password.sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='globalUnitIdChange']")));
		
		select.selectByVisibleText("Telemedicine");
		
		Actions action = new Actions(driver);
		
		WebElement webmenu =  driver.findElement(By.xpath("//ul[@id='menu']"));
		
		action.moveToElement(webmenu).perform();
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a/span")).click();

		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/ul/li[2]/a/span")).click();
		
		Select selectpre = new Select(driver.findElement(By.xpath("//*[@id=\"prefixDropdown\"]")));
		
		selectpre.selectByVisibleText("Mr");
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ramesh");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("patil");
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		
		WebElement datebox = driver.findElement(By.xpath("//*[@id=\"cForm\"]/div[1]/fieldset/div[1]/div[2]/div[2]/div[2]/div/label"));
		
		datebox.click();
		
		Select selectmonth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		
		selectmonth.selectByVisibleText("Jan");
		
		Select selectyear = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		
		selectyear.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a")).click();
				
		driver.findElement(By.xpath("//*[@id=\"validate\"]")).click();
		
		WebElement  email = driver.findElement(By.xpath("//input[@id='emailId']"));
		
		email.sendKeys("ramesh@gmail.com");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='Mobileno']"));
		
		mobile.sendKeys("8855447789");
		
		driver.findElement(By.xpath("//*[@id=\"validate\"]")).click();
		
		
	}

}
