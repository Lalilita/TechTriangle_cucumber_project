package stepDefinitions;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.CommonMethods;

public class TrainsTest extends CommonMethods {

	@Given("User is on KAYAK Home Page")
	public void user_is_on_kayak_home_page() {
		getDriver();
	}

	@When("User click on theTrain and bus category tap")
	public void user_click_on_the_train_and_bus_category_tap() {
	}
	
	@Then("User should be navigated to the train page and able to input search information in the provided fields")
	public void user_should_be_navigated_to_the_train_page_and_able_to_input_search_information_in_the_provided_fields() {
	}
	
	@Then("User select round trip")
	public void user_select_round_trip() {
	}
	
	@Then("User select {int} adults")
	public void user_select_adults(Integer int1) {
	}
	
	@Then("User select departure station from Union, Washington, D.C., District of Columbia, United States and arrival station New Rochelle, New Rochelle, New York, United States")
	public void user_select_departure_station_from_union_washington_d_c_district_of_columbia_united_states_and_arrival_station_new_rochelle_new_rochelle_new_york_united_states() {
	}
	
	@Then("User select departure and arrival date")
	public void user_select_departure_and_arrival_date() {
	}
	
	@Then("User click on train")
	public void user_click_on_train() {
	}
	
	@Then("User should be able to see the number of trips as a result of the search displayed in different pages with trip duration and prices are displayed and the select button is clickable.")
	public void user_should_be_able_to_see_the_number_of_trips_as_a_result_of_the_search_displayed_in_different_pages_with_trip_duration_and_prices_are_displayed_and_the_select_button_is_clickable() {
	}
	
	@Then("user should also be able select departure trip and returned trip and navigate to the booking page")
	public void user_should_also_be_able_select_departure_trip_and_returned_trip_and_navigate_to_the_booking_page() {
	}

}

