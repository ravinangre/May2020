import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependentDemo {
		WebDriver driver;
		
		@Test (dependsOnMethods = { "OpenBrowser1" })
		public void SignIn() {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123456789");
			
			
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
			
	   System.out.println("This will execute second (SignIn)");
		}
	 
		@Test
		public void OpenBrowser1() {
			
			String baseUrl = "https://www.facebook.com/";
		      
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe"); 
	        System.out.println("Launching Google Chrome browser"); 
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
			System.out.println("This will execute first (Open Browser)");
	}
		 @Test (dependsOnMethods = { "SignIn","OpenBrowser1" })
		  public void LogOut() {
			 
			  
			  System.out.println("The user logged out successfully");
			  driver.close();
		  }
}
