package utilities;

import pageObjects.HomePage;
import pageObjects.PackagesPage;
import pageObjects.StaysPage;
import pageObjects.TrainsPage;

public class PageInitializer extends BaseClass {

	public static HomePage homePage;
	public static PackagesPage packagesPage;
	public static TrainsPage trainsPage;
	public static StaysPage staysPage;


	
	
	
	
	public static void initialize() {
		homePage = new HomePage();
		packagesPage = new PackagesPage();
		trainsPage = new TrainsPage();
		staysPage = new StaysPage();
	}
	
}
	
