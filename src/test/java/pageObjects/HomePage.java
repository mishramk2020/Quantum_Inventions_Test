package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;

public class HomePage {
	
	WebDriver driver;
	ConfigFileReader config = new ConfigFileReader();
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='http://account.mapsynq.com/profiles/new']")
	public WebElement Lnk_Register;
	
	@FindBy(xpath="//a[@href='/oauth/sign_in' and contains(text(),'Sign in')]")
	public WebElement Lnk_SignIn;
	
	public void navigateTo_HomePage() {
		 driver.get(config.getURL());
		 }
	
	public void click_Register() {
		Lnk_Register.click();
	}
	
	public void click_SignIn() {
		Lnk_SignIn.click();
	}

}
