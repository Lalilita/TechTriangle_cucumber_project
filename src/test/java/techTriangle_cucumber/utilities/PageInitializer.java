package techTriangle_cucumber.utilities;

import techTriangle_cucumber.pageObjects.HomePage;
import techTriangle_cucumber.pageObjects.StaysPage;

public class PageInitializer extends BaseClass {

	public static HomePage homePage;
	public static StaysPage staysPage;
	
	public static void initialize() {
		homePage = new HomePage();
		staysPage = new StaysPage();
	}
	
}
	
