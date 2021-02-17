package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import managers.FileReaderManager;

public class LoginPage {
	
	WebElement element;
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='_36HLxm col col-3-5']//form//input[@type='text']")
	private WebElement enterEmail;
	
	@FindBy(id = "continue")
	private WebElement clickOnContinue;
	
	@FindBy(xpath = "//div[@class='_36HLxm col col-3-5']//form//input[@type='password']")
	private WebElement enterPassword;
	
	@FindBy(xpath = "//div[@class='_36HLxm col col-3-5']//form//button[@type='submit']")
	private WebElement signIn;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private void enterEmail(){
		enterEmail.sendKeys(FileReaderManager.getInstance().getConfigReader().getLoginEmail());
		
	}
	public void enterPassword() {
		enterPassword.sendKeys(FileReaderManager.getInstance().getConfigReader().getLoginPassword());
	}
	private void clickOnSignIn(){
		signIn.click();
	}
	
	public void loginToCheckOut(){
		enterEmail();
		enterPassword();
		clickOnSignIn();
		
	}

}
