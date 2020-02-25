package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.SignInPage;

public class PageObjectManager {
	
	
	 private WebDriver driver;
	 
	 private HomePage homePage;
	 
	 private SignInPage signInPage;
	 
	 public PageObjectManager(WebDriver driver) {
		 
		 this.driver=driver;
	 }
	 
	 public HomePage getHomePage() {
		return (homePage==null)?homePage=new HomePage(driver):homePage;
		 
	 }
	 
	 public SignInPage getSignInPage() {
		 
		return (signInPage==null)?signInPage=new SignInPage(driver):signInPage;		 
		 
	 }
	 
	 

}
