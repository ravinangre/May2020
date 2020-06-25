import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	public static WebDriver driver;
	@Test
	@Parameters("browser")
	public void ParameterizedTest(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("open chrome browser");
			driver.get("http://www.google.com");
		}
		else if(browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Sharayu\\Desktop\\geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("open Firefox browser");
			driver.get("http://www.facebook.com");
		}
		}
}
