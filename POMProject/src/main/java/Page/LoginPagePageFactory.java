package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePageFactory {
WebDriver driver;
@FindBy(name="email")
WebElement username;
@FindBy(name="pass")
WebElement password;
@FindBy(id="pageTitle")
WebElement titletext;
@FindBy(xpath="//input[@value='Log In']")
WebElement Login;

public LoginPagePageFactory(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void setUsername(String strusername) {
	username.sendKeys(strusername);
}

public void setPassword(String strpassword) {
	password.sendKeys(strpassword);
}
public void Loginclick() {
	Login.click();
}
public String getLoginTitle() {
	return titletext.getText();
}
public void loginFacebook(String strusername, String strpassword)
{
	this.setUsername(strusername);
	
	this.setPassword(strpassword);
	
	this.Loginclick();	
}
}
