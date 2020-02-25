package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import dataProvider.ConfigFileReader;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/resources/FunctionalTest",
		glue="stepDefinitions",
		tags= {"@smoke"},
		plugin = { "pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
		monochrome=true
		)

public class TestRunner {
	static ConfigFileReader config = new ConfigFileReader();
	
	@AfterClass
	public static void WriteExtentReport(){
		
		Reporter.loadXMLConfig(new File(config.getReportConfigPath()));
	}

}
