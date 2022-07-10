package techTriangle_cucumber.utilities;

import techTriangle_cucumber.pageObjects.HomePage;
import techTriangle_cucumber.pageObjects.PackagesPage;
import techTriangle_cucumber.pageObjects.ThingToDoPage;
import techTriangle_cucumber.pageObjects.TrainsPage;
import techTriangle_cucumber.pageObjects.TravelRestrictionsPage;

public class PageInitializer extends BaseClass {

	public static HomePage homePage;
	public static PackagesPage packagesPage;
	public static TrainsPage trainsPage;
	public static ThingToDoPage thingsToDoPage;
	public static TravelRestrictionsPage travelRestrictpage;
	
	
	
	public static void initialize() {
		homePage = new HomePage();
		packagesPage = new PackagesPage();
		trainsPage = new TrainsPage();
		thingsToDoPage = new ThingToDoPage() ;
		travelRestrictpage = new TravelRestrictionsPage();
		
	}
	
}
	
