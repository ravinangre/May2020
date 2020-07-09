package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By username = By.name("email");
	By password = By.name("pass");
	By titletext = By.id("pageTitle");
	By login = By.xpath("//input[@value='Log In']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void setUsername(String strusername) {
		driver.findElement(username).sendKeys(strusername);
	}

	public void setPassword(String strpassword) {
		driver.findElement(password).sendKeys(strpassword);
	}
	public void Loginclick() {
		driver.findElement(login).click();
	}
	public String getLoginTitle() {
		return driver.findElement(titletext).getText();
	}
	
	public void loginFacebook(String strusername, String strpassword)
	{
		this.setUsername(strusername);
		
		this.setPassword(strpassword);
		
		this.Loginclick();	
	}
}
