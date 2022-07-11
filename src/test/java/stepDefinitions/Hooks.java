package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.BaseClass;
import utilities.CommonMethods;

public class Hooks {
	
	@Before			
	public void setup() {
		BaseClass.getDriver();
	}
	
	
	@After
	public void after(Scenario scenario) {
		if (scenario.isFailed()) {
            CommonMethods.takeScreenshot("scnerarioFailed");
		}
	}

}
