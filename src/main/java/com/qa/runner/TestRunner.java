package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	     features = "/Users/fatima/Desktop/Reza/JAVA/POMCucumber/src/main/java/com/qa/features" //path of feature file
	     ,glue= {"com/qa/stepDefininations"}, //path of step definition file
	     plugin = {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
	     monochrome=true, //generate readable output in display console 
	     strict=true, 
	     dryRun = false 
	//   ,tags= {"@SmokeTest", "@RegressionTest", "~@End2End"}
	     )

	public class TestRunner {
		
	}
	
	
	

