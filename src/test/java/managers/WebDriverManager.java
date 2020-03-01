package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import dataProvider.ConfigFileReader;
public class WebDriverManager {
	
	ConfigFileReader config = new ConfigFileReader();
	private WebDriver driver;
	private static String driverType1, driverType2;
	
	 public WebDriverManager() {
		 driverType1 = config.getBrowser1();
		 driverType2 = config.getBrowser2();
		 		 		 
		 }
		
	public WebDriver getDriver1() {
        switch (driverType1) {  
        
        case "FIREFOX" : 
        	System.setProperty("webdriver.gecko.driver", config.getfirefoxDriverPath());
        	FirefoxOptions options = new FirefoxOptions();
        	options.setLegacy(true);
        	driver= new FirefoxDriver();
        	driver.manage().window().maximize();
        	
      break;
        case "CHROME" : 
        	System.setProperty("webdriver.chrome.driver", config.getDriverPath());
        	driver = new ChromeDriver();
        	driver.manage().window().maximize();
         
     break;
        case "INTERNETEXPLORER" : driver = new InternetExplorerDriver();
     break;
        }

 return driver;
 } 
	
	public WebDriver getDriver2() {
        switch (driverType2) {  
        
        case "FIREFOX" : 
        	System.setProperty("webdriver.gecko.driver", config.getfirefoxDriverPath());
        	FirefoxOptions options = new FirefoxOptions();
        	options.setLegacy(true);
        	driver= new FirefoxDriver();
        	driver.manage().window().maximize();
        	
      break;
        case "CHROME" : 
        	System.setProperty("webdriver.chrome.driver", config.getDriverPath());
        	driver = new ChromeDriver();
        	driver.manage().window().maximize();
         
     break;
        case "INTERNETEXPLORER" : driver = new InternetExplorerDriver();
     break;
        }

 return driver;
 } 
	
	
	public void closeDriver() {
		 driver.close();
		 driver.quit();
		 }

}
