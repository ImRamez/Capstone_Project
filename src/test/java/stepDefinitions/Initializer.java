package stepDefinitions;
/*
 * Ramez Hassan
 * Hawks Class 
 * Year: 2021
 */

import core.CapstoneBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends CapstoneBase{
	
	@Before
	public void beforeHooks(Scenario scenario) {
		selectBrowser();
		openBrowser();
	}
	@After
	public void afterHooks(Scenario scenario) {
		closeBrowser();
	}

}
