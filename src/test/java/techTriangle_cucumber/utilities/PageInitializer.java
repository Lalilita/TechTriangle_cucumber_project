package techTriangle_cucumber.utilities;

import techTriangle_cucumber.pageObjects.HomePage;

public class PageInitializer extends BaseClass {

	public static HomePage homePage;
	
	public static void initialize() {
		homePage = new HomePage();
	}
	
}
	
