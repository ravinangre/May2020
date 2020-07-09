package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

		WebDriver driver;
		
		By HomePageUsername = By.xpath("//div[contains(text(),'Ravi B')]");
		
		public HomePage(WebDriver driver)
		{
			this.driver = driver;
		}

		public String getUserHomepageName()
		{
			return driver.findElement(HomePageUsername).getText();
		}
	}

