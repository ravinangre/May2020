package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePageFactory {
WebDriver driver;
@FindBy(xpath="//div[contains(text(),'Ravi B')]")
WebElement HomePageUser;
public HomePagePageFactory(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public String getUserHomepageName()
{
	return HomePageUser.getText();
}
}
