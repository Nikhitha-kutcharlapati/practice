package stepdefinition;


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypages.Clickon_MyaccountLink;


public class Tc_01ClickonMyaccount{
	
	static WebDriver driver; 
	//this is to test githubbbbbb

	@Given("Openchrome and start the application")
	public void openchrome_and_start_the_application() {
		//starting chrome driver and navigating to page
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://demo.opencart.com");
		 driver.manage().window().maximize();
	} 
	//system clicks on myaccount and then login 
	@When("User clicks on MyAccount dropdown")
	public void user_clicks_on_my_account_dropdown() throws InterruptedException {
		
		Clickon_MyaccountLink obj1 = new Clickon_MyaccountLink(driver);
		 obj1.clickonMyaccount();
		 
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	   
	}
	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		Clickon_MyaccountLink obj2 = new Clickon_MyaccountLink(driver);
		 obj2.clickonLogin();
		 Thread.sleep(2000);
	}
	//applying assertion for comparing actual and expected page title
	@Then("System should navigate to login page")
	public void system_should_navigate_to_login_page() {
		System.out.println("After Clicking on login Title of page is:"+driver.getTitle());
        String expTitle="Account Login";
           String actTitle;
           actTitle=driver.getTitle();
           assertEquals(actTitle, expTitle);
           driver.quit();
	}

}

