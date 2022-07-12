package techTriangle_cucumber.utilities;

import techTriangle_cucumber.pageObjects.BookingCarPage;
import techTriangle_cucumber.pageObjects.FlightPage;
import techTriangle_cucumber.pageObjects.HomePage;
import techTriangle_cucumber.pageObjects.PackagesPage;
import techTriangle_cucumber.pageObjects.StaysPage;
import techTriangle_cucumber.pageObjects.ThingToDoPage;
import techTriangle_cucumber.pageObjects.TrainsPage;
import techTriangle_cucumber.pageObjects.TravelRestrictionsPage;

public class PageInitializer extends BaseClass {

	public static HomePage homePage;
	public static PackagesPage packagesPage;
	public static TrainsPage trainsPage;
	public static FlightPage flightPage;
	public static ThingToDoPage thingsToDoPage;
	public static TravelRestrictionsPage travelRestrictpage;
	public static StaysPage staysPage;
	public static BookingCarPage bkCarPg;
	
	
	public static void initialize() {
		homePage = new HomePage();
		packagesPage = new PackagesPage();
		trainsPage = new TrainsPage();
		flightPage = new FlightPage();
		thingsToDoPage = new ThingToDoPage() ;
		travelRestrictpage = new TravelRestrictionsPage();
		staysPage = new StaysPage();
		bkCarPg = new BookingCarPage();
	}
	
}
	
