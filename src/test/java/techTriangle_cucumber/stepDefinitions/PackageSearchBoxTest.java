package techTriangle_cucumber.stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techTriangle_cucumber.utilities.CommonMethods;

public class PackageSearchBoxTest extends CommonMethods{

	@Given("User is on KAYAK Home Page")
	public void user_is_on_kayak_home_page() {
		getDriver();
	}

	@When("User click on the packages category tab")
	public void user_click_on_the_packages_category_tab() {
	   homePage.packagesTab.click();
	}

	@Then("User should be navigated to the package page and able to input information in the search field")
	public void user_should_be_navigated_to_the_package_page_and_able_to_input_information_in_the_search_field() {
	    Assert.assertEquals(driver.getCurrentUrl(), getProperty("packagesUrl"));
	}

	@Then("User enter number of traveler {int} adult")
	public void user_enter_number_of_traveler_adult(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click and select the the airport of departure \\(IAD) and select the city of destination \\(Paris)")
	public void user_click_and_select_the_the_airport_of_departure_iad_and_select_the_city_of_destination_paris() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User select the departure date \\(Aug\\/{int}\\/{int}) and  arrival date \\(Aug\\/{int}\\/{int})")
	public void user_select_the_departure_date_aug_and_arrival_date_aug(Integer int1, Integer int2, Integer int3, Integer int4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click on search button")
	public void user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to see {int} out of {int} recommended hotels on the page with the flight details also displayed when hovering on it.")
	public void user_should_be_able_to_see_out_of_recommended_hotels_on_the_page_with_the_flight_details_also_displayed_when_hovering_on_it(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on the five stars button")
	public void user_click_on_the_five_stars_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on {int}+ review score button")
	public void user_click_on_review_score_button(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select  price at ${double}")
	public void user_select_price_at_$(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to see only one hotel with a price ${double} and related information displayed.")
	public void user_should_be_able_to_see_only_one_hotel_with_a_price_$_and_related_information_displayed(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





}
