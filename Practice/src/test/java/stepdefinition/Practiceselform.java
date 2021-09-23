package stepdefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Practiceform;
import java.util.concurrent.TimeUnit;


public class Practiceselform {

	WebDriver driver;
	Practiceform elp;
	
	@Given("Open browser and selenium practice form") 
	public void open_browser_and_selenium_practice_form() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();   
	}

	@When("User enter {string} in the firstname input")
	public void user_enter_in_the_firstname_input(String string) {
		elp= new Practiceform(driver);
		elp.setfirstname("Nikhitha");
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

	}

	@When("User enter {string} in the lastname input")
	public void user_enter_in_the_lastname_input(String string) {
		elp= new Practiceform(driver);
		elp.setlastname("varma");
		 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	@When("User select gender")
	public void user_select_gender() {
		elp= new Practiceform(driver);
		elp.selectGender("Male");
	    
	}

	@When("User select years of experience")
	public void user_select_years_of_experience() {
		elp= new Practiceform(driver);
		elp.selectexperience(3);
	}

	@When("User enter {string} in the date input field")
	public void user_enter_in_the_date_input_field(String string) {
		elp= new Practiceform(driver);
		elp.setdate("07/09/2021");
		
	}

	@When("User selects the profession")
	public void user_selects_the_profession()  {
		elp= new Practiceform(driver);
		//Thread.sleep(3000);
		elp.setProfession("Manual Tester");  
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		elp.setProfession("Automation Tester"); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("User selects the automation tools")
	public void user_selects_the_automation_tools() throws InterruptedException {

		elp= new Practiceform(driver);
		Thread.sleep(2000);
		elp.setautomationtools("UTF");
		elp.setautomationtools("Selenium Webdriver");  
	}
		
	
	@When("User selects the continents")
	public void user_selects_the_continents() {
		elp= new Practiceform(driver);
		elp.setContinent("Europe");
	}

	@When("User selects the selenium commands")
	public void user_selects_the_selenium_commands() {
		elp= new Practiceform(driver);
		elp.setcommands("Wait Commands");
	    
	}

	@When("User uploads image")
	public void user_uploads_image() {
		elp= new Practiceform(driver);
		elp.uploadfile("C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\week4.png");
	}

	@When("user download the file'")
	public void user_download_the_file() throws InterruptedException {
		  
			elp= new Practiceform(driver);
			System.out.println("?????????????????????????????????????????????????????******************************************************");
			 elp.downloadfile();
			 Thread.sleep(5000);
			 System.out.println("after submitting the form :"+driver.getTitle());
			 driver.navigate().back();
			 //driver.switchTo().defaultContent();
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		   Thread.sleep(7000); 
			 elp.submitform();
	}

	@Then("the data gets submitted")
	public void the_data_gets_submitted() {
		System.out.println("after submitting the form :"+driver.getTitle());
		driver.close();
	}
}















