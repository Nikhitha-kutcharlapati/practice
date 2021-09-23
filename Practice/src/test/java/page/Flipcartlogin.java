package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipcartlogin {
	WebDriver driver;
	
	//using xpath locator with relative and absolute path
	//locating the username textbox
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement phoneno;
	
	
	//locating the password textbox
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;
	
	
	//locating the login button
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement loginBtn;
	
	
	//constructor, as everypage needs a webdriver to find elements
	//intitializing the elements
	public Flipcartlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method to set the username
	public void setUserName(String un) {
		phoneno.sendKeys(un);	
		}
	//method to set the password
	public void setPassWord(String pwd) {
		password.sendKeys(pwd);	
		}
	//method that performs login action
	public void clickLoginBtn() {
		loginBtn.click();	
		}
	
}