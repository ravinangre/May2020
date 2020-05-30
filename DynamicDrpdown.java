import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDrpdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']//label[@for='fromCity']")).click();
		
		driver.findElement(By.xpath("//li[contains(@id,'item-16')]")).click();
		
	}

}
