package runners;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.PageObjectManager;
import managers.WebDriverManager;


public class Hooks  {
	WebDriver driver;
	
	public Hooks(){
		
		
	}

	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");       
     
                
    } 
 

	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
	    if (scenario.isFailed()) {
	      // Take a screenshot...
	    	
	    	System.out.println("Scenario is failed");
	    	this.driver =TestContext.driver;
	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
	      Thread.sleep(2000);
	      this.driver.close();
	    }
	    else{
	    this.driver =TestContext.driver;
	    this.driver.close();}
}

}
