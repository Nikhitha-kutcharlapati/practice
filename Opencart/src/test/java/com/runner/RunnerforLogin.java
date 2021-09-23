package com.runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import cucumber.api.*;

@CucumberOptions(features="src/test/resources/features/login.feature",glue= {"stepdefinition"})


public class RunnerforLogin extends AbstractTestNGCucumberTests {

}



