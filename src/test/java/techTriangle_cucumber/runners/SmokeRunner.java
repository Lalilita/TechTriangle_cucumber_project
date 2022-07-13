package techTriangle_cucumber.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
				"junit:target/cucumber-xmlReport/Cucumber.xml",
				"html:target/smokeTests-cucumber-reports.html" }, 
		features = "src/test/resources/featureFiles", 
		glue = "techTriangle_cucumber/stepDefinitions",
		dryRun = false,    
		monochrome = true,
		tags = "@lalita"
		
		
		)
		
		
public class SmokeRunner {

	
	
	
	
}
