package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.PageObjectManager;
import pageObjects.HomePage;

public class StepsRegister {
	
	TestContext testContext;
	HomePage homePage;
	
	public StepsRegister(TestContext context) {
		
		this.testContext=context;
		homePage= testContext.getPageObjectManager().getHomePage();
	}
	
	@When("^user click on register link$")
	public void user_click_on_register_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage.click_Register();
		
	    
	}

	@When("^user fill account details$")
	public void user_fill_account_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user registered successfully$")
	public void user_registered_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	

}
