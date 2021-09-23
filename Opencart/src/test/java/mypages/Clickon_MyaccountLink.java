package mypages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Clickon_MyaccountLink {
	WebDriver driver;
	WebElement myacc;
	WebElement login;
	//constructor, as everypage needs a webdriver to find elements
		//intitializing the web elements
	public Clickon_MyaccountLink(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//locating my account and performing click action
	public void clickonMyaccount()
	{
		myacc=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]"));
		myacc.click();
	}
	//locating login and performing click actionsS
	public void clickonLogin()
	{
		login=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		login.click();
	}

}
