package runners;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import dataProvider.ConfigFileReader;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/resources/FunctionalTest",
		glue={"stepDefinitions","runners"},
		tags= {"@second"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
		monochrome=true
		)

public class SecondTestRunner {
	
static ConfigFileReader config = new ConfigFileReader();
	@BeforeClass
	public static void setup(){
		
		DateFormat df = new SimpleDateFormat("dd_MM_yyyy HH_mm_ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		String output =df.format(dateobj);
		String output2= output+"_second_report";
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("./target/cucumber-reports/"+output2+"/second_report.html"));
	}
	@AfterClass
	public static void WriteExtentReport(){
		
		ExtentCucumberFormatter.loadConfig(new File(config.getReportConfigPath()));
	}
	

}
