package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import dataProvider.ExcelUtility;


public class RegisterPage {
	ExcelUtility obj = new ExcelUtility();
	
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="profile_first_name")
	WebElement txt_firstname;
	
	@FindBy(id="profile_last_namee")
	WebElement txt_lastname;
	
	
	public void getFirstname(int i, int j) throws Exception {
		
		
		txt_firstname.sendKeys(obj.ReadExcel(i, j));
		
	}
	
	public void getLastname(int i, int j) throws Exception {
		
		txt_lastname.sendKeys(obj.ReadExcel(i, j));
		
	}
		
	@FindBy(id="profile_country")
	WebElement dropdown_country;
	
	public void getCountry() throws Exception {
		
		Select country = new Select(dropdown_country);
		
		country.selectByValue(obj.ReadExcel(1, 2));
	}
	
	@FindBy(id="profile_address")
	WebElement txt_address;
	
	public void getAddress() throws Exception {
		
		txt_address.sendKeys(obj.ReadExcel(1, 3));
	}
	
	@FindBy(id="profile_contact_no")
	WebElement txt_contact;
	
	public void getContact() throws Exception {
		
		txt_contact.sendKeys(obj.ReadExcel(1, 4));
		
		
	}
	
	@FindBy(id="profile_gender_M")
	WebElement btn_gender;
	
	public void getGender() {
		
		btn_gender.click();
	}
	
	@FindBy(id="profile_dob")
	WebElement date_dob;
	
	public void getdate_dob() {
		
		date_dob.click();
	}
	
	@FindBy(xpath="//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td")
	List<WebElement> date_dob_dd;
	
	public void getdate_dob_dd() {
		
		
		for(WebElement ele: date_dob_dd) {
			
			String date = ele.getText();
			
			if(date.equalsIgnoreCase("25")) {
				
				ele.click();
				break;
			}
		}
	}
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	WebElement date_dob_mm_select;
	
	public void getdobmm() {
		
		Select dobmm= new Select(date_dob_mm_select);
		dobmm.selectByVisibleText("May");
	}
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	WebElement date_dob_yyyy_select;
	
	public void getdobyyyy() {
		Select dobyyyy = new Select(date_dob_yyyy_select);
		dobyyyy.selectByValue("1990");
	}
	
	@FindBy(id="profile_email")
	static WebElement email;
	
	public void getEmail() {
		String Email = "test@gmail.com";
		email.sendKeys(Email);
	}
	
	@FindBy(id="user_name")
	WebElement username;
	
	public void getUsername() {
		
		String usernameverify = username.getText();
		System.out.println(usernameverify);
		//Assert.assertEquals(Email, usernameverify);
		
	}
	
	@FindBy(id="password")
	WebElement password;
	
	public void getPassword() {
		
		password.sendKeys("1212@Mickey");
	}
	
	@FindBy(id="identity[password_confirmation]")
	WebElement confirmpassword;
	
	public void getConfirmPassword() {
		
		confirmpassword.sendKeys("1212@Mickey");
	}
	
	
	@FindBy(id="profile_subscribe_to_newsletter")
	WebElement chkbox_subscribe;
	public void SubscribeCheckbox() {
		
		chkbox_subscribe.click();
	}
		
	@FindBy(id="chk_agree")
	WebElement chkbox_agree;
	
	public void AgreeCheckbox() {
		chkbox_agree.click();
	}
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement btn_createprofile;
	
public void click_createprofile() {
	btn_createprofile.click();
}
	
	
}
