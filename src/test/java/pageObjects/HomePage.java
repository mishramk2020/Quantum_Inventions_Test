package pageObjects;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProvider.ConfigFileReader;

public class HomePage {
	
	public static WebDriver driver;
	WebDriverWait wait;
	//= new WebDriverWait(driver,100);
	ConfigFileReader config = new ConfigFileReader();
	public HomePage(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver,100);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='http://account.mapsynq.com/profiles/new']")
	public WebElement Lnk_Register;
	
	@FindBy(xpath="//a[@href='/oauth/sign_in' and contains(text(),'Sign in')]")
	public WebElement Lnk_SignIn;
	
	@FindBy(xpath="//div[@id='ad_toggle' and @class='sprite ad_bar_toggle ad_bar_collapse']")
	public WebElement btn_ad_hide;
	
	@FindBy(xpath="//div/a[@class='tab_button directions_tab sprite']")
	public WebElement btn_directions;
	
	@FindBy(xpath="//input[@id='poi_from']")
	public WebElement txt_from;
	
	@FindBy(xpath="//input[@id='poi_to']")
	public WebElement txt_to;
	
	@FindBy(id="get_direction")
	public WebElement btn_getdirections;
	
	public void click_directions() {
		wait.until(ExpectedConditions.visibilityOf(btn_directions));
		btn_directions.click();
		}
	
	public void click_from() {
		wait.until(ExpectedConditions.visibilityOf(txt_from));
		txt_from.clear();
		txt_from.sendKeys("JURONG EAST");
	}
	public void click_to() {
		wait.until(ExpectedConditions.visibilityOf(txt_to));
		txt_to.clear();
		txt_to.sendKeys("CELEMENTI");
	}
	
	public void click_getdirections() {
		wait.until(ExpectedConditions.visibilityOf(btn_getdirections));
		btn_getdirections.click();
		}
	
	public void click_OK() {
		
		// Switching to Alert
		
        Alert alert = driver.switchTo().alert();
        
        // Accepting alert		
        alert.accept();
        
		}
	
	
	
	public void hideadvt() {
		wait.until(ExpectedConditions.visibilityOf(btn_ad_hide));
		if(btn_ad_hide.isDisplayed()) {
			System.out.println("clicked hide");
		btn_ad_hide.click();}else {
			System.out.println("not clicked hide");
		}
	}
	
	public void navigateTo_HomePage() {
		 driver.get(config.getURL());
		 }
	
	public void click_Register() {
		Lnk_Register.click();
	}
	
	public void click_SignIn() {
		Lnk_SignIn.click();
	}
	
	@FindBy(xpath="//div[@class='item_icon sprite orange_cone_nopin']")
	List<WebElement> icon_roadwork;
	
	public int totalNoOfRoadwork() {
		
		return icon_roadwork.size();
		
	}
	
	public boolean NoOfRoadworkdisplayed() {
		
		if(icon_roadwork.isEmpty()) {return false;}else
		return true;
		
	}
	
	@FindBy(xpath="//div[@class='item_icon sprite road_jam_nopin']")
	List<WebElement> icon_heavytraffic;
	
public int totalNoOfHeavyTraffic() {
		
		return icon_heavytraffic.size();
		
	}
	
	public boolean NoOfHeavyTrafficsdisplayed(){
		if(icon_heavytraffic.isEmpty()) {return false;}else
			return true;
	}

	
	


}
