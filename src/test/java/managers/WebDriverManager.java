package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataProvider.ConfigFileReader;

public class WebDriverManager {
	
	ConfigFileReader config = new ConfigFileReader();
	private WebDriver driver;
	
	public WebDriver getDriver() {
         System.setProperty("webdriver.chrome.driver", config.getDriverPath());
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         return driver;
	} 	
	
	public void closeDriver() {
		 driver.close();
		 driver.quit();
		 }

}
