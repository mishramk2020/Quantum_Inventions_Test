package cucumber;

import org.openqa.selenium.WebDriver;

import managers.PageObjectManager;
import managers.WebDriverManager;


public class TestContext {
	
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	WebDriver driver;
	
	 public TestContext(){
		 webDriverManager = new WebDriverManager();
		 
		
		 pageObjectManager = new PageObjectManager(webDriverManager.getDriver1());
		 
		 
		 
		 }
	 
	 		 
		 public WebDriverManager getWebDriverManager() {
		 return webDriverManager;
		 }
		 
		 public PageObjectManager getPageObjectManager() {
		 return pageObjectManager;
		 }

}
