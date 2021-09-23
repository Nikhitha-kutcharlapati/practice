package mypages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Myaccountregister{
	WebDriver driver;
	WebElement myacc;
	WebElement register;
	//constructor, as everypage needs a webdriver to find elements
			//intitializing the web elements
	public Myaccountregister(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//locating my account and performing click action
	public void clickonMyaccount()
	{
		//locating webelement normally
		myacc=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]"));
		myacc.click();
	}
	//locating register button  and performing click actionsS
	public void clickonregister()
	{
		register=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
		register.click();
	}

}
