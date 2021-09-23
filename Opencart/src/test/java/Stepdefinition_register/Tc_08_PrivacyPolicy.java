
package Stepdefinition_register;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypages.Registerdemocart;

public class Tc_08_PrivacyPolicy {
	
	WebDriver driver;
	Registerdemocart elp;
	
	@Given("User is on registerpage of application")
	public void user_is_on_registerpage_of_application() {
		//starting chrome driver and navigating to page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/register");
		 driver.manage().window().maximize();
	}
	//passing all values
	@When("User enter valid {string}  {string}  {string}  {string} {string}  {string} in the inputs")
	public void user_enter_valid_in_the_inputs(String string, String string2, String string3, String string4, String string5, String string6) {
		elp= new Registerdemocart(driver);
		elp.setfirstname("raju");
		elp.setlastname("kumar");
		elp.setemail("raju86@gmail.com ");
		elp.settelephonenumber("9988776655");
		elp.setPassWord("haha123");
		elp.setconfirmPassWord("haha123");
		 elp.setnewsletter();
	}

    @Then("^User clicks on continue button for register$")
    public void user_clicks_on_continue_button_for_register() throws Throwable {
    	elp= new Registerdemocart(driver);
    	 elp.clickcontinueBtn();
    	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    	 
    }

 

	@Then("registraion fails and Warning displayed")
		public void registraion_fails_and_warning_displayed() throws InterruptedException {
			String msg1=elp.checkwarningprivacypolicy();
			//displays error msg
				System.out.println("Error msg is "+msg1);
				Thread.sleep(3000);
				driver.close();
	}
	
}


