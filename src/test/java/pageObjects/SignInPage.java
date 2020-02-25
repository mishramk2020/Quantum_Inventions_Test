package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;
	public SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@class='button_org']")
	WebElement btn_signin;
	
	public void getUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void getPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void submit() {
		btn_signin.click();
	}
	
	
	
	
}
