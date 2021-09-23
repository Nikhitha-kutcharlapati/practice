package stepdefinition;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.Flipcartlogin;


public class Flipcart {
	static WebDriver driver;
	Flipcartlogin elp;
	
	@Given("Open chrome and navigate to login page")
	public void open_chrome_and_navigate_to_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		 driver.manage().window().maximize();
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) throws InterruptedException {
		elp= new Flipcartlogin(driver);
		//sending valid username and password
		elp.setUserName("9346364605");
		elp.setPassWord("Nicky@123");
		Thread.sleep(2000);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		//clicking on login button
				elp.clickLoginBtn();
				 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	@Then("User should get logged in")
	public void user_should_get_logged_in() throws InterruptedException {
		System.out.println("After logging in:"+driver.getTitle()); 
       String expTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
          String actTitle;
          actTitle=driver.getTitle();
          assertEquals(actTitle, expTitle);
		  Thread.sleep(10000);
   		   driver.close();
	}


}





	
