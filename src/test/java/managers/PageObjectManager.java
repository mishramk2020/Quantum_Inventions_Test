package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import pageObjects.SignInPage;

public class PageObjectManager {
	
	
	 public static WebDriver driver;
	 
	 private HomePage homePage;
	 
	 private SignInPage signInPage;
	 
	 private RegisterPage registerPage;
	 
	 public PageObjectManager(WebDriver driver) {
		 
		 this.driver=driver;
		 
	 }
	 
	 public HomePage getHomePage() {
		return (homePage==null)?homePage=new HomePage(driver):homePage;
		
	 }
	 
	 public SignInPage getSignInPage() {
		 
		return (signInPage==null)?signInPage=new SignInPage(driver):signInPage;		 
		 
	 }
	 
	 public RegisterPage getRegisterPage() {
		 
		 return (registerPage==null)?registerPage= new RegisterPage(driver):registerPage;
	 }
	 
	 

}
