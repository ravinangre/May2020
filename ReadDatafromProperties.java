import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDatafromProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("G:\\Firstproject\\data.properties");
		
		Properties prop = new Properties();
		
		prop.load(file);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(prop.getProperty("URL"));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("Username"));
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("Password"));
		
		driver.close();
	}

}
