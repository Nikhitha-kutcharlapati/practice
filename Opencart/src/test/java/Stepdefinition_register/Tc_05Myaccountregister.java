package Stepdefinition_register;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import mypages.Myaccountregister;


public class Tc_05Myaccountregister {

	static WebDriver driver;
	@Given("User is on home page")
	public void user_is_on_home_page() {
		//starting chrome driver and navigating to page
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://demo.opencart.com");
		 driver.manage().window().maximize();
	}
	@When("User clicks on MyAccount dropdown")
	public void user_clicks_on_my_account_dropdown() {
		Myaccountregister obj1 = new  Myaccountregister(driver);
		 obj1.clickonMyaccount();
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Then("Click on register")
	public void click_on_register() {
		Myaccountregister obj2 = new Myaccountregister(driver);
		 obj2.clickonregister();
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@Then("System should navigate to register page")
	public void system_should_navigate_to_login_page() {
	
		System.out.println("After Clicking on login Title of page is:"+driver.getTitle());
        String expTitle="Register Account";
           String actTitle;
           actTitle=driver.getTitle();
           assertEquals(actTitle, expTitle);
           driver.close();
	}



}
