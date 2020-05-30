import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticDrpdwn {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		
		select.selectByIndex(1);
		
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		
		month.selectByValue("1");
		
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		
		year.selectByVisibleText("2019");

	}

}
