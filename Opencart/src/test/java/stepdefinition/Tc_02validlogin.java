package stepdefinition;

import static org.junit.Assert.assertEquals;


import java.util.concurrent.TimeUnit;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import mypages.Validlogin;


public class Tc_02validlogin {
	static WebDriver driver;
	 Validlogin elp;
	
	@Given("^Open chrome and navigate to login page$")
	public void Open_chrome_and_navigate_to_login_page() throws Throwable {
		//starting chrome driver and navigating to page
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login");
		 driver.manage().window().maximize();
		}
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) throws InterruptedException {
		elp= new Validlogin(driver);
		//sending valid username and password
		elp.setUserName("nikhitha123@gmail.com");
		elp.setPassWord("nick123");
		Thread.sleep(2000);
	}
	@When("^Click on login button$")
	public void Click_on_login_button() throws Throwable { 
		//clicking on login button
		elp.clickLoginBtn();
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	@Then("User should get logged in")
	public void user_should_get_logged_in(){
		//using assertion, comparing expected and actual title
		System.out.println("After logging in:"+driver.getTitle()); 
        String expTitle="My Account";
           String actTitle;
           actTitle=driver.getTitle();
           assertEquals(actTitle, expTitle);
   		driver.close();
   		
	}	
	
}
 
