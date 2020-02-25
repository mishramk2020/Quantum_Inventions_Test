package stepDefinitions;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.PageObjectManager;
import pageObjects.HomePage;
import pageObjects.SignInPage;


public class StepsSignIn {
	
	TestContext testContext;
	HomePage homePage;
	SignInPage signInPage;
	
	public StepsSignIn(TestContext context) {
		
		this.testContext = context;
		
		homePage= testContext.getPageObjectManager().getHomePage();
		signInPage=testContext.getPageObjectManager().getSignInPage();
	}
	
	
	@Given("^user launches Mapsynq$")
	public void user_launches_Mapsynq() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		  homePage.navigateTo_HomePage();
	  
	   
	}

	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage.click_SignIn();
		signInPage.getUsername(username);
		signInPage.getPassword(password);
		   
	}

	@When("^User clicks sign in button$")
	public void user_clicks_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		signInPage.submit();
	}

	@Given("^user clicks logout$")
	public void user_clicks_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user is succesfully logged out$")
	public void user_is_succesfully_logged_out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is succesfully logged out");
	}



}
