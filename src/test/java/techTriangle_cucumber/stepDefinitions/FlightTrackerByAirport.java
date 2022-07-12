package techTriangle_cucumber.stepDefinitions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techTriangle_cucumber.utilities.CommonMethods;

public class FlightTrackerByAirport extends CommonMethods {
	
//	@Given("User is on KAYAK Home Page")
//	public void user_is_on_kayak_home_page() {
//		getDriver();
//	}
	
	@When("User click on the Flight Tracker tap")
	public void user_click_on_the_flight_tracker_tap() {
		homePage.flightTrackerTab.click();
	}
	
	@Then("User should be navigated to {string}")
	public void user_should_be_navigated_to_page(String page) {
		Assert.assertTrue(driver.getCurrentUrl().contains(page));
	}
	@When("User select Airport tab")
	public void user_select_airport_tab() {
		flightPage.airportTab.click();
	}
	@Then("User enter {string} in Airline field")
	public void user_enter_in_Airport_field(String airport) {
		flightPage.enterAirport(airport);
	}
	@Then("User enter {string} in Flight Number field")
	public void user_enter_in_Flight_Number_field(String airline) {
		flightPage.enterAirlineAirport(airline);
	}
	@Then("User click on trackFlight Button")
	public void user_click_on_track_flight_button() {
		flightPage.airportTrackFlightBtn.click();
	}
	@Then("User should be able to track the flight based on the airport name, airline name and date they have input.")
	public void user_should_be_able_to_track_the_flight_based_on_the_airport_name_airline_name_and_date_they_have_input() {
		Assert.assertTrue(flightPage.flightHeader.isDisplayed());
		Assert.assertTrue(flightPage.flightMap.isDisplayed());
	}


}
