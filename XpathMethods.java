import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");

		WebElement Fname = driver.findElement(By.xpath("//input[contains(@id,'u_0_m')]"));
		
		Fname.sendKeys("Insipre");
		
		WebElement Lname = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
		
		Lname.sendKeys("Inspire");
		
		WebElement Mobilenumber = driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]//following-sibling::input[@name='reg_email__'  or @class='input']"));
		
		Mobilenumber.sendKeys("8830158607");
		
		WebElement newpass = driver.findElement(By.xpath("//div[contains(text(),'New password')]//following-sibling::input[@type='password'  and @name='reg_passwd__']"));
		
		newpass.sendKeys("inspire123");
		
		WebElement FemaleRadioBtn = driver.findElement(By.xpath("//label[text()='Female']"));
		
		FemaleRadioBtn.click();
		
		WebElement SubmitBtn = driver.findElement(By.xpath("//div[starts-with(@class,'_1lch')]//button[starts-with(@type,'submit')]"));
		
		SubmitBtn.click();
		
	}

}
