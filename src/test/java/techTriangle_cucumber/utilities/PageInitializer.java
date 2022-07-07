package techTriangle_cucumber.utilities;

import techTriangle_cucumber.pageObjects.HomePage;
import techTriangle_cucumber.pageObjects.PackagesPage;

public class PageInitializer extends BaseClass {

	public static HomePage homePage;
	public static PackagesPage packagesPage;
	
	
	
	public static void initialize() {
		homePage = new HomePage();
		packagesPage = new PackagesPage();
	}
	
}
	
