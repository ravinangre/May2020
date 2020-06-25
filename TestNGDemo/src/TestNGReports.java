import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGReports {
	WebDriver driver ;
	 @Test
	 public void f() {
		 Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver",true);
         Reporter.log("Launching Google Chrome Driver for this test",true); 
	     String baseUrl = "https://www.toolsqa.com/";
	       
	     	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
	         System.out.println("Launching Google Chrome browser"); 
	         driver = new ChromeDriver();
	         driver.get(baseUrl);
	         String testTitle = "Free QA Automation Tools Tutorial for Beginners with Examples1";
	         String originalTitle = driver.getTitle();
	         
	         SoftAssert softassert = new SoftAssert();
	        softassert.assertEquals(originalTitle, testTitle,"Title of tools qa not matched");
	        softassert.assertAll();
	         
	       //  Assert.assertEquals(originalTitle, testTitle);
	         Reporter.log("The website used was DemoQA for this test",true);
	  }
	 @Test
	 public void p() {
	 System.out.println("tests are passed");
	 }
	 
	 @BeforeMethod
	 public void beforeMethod() {
	 System.out.println("Starting Test On Chrome Browser");
	 }
	 
	 @AfterMethod
	 public void afterMethod() {
	 driver.close();
	 System.out.println("Finished Test On Chrome Browser");
	 }
}
