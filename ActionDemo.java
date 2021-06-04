import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Sharayu\\Desktop\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demoqa.com/buttons");
		
		Actions action = new Actions(driver);
		
		WebElement Dblclk = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		action.doubleClick(Dblclk).build().perform();
	
		action.contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']"))).build().perform();
		
		
		
	}

}
