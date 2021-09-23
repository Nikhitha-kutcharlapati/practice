
package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import cucumber.api.*;

@CucumberOptions(features="src/test/resources/features/practiceform.feature",glue= {"stepdefinition"},monochrome = true,plugin= {"json:JSONReport/cucumber.json","html:HTMLReports","pretty","junit:unitreports/cucumber.xml"})


public class Practicerunner extends AbstractTestNGCucumberTests {

}

