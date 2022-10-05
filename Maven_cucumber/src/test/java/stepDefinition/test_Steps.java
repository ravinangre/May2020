package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class test_Steps {
		public static WebDriver driver;
		public String url = "https://kite.zerodha.com";
		public String parent;
		public String child_window;
		@Before(order=1)
	    public void beforeScenario(){
			System.setProperty("webdriver.chrome.driver","/Maven_cucumber/src/main/resources/driverpath/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.get(url);
		    parent=driver.getWindowHandle();
	        System.out.println("This will run before the every Scenario");
	    } 
		@Before(order=0)
	    public void beforeScenarioStart(){
	        System.out.println("-----------------Start of Scenario-----------------");
	    } 
		@After(order=0)
	    public void afterScenarioFinish(){
	        System.out.println("-----------------End of Scenario-----------------");
	    } 
		@After(order=1)
	    public void afterScenario(){
			driver.quit();
	        System.out.println("This will run after the every Scenario");
	    } 
	@Given("^user is on zerodha login page$")
	public void user_is_on_zerodha_login_page() throws Throwable {
	   System.out.println("user is on zerodha login page");
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
	   driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("XA0634");
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sarika699!");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}

	@Then("^user navigate to pin page$")
	public void user_navigate_to_pin_page() throws Throwable {
	   System.out.println("user successfully navigate to pin page");
	}

	@When("^user enters pin$")
	public void user_enters_pin() throws Throwable {
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("691991");
	}

	@When("^click on continue button$")
	public void click_on_continue_button() throws Throwable {
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}

	@Then("^user navigate to dashboard page$")
	public void user_navigate_to_dashboard_page() throws Throwable {
	   System.out.println("user successfully navigate to Dashboard page");
	}
	@When("user click on Forgot Password link")
	public void user_click_on_forgot_password_link() {
	  driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).click();
	}
	@Then("user navigate to forgot password page")
	public void user_navigate_to_forgot_password_page() {
		System.out.println("user successfully navigates to Forgot Password page");
		System.out.println(driver.getTitle());
	}
	@When("user enters userid")
	public void user_enters_userid() {
	driver.findElement(By.xpath("//input[@placeholder='User ID']")).sendKeys("XA0634");
	}
	@When("user enters PAN Number")
	public void user_enters_pan_number() {
		driver.findElement(By.xpath("//input[@placeholder='PAN']")).sendKeys("AIRPN1678G");
	
	}
	@When("user enters invalid username")
	public void user_enters_invalid_username() {
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("XA0635");
	}

	@Then("Invalid username and password message get displayed")
	public void invalid_username_and_password_message_get_displayed() {
	   driver.findElement(By.xpath("//p[contains(text(),'Invalid username or password')]")).isDisplayed();
	}
	@When("search box is displayed")
	public void search_box_is_displayed() {
	    driver.findElement(By.xpath("//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")).isDisplayed();
	}
	@When("search a stock called sbin")
	public void search_a_stock_called_sbin() {
	    driver.findElement(By.xpath("//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")).sendKeys("sbin");
	}
	@Then("display the sbin results")
	public void display_the_sbin_results() {
	 driver.findElement(By.xpath("//ul[@class='omnisearch-results']//span[contains(text(),'SBIN')]")).isDisplayed();   
	}
	@When("mouse over the first stock we found")
	public void mouse_over_the_first_stock_we_found() {
	    
	}
	@When("click on Add button")
	public void click_on_add_button() {
	    
	}
	@Then("validate the sbin stock successfully added into watchlist")
	public void validate_the_sbin_stock_successfully_added_into_watchlist() {
	    
	}
	@When("^user enters userid as \"([^\"]*)\"$")
	public void user_enters_userid_as_something(String userid) throws Throwable {
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(userid);
	}

	@When("^user enters pin as \"([^\"]*)\"$")
	public void user_enters_pin_as_something(String pin) throws Throwable {
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	}
	@And("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as_something(String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}


}
