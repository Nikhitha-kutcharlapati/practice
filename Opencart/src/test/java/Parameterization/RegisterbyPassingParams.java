package Parameterization;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

import au.com.bytecode.opencsv.CSVReader;
public class RegisterbyPassingParams {
    WebDriver driver;
    String csvPath="C:\\Users\\kunikhit\\eclipse-workspace\\Opencart\\register.csv";
    CSVReader reader;
    @BeforeTest
    public void beforeTest() throws FileNotFoundException {
        reader = new CSVReader(new FileReader(csvPath));
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
          driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register");
    }
@Test
public void login() throws IOException, InterruptedException {
    String [] values;
    while((values=reader.readNext())!=null) {
        String firstname=values[0];
        String lastname=values[1];
        String email=values[2];
        String phone = values[3];
        String pass = values[4];
        String confirmpass=values[5];
        
          
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstname);
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastname);
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(confirmpass);
        driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")).click();
        
        
Thread.sleep(3000);
    }
}
@AfterTest
public void afterTest() throws InterruptedException {
    Thread.sleep(2000);
    //driver.close();
    System.out.println("Done..............!!!");
}
}