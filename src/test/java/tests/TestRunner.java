package tests;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//dryRun = true,
	features = "src/test/resources/Features/RediffLogin.feature",
		glue = "setpDefinitions",
		plugin = {"pretty" , "html: html-report"},
		monochrome = true,
		tags = "@login or @reg" //OR execute 3 scenarios
		//tags = {"@login and @pri1"} //And will execute 1 scenario
		//tags = {"not @pri1"} // NOT execute one Scenario
		)

public class TestRunner {

}
