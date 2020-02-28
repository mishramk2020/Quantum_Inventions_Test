package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import dataProvider.ExcelUtility;
import managers.PageObjectManager;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class StepsRegister {
	
	TestContext testContext;
	HomePage homePage;
	RegisterPage registerPage;
	ExcelUtility excel = new ExcelUtility();
	
	public StepsRegister(TestContext context) {
		
		this.testContext=context;
		homePage= testContext.getPageObjectManager().getHomePage();
		registerPage=testContext.getPageObjectManager().getRegisterPage();
	}
	

	
	@When("^user click on register link$")
	public void user_click_on_register_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage.click_Register();
		
	    
	}

	@When("^user fill account details$")
	public void user_fill_account_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions\
		
	    registerPage.getFirstname(1,0);
	    registerPage.getLastname(1,1);
	    registerPage.getCountry();
	    registerPage.getAddress();
	    registerPage.getContact();
	    registerPage.getGender();
	    registerPage.getdate_dob();
	    registerPage.getdobmm();
	    registerPage.getdobyyyy();	    
	    registerPage.getdate_dob_dd();
	    registerPage.getEmail();
	    registerPage.getUsername();
	    registerPage.getPassword();
	    registerPage.getConfirmPassword();
	    registerPage.SubscribeCheckbox();
	    registerPage.AgreeCheckbox();
	    registerPage.click_createprofile();
	    
	}

	@Then("^user registered successfully$")
	public void user_registered_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	

}
