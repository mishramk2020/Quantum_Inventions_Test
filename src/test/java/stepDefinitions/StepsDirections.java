package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class StepsDirections {
	
	
	TestContext testContext;
	HomePage homePage;
	
	public StepsDirections(TestContext context) {
		
		this.testContext = context;
		
		homePage= testContext.getPageObjectManager().getHomePage();
			}
	

@When("^user clicks on directions$")
public void user_clicks_on_directions() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    homePage.click_directions();
}

@Then("^user enters point a$")
public void user_enters_point_a() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    homePage.click_from();
}

@Then("^user enters point b$")
public void user_enters_point_b() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    homePage.click_to();
}

@Then("^user clicks get directions$")
public void user_clicks_get_directions() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    homePage.click_getdirections();
    Thread.sleep(3000);
    
}

@Then("^user is able to get directions on map$")
public void user_is_able_to_get_directions_on_map() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	homePage.click_OK();
	
}


}
