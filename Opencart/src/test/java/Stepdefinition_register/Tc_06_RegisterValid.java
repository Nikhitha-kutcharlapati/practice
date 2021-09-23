package Stepdefinition_register;

import java.util.concurrent.TimeUnit;

//import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypages.Registerdemocart;



public class Tc_06_RegisterValid {
	WebDriver driver;
	Registerdemocart elp;

	  @Given("^Open browser and registerpage of democart$")
	    public void open_browser_and_registerpage_of_democart() throws Throwable {
		//starting chrome driver and navigating to page
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://demo.opencart.com/index.php?route=account/register");
			 driver.manage().window().maximize();
	    }
	  //passing all values and setting all values
	@When("User enter {string} in the firstname input")
	public void user_enter_in_the_firstname_input(String string) {
		elp= new Registerdemocart(driver);
		elp.setfirstname("nicky");
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
	}
	@When("User enter {string} in the lastname input")
	public void user_enter_in_the_lastname_input(String string) {
		elp= new Registerdemocart(driver);
		elp.setlastname("varma");
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	@When("User enter {string} in the email input")
	public void user_enter_in_the_email_input(String string) {
		elp= new Registerdemocart(driver);
		elp.setemail("nic807@gmail.com");
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	@When("User enter {string}> in telephone input")
	public void user_enter_in_telephone_input(String string) {
		elp= new Registerdemocart(driver);
		elp.settelephonenumber("9848669778");
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
	}
	@When("User enter {string} in the password input")
	public void user_enter_in_the_password_input(String string) {
		elp= new Registerdemocart(driver);
		elp.setPassWord("varvar123");
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	@When("User enter {string} in the password confirmation input")
	public void user_enter_in_the_password_confirmation_input(String string) {
		elp= new Registerdemocart(driver);
		elp.setconfirmPassWord("varvar123");
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	@When("User subscribe\\/unsubscribe the news letter")
	public void user_subscribe_unsubscribe_the_news_letter() {
	  elp.setnewsletter();
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	@When("User agrees to privacy policy")
	public void user_agrees_to_privacy_policy() {
	  elp.setprivacypolicy();
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		   Thread.sleep(2000); 
	 elp.clickcontinueBtn();
	 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}


	@Then("User should get signedin")
	public void user_should_get_signedin() {
		System.out.println("After logging in:"+driver.getTitle());
		driver.close();
    
	}

}
