package runners;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class RunParallel extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	
	

}
