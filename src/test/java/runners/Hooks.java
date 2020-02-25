package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProvider.ConfigFileReader;

public class Hooks {
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
        
                
    } 
 
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        
    }

}
