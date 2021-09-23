package mypages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validlogin {
	WebDriver driver;
	
	//using xpath locator with relative and absolute path
	//locating the username textbox
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input")
	WebElement emailid;
	
	
	//locating the password textbox
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;
	
	
	//locating the login button
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement loginBtn;
	
	//locating the forgetpassword 
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
	WebElement forgotpass;
	
	//locating the error message
	@FindBy(xpath="//*[@id=\"account-login\"]/div[1]")
	WebElement errorMsg;
	
	//constructor, as everypage needs a webdriver to find elements
	//intitializing the elements
	public Validlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method to set the username
	public void setUserName(String un) {
		emailid.sendKeys(un);	
		}
	//method to set the password
	public void setPassWord(String pwd) {
		password.sendKeys(pwd);	
		}
	//method that performs login action
	public void clickLoginBtn() {
		loginBtn.click();	
		}
	
	//method that performs to click on forgetpassword link
	public void clickonforgetpassword() {
		forgotpass.click();
	}
	
	//method th print if error message if login is unsuccesful
	public String checkError() {
		String actMsg=errorMsg.getText();
		return actMsg;
		}
}