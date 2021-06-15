import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.yahoo.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/a[2]/span")).click();
		
		// Explicit Wait
		
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-username\"]"))).sendKeys("ravinangare");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-signin\"]"))).click();
		driver.close();
	}

}
