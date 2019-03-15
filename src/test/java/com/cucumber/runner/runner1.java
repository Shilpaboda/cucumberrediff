package com.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/main/resources/redifflogin.feature", glue = "com.cucumber.testcases")
public class runner1 extends AbstractTestNGCucumberTests {

}
