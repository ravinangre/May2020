import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		// call the locators in script
		
		WebElement Gmail =	driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/?tab=wm&ogbl']"));
		
		WebElement NewGmail = driver.findElement(By.className("NKcBbd"));
		NewGmail.click();
		
		//WebElement signin = driver.findElement(By.id("gb_70"));
		//driver.findElement(by.)
		
		//signin.click();
		}

}
