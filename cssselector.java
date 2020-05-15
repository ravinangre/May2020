import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement UserName = driver.findElement(By.cssSelector("input#email"));
		
		UserName.sendKeys("Inspire");
		
		WebElement Password =driver.findElement(By.cssSelector("input#pass.inputtext.login_form_input_box"));
		
		Password.sendKeys("inspire");
		
	}

}
