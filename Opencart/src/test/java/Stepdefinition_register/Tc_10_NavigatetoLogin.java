package Stepdefinition_register;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypages.Registerdemocart;


public class Tc_10_NavigatetoLogin {
	WebDriver driver;
	Registerdemocart elp;

	@Given("User is on democart application register page")
	public void user_is_on_democart_application_register_page() {
		//starting chrome driver and navigating to page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/register");
		 driver.manage().window().maximize();
	}
	@When("User already have an account _ click on login")
	public void user_already_have_an_account_click_on_login() {
		//creating reference to class registyerdemocart 
		elp = new  Registerdemocart(driver);
		elp.clickonlogin();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@Then("User redirects to login page")
	public void user_redirects_to_login_page() throws InterruptedException {
		//applying assertion to compare the actual and expected pages
		System.out.println("After Clicking on login Title of page is:"+driver.getTitle());
        String expTitle="Account Login";
           String actTitle;
           actTitle=driver.getTitle();
           assertEquals(actTitle, expTitle);
           Thread.sleep(2000);
           driver.close();
	}



}
