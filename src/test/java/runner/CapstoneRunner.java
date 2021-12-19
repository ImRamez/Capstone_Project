package runner;
/*
 * Ramez Hassan
 * Hawks Class 
 * Year: 2021
 */

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", 
glue = "stepDefinitions", 
tags = "@Smoke2", 
dryRun = false, 
monochrome = true, 
strict = true, 
plugin = {"pretty",
		"html:target/site/cucumber-pretty",
		"json:target/cucumber.json" },
publish = true

)

public class CapstoneRunner {

}
