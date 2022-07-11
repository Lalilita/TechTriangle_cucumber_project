package techTriangle_cucumber.utilities;

import pageObjects.HomePage;
import pageObjects.StaysPage;
import utilities.BaseClass;

public class PageInitializer extends BaseClass {

	public static HomePage homePage;
	public static StaysPage staysPage;
	public static void initialize() {
		homePage = new HomePage();
	
	}
	
}
	
