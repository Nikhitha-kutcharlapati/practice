package Stepdefinition_register;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypages.Registerdemocart;

public class Tc_07_RegisterInvalid {
	

	WebDriver driver;
	Registerdemocart elp;
	@Given("User is on registerpage")
	public void user_is_on_registerpage() {
		//starting chrome driver and navigating to page
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/register");
		 driver.manage().window().maximize();
	}
	

	@When("User enter invalid {string}  {string}  {string}  {string} {string}  {string} in the inputs")
	public void user_enter_invalid_in_the_inputs(String string, String string2, String string3, String string4, String string5, String string6) {
		//passing empty values
		elp= new Registerdemocart(driver);
		elp.setfirstname(" ");
		elp.setlastname(" ");
		elp.setemail(" ");
		elp.settelephonenumber("12");
		elp.setPassWord("va");
		elp.setconfirmPassWord("vahgf");
	}
	@When("User subscribe\\/unsubscribe the news letter button")
	public void user_subscribe_unsubscribe_the_news_letter_button() {
		  elp.setnewsletter();
		  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@When("User agrees to  the privacy policy")
	public void user_agrees_to_the_privacy_policy() {
		elp.setprivacypolicy();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@When("User click on button to continue")
	public void user_click_on_button_to_continue() {
		 elp.clickcontinueBtn();
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@Then("registraion fails and error messages displayed")
	public void registraion_fails_and_error_messages_displayed() { 
		//displaying error msgs
		String msg1=elp.checkErrorforfirstname();
		System.out.println("Error msg is "+msg1);
		
		System.out.println("***************************************************");
		 
		
		String msg2=elp.checkErrorforlastname();
		System.out.println("Error msg is "+msg2);

		System.out.println("***************************************************");
		
		
		String msg3=elp.checkErroremail();
		System.out.println("Error msg is "+msg3);

		System.out.println("***************************************************");
	
		
		String msg4=elp.checkErrortelephone();
		System.out.println("Error msg is "+msg4);

		System.out.println("***************************************************");

		String msg5=elp.checkErrorpassword();
		System.out.println("Error msg is "+msg5);	

		System.out.println("***************************************************");
	
		String msg6=elp.checkErrorconfirmpwd();
		System.out.println("Error msg is "+msg6);	

		System.out.println("***************************************************");
		driver.close();
		
		 
	}




}
