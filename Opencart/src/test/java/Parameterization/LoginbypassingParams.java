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
public class LoginbypassingParams{
    WebDriver driver;
    String csvPath="C:\\Users\\kunikhit\\eclipse-workspace\\Opencart\\login.csv";
    CSVReader reader;
    
    @BeforeTest
    public void beforeTest() throws FileNotFoundException {
        reader = new CSVReader(new FileReader(csvPath));
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
          driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }
    
@Test
public void login() throws IOException, InterruptedException {
    String [] values;
    while((values=reader.readNext())!=null) {
        String email=values[0];
        String pwd=values[1];
          driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
        
        
          driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
         
          driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(pwd);
          driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
          
          driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
          Thread.sleep(3000);
    }
}
@AfterTest
public void afterTest() throws InterruptedException {
    Thread.sleep(2000);
    driver.close();
    System.out.println("Done..............!!!");
}
}