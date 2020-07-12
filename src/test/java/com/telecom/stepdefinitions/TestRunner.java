package com.telecom.stepdefinitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
                  glue="com.telecom.stepdefinitions",
                  dryRun=false,
                  plugin="html:target//Cucumber-html-reports",
                  monochrome=true,
                  tags= {"@sanity"})
	
                //tags= {"@sanity"} tags= {"~@sanity"} tags= {"@sanity,@jai"} tags= {"@sanity","@jai"}


public class TestRunner {

}
