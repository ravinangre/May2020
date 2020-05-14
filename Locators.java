import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement EmailTextBox = driver.findElement(By.xpath("//input[@id='email']"));
		
		EmailTextBox.sendKeys("abc@gmail.com");

		WebElement Password = driver.findElement(By.id("pass"));
		
		Password.sendKeys("abcdef");
		
		WebElement ForgotAccountLink = driver.findElement(By.linkText("Forgotten account?"));
		
		ForgotAccountLink.click();
		
		WebElement SignIn = driver.findElement(By.partialLinkText("Facebook Li"));
		
		SignIn.click();
	}

}
