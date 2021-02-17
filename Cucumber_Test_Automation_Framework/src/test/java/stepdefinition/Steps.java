package stepdefinition;

import org.openqa.selenium.WebDriver;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.AddToCartPage;
import pageobjects.CheckOutPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;


public class Steps {
	
	static WebDriver driver;
	TestContext testContext;
	HomePage homePage;
	ProductsPage productsPage;
	AddToCartPage addToCartPage;
	CheckOutPage checkOutPage;
	LoginPage loginPage;

	public Steps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		productsPage = testContext.getPageObjectManager().getProductListingPage();
		addToCartPage = testContext.getPageObjectManager().getAddToCartPage();
		checkOutPage = testContext.getPageObjectManager().getCheckoutPage();
		loginPage = testContext.getPageObjectManager().getLoginPage();
		
	}
	
	@Given("^user is on Home Page$")
	public void userIsOnHomePage(){
		homePage.navigateTo_HomePage();
	}
 
	@When("^he search for \"(.*)\"$")
	public void heSearchFor(String product)  {
		homePage.enterProduct(product);
		homePage.clickOnSearchButton();
	}
 
	@When("^choose to buy the first item$")
	public void chooseToBuyTheFirstItem() {
		productsPage.clickOnHeadFirstJava();		
	}
	
	@When("^Add product to shopping cart$")
	public void addsProductToShoppingCart(){
		addToCartPage.addTocart();
	}
 
	
	@When("^User clicks on shopping cart$")
	public void userClicksOnShoppingCart(){
		checkOutPage.clickSoppingCart();	
	}
	
	@When("^Cliks on proceed to check out$")
	public void userClicksOnProceedCheckOut(){
		checkOutPage.clicksOnProceedCheckPOut();	
	}
	
	@Then("^User should be asked to login before checkout$")
	public void enterPersonalDetailsOnLoginPage() throws InterruptedException {
		loginPage.loginToCheckOut();
		homePage.closeBrowser();
	}
	@When("^he submit username and password$")
	public void he_submit_username_and_password() {
		loginPage.loginToCheckOut();
	}
	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I submit username and password$")
	public void i_submit_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete action
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^User search for Lenovo Laptop$")
	public void user_search_for_Lenovo_Laptop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^Add the first laptop that appears in the search result to the basket$")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 	}

	@Then("^User basket should display with added item$")
	public void user_basket_should_display_with_added_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 	}

	@Given("^User navigate for Lenovo Laptop$")
	public void user_navigate_for_Lenovo_Laptop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 	}

	@When("^Add the laptop to the basket$")
	public void add_the_laptop_to_the_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
}
