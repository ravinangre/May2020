import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	//main method
	public static void main(String[] args) throws IOException {
		// set the system properties for chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Desktop\\chromedriver.exe");
		// call webdriver interface
		WebDriver driver = new ChromeDriver();
		// launch google in chrome browser using get method
		driver.get("https://www.google.com");
		// call takescreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		// here we use getscreenshotAs method
		File Filesrc = ts.getScreenshotAs(OutputType.FILE);
		// call fileutils class from commons io 
		FileUtils.copyFile(Filesrc, new File("./screenshots/_"+ timestamp() +".jpg") );
		
	}
	public static String timestamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}
