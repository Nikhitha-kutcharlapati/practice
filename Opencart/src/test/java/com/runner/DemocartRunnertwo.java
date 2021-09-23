
package com.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import cucumber.api.*;

@CucumberOptions(features="src/test/resources/features/registerVA.feature",glue= {"Stepdefinition_register"})


public class DemocartRunnertwo extends AbstractTestNGCucumberTests {

}