package mypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerdemocart {
	WebDriver driver;
	
	//locating firstname textbox
	@FindBy(name="firstname")
	WebElement firstname;
	
	//locating lastname textbox
	@FindBy(name="lastname")
	WebElement lastname;
	
	//locating emailid textbox
	@FindBy(id="input-email")
	WebElement emailid;
	
	//locating telephone number textbox
	@FindBy(id="input-telephone")
	WebElement telephonenumber;
	
	//locating password textbox
	@FindBy(id="input-password")
	WebElement password;
	
	//locating confirm password textbox
	@FindBy(id="input-confirm")
	WebElement confirmpwd;
	
	//locating radio button
	@FindBy(className="radio-inline")
	WebElement newsletter;
	
	//locating privacy policy checkbox
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement policy;
	
	//locating continue button
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement continuebtn;
	
	//locating error msgs
	
	@FindBy(xpath="//*[@id=\"account\"]/div[2]/div/div")
	WebElement errorMsgforfirstname;
	
	@FindBy(xpath="//*[@id=\"account\"]/div[3]/div/div")
	WebElement errorMsgforlastname;
	
	@FindBy(xpath="//*[@id=\"account\"]/div[4]/div/div")
	WebElement errormsgforemail;
	
	@FindBy(xpath="//*[@id=\"account\"]/div[5]/div/div")
	WebElement errorMsgfortelephone;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div")
	WebElement errorMsgforpassword;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div")
	WebElement errorMsgconfirmpassword;
	
	//locating warnings
	@FindBy(xpath="//*[@id=\"account-register\"]/div[1]")
	WebElement warningforprivacypolicy;
	
	@FindBy(xpath="//*[@id=\"account-register\"]/div[1]")
	WebElement warningforemailid;
	
	@FindBy(xpath="//*[@id=\"content\"]/p/a")
	WebElement loginlink;
	
	//constructor, as everypage needs a webdriver to find elements
	//intitializing the elements
	public Registerdemocart(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//methods to set first and last names, email and telephone, password and confirm password
	public void setfirstname(String fn) {
		firstname.sendKeys(fn);	
		}
	public void setlastname(String ln) {
		lastname.sendKeys(ln);	
		}
	public void setemail(String eid) {
		emailid.sendKeys(eid);
	}
	public void settelephonenumber(String num)
	{
		telephonenumber.sendKeys(num);
	}
	public void setPassWord(String pwd) {
		password.sendKeys(pwd);	
		}
	
	public void setconfirmPassWord(String pwd) {
		confirmpwd.sendKeys(pwd);	
		}
	public void setnewsletter() {
		newsletter.click();	
		}
	public void setprivacypolicy() {
		policy.click();
	}
	public void clickcontinueBtn() {
		continuebtn.click();	
		}
	
	public void clickonlogin() {
		loginlink.click();
	}
	
	//methods for displaying error msgs 
	public String checkErrorforfirstname() {
		String actMsg=errorMsgforfirstname.getText();
		return actMsg;
		}
	public String checkErrorforlastname() {
		String actMsg = errorMsgforlastname.getText();
		return actMsg;
		}
	
	public String checkErroremail() {
		String actMsg=errormsgforemail.getText();
		return actMsg;
		}
	public String checkErrortelephone() {
		String actMsg=errorMsgfortelephone.getText();
		return actMsg;
		}
	public String checkErrorpassword() {
		String actMsg=errorMsgforpassword.getText();
		return actMsg;
		}
	public String checkErrorconfirmpwd() {
		String actMsg=errorMsgconfirmpassword.getText();
		return actMsg;
		}
	//methods for displaying warnings
	public String checkwarningforemail() {
		String actMsg=warningforemailid.getText();
		return actMsg;
		}
	public String checkwarningprivacypolicy() {
		String actMsg=warningforprivacypolicy.getText();
		return actMsg;
		}
}