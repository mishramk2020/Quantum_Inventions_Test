package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class StepsIncident {
	TestContext testContext;
	HomePage homePage;
	
public StepsIncident(TestContext context) {
		
		this.testContext = context;
		
		homePage= testContext.getPageObjectManager().getHomePage();
			}
	
	@When("^user search for number of roadworks$")
	public void user_search_for_number_of_roadworks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Search: "+homePage.NoOfRoadworkdisplayed());
	    ;
	}

	@Then("^user get total number of roadworks$")
	public void user_get_total_number_of_roadworks() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Total No of Roadworks for today: "+homePage.totalNoOfRoadwork());
	}
	
	@When("^user search for number of heavytraffics$")
	public void user_search_for_number_of_heavytraffics() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Search: "+homePage.NoOfHeavyTrafficsdisplayed());
	}

	@Then("^user get total number of heavy traffics$")
	public void user_get_total_number_of_heavy_traffics() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Total No of heavy traffics for today: "+homePage.totalNoOfHeavyTraffic());
	}


	
}
