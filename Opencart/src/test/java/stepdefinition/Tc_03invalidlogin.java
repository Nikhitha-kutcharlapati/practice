package stepdefinition;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypages.Validlogin;

public class  Tc_03invalidlogin {
	WebDriver driver;
	Validlogin elp;
	@Given("Open chrome browser and navigate to login page")
	public void open_chrome_browser_and_navigate_to_login_page() {
		//starting chrome driver and navigating to page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");	
		 driver.manage().window().maximize();
	}
	//sending invalid username and password
	@When("Enter invalid credentials in {string} and {string} fields")
	public void enter_invalid_credentials_in_and_fields(String string, String string2) throws InterruptedException {
		driver.findElement(By.id("input-email")).sendKeys(string);
		driver.findElement(By.id("input-password")).sendKeys(string2);
		Thread.sleep(2000);
	}	
	@When("Click on login button for login")
	public void click_on_login_button() {
		elp= new Validlogin(driver);
		elp.clickLoginBtn();
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@Then("It should display error message")
	public void it_should_display_error_message(){
		//displaying the error message
		String msg=elp.checkError();
		System.out.println("Error msg is "+msg);
        String expTitle="Account Login";
           String actTitle;
           actTitle=driver.getTitle();
           assertEquals(actTitle, expTitle);
		  driver.close();
	}


}






	
