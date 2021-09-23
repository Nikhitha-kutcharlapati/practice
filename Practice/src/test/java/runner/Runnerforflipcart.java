package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import cucumber.api.*;
@CucumberOptions(features="src/test/resources/features/flipcart.feature",glue= {"stepdefinition"})


public class Runnerforflipcart extends AbstractTestNGCucumberTests {

}













