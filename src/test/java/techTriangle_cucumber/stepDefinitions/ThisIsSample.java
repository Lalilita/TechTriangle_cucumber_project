package techTriangle_cucumber.stepDefinitions;

import io.cucumber.java.en.Given;
import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;

public class ThisIsSample extends CommonMethods{


	@Given("User is on Home Page")
	public void user_is_on_home_page() throws Throwable {
		BaseClass.getDriver();
	}


}
