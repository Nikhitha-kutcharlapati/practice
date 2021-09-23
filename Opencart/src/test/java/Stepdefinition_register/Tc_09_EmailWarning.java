package Stepdefinition_register;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypages.Registerdemocart;

public class Tc_09_EmailWarning {
	WebDriver driver;
	Registerdemocart elp;

	@Given("System is on opencart registerpage")
	public void system_is_on_opencart_registerpage() {
		//starting chrome driver and navigating to page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/register");
		 driver.manage().window().maximize();
	}
	//passing all the values 
	@When("User enter valid values {string}  {string}")
	public void user_enter_valid_values(String string, String string2) {
		elp= new Registerdemocart(driver);
		elp.setfirstname("raju");
		elp.setlastname("kumar");
	}
	@When("invalid {string} in email input field")
	public void invalid_in_email_input_field(String string) {
		elp.setemail("ffff@gmail.com ");
	}
	@When("valid values of  {string}> {string}  {string} in the input fields")
	public void valid_values_of_in_the_input_fields(String string, String string2, String string3) {
		elp.settelephonenumber("9988776655");
		elp.setPassWord("haha123");
		elp.setconfirmPassWord("haha123");
		 elp.setnewsletter();
		 elp.setprivacypolicy();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

    @Then("User click on continue button")
    public void user_click_on_continue_button() {
    	elp= new Registerdemocart(driver);
    	  elp.clickcontinueBtn();
    	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

	@Then("registration fails and Warning for mail is displayed")
	public void registration_fails_and_warning_for_mail_is_displayed() {
		//displays error msg
		String msg1=elp.checkwarningforemail();
		System.out.println("Error msg is "+msg1);
		driver.close();
	}




}
