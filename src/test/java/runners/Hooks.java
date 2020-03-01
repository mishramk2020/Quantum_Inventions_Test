package runners;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks  {
	
	TestContext context;
	WebDriver driver;
	public Hooks(){
		
		
	}

	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");       
     
                
    } 
 

	@After
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	      // Take a screenshot...
	    	
	    	System.out.println("Scenario is failed");
	    	//context.getWebDriverManager().closeDriver();
	     // final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    // scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
	    }
}

}
