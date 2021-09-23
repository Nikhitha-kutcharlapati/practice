package stepdefinition;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypages.Validlogin;



public class Tc_04forgetpass {
	WebDriver driver;
	Validlogin elp;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		//starting chrome driver and navigating to page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/login");
		 driver.manage().window().maximize();
	}
	@When("User clicks on forget password link")
	public void user_clicks_on_forget_password_link() {
		elp = new Validlogin (driver);
		elp.clickonforgetpassword();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	//after clicking on forgetpassword the system navigates to forgetpassword page
	@Then("System navigates to Forgot password page")
	public void system_navigates_to_forgot_password_page() {
		System.out.println("After clicking on forgetpasswordlink :"+driver.getTitle()); 
        String expTitle="Forgot Your Password?";
           String actTitle;
           actTitle=driver.getTitle();
           assertEquals(actTitle, expTitle);
           driver.close();
	}
}