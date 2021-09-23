package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Practiceform {
	WebDriver driver;
	
	//locating firstname textbox
		@FindBy(name="firstname")
		WebElement firstname;
		
		//locating lastname textbox
		@FindBy(name="lastname")
		WebElement lastname;
		
		@FindBy(name="sex")
		List<WebElement> genderBtn;
		
		
		@FindBy(name="exp")
		List<WebElement> rdo_experience;
		
		@FindBy(id="datepicker")
		WebElement txt_date;
		
		@FindBy(name="profession")
		List<WebElement> profession;
		
		@FindBy(name="tool")
		List<WebElement> automationtools;
		
		@FindBy(name="continents")
		WebElement continent;
		
		@FindBy(id="selenium_commands")
		WebElement commands;
		
		@FindBy(id="photo")
		WebElement uploadimg;
		
		@FindBy(xpath="//*[@id=\"post-body-3077692503353518311\"]/div/div/div[29]/div[2]/div/a")
		WebElement download;
		
		@FindBy(id="submit")
		WebElement btn_submit;
		
		public Practiceform(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
			
			//methods to set first and last names, email and telephone, password and confirm password
			public void setfirstname(String fn) {
				firstname.sendKeys(fn);	
				}
			public void setlastname(String ln) {
				lastname.sendKeys(ln);	
				}
			public void selectGender(String genderVal)
			{
				int i=0; 
				{
					if(genderVal.equals("Male"))
					{
						genderBtn.get(i).click();
						
					}
					else
					{
						genderBtn.get(i+1).click();
					}
				}
				}
				public void selectexperience(int yearofexp)
				{
					int i=1;
					{
						if(yearofexp == 1)
						{
							rdo_experience.get(i).click();
						}
						else if(yearofexp == 2)
						{
							rdo_experience.get(i+1).click();
							
						}
						else if(yearofexp == 3)
						{
							rdo_experience.get(i+2).click();
							
						}
						else if(yearofexp == 4)
						{
							rdo_experience.get(i+3).click();
							
						}
						else if(yearofexp == 5)
						{
							rdo_experience.get(i+4).click();
							
						}
						else if(yearofexp == 6)
						{
							rdo_experience.get(i+5).click();
							
						}
						else if(yearofexp == 7)
						{
							rdo_experience.get(i+6).click();
							
						}
					}
				}
				
				public void setdate(String dt) {
					txt_date.sendKeys(dt);	
					}
				public void setProfession(String proVal)
				{
					
					int i=0; 
					{
						if(proVal.equals("Manual Tester"))
						{
							profession.get(i).click();
							
						}
						if(proVal.equals("Automation Tester"))
						{
							profession.get(i+1).click();
						}
					}
				}
				public void setautomationtools(String proVal)
				{
					int i=0; 
					{
						if(proVal.equals("UTF"))
						{
							automationtools.get(i).click();
							
						}
						if(proVal.equals("Protractor"))
						{
							automationtools.get(i+1).click();
						}
						if(proVal.equals("Selenium Webdriver"))
						{
							automationtools.get(i+2).click();
						}
					}
				}
				 public void setContinent(String c)
					{
					Select sel1=new Select(continent);
					sel1.selectByVisibleText(c);
					}
				 public void setcommands(String c)
					{
					Select sel2=new Select(commands);
					sel2.selectByVisibleText(c);
					}
				 public void downloadfile()
				 {
					 download.click();
				 }
				 public void uploadfile(String path)
				 {
					 uploadimg.sendKeys(path);
				 }
				 public void submitform()
				 {
					 btn_submit.click();
				 }
}






	
	
	
	
