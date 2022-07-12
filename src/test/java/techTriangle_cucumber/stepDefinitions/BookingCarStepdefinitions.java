package techTriangle_cucumber.stepDefinitions;

import io.cucumber.java.en.*;
import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;

public class BookingCarStepdefinitions extends CommonMethods {

	/*@Given("User is on KAYAK Home Page")
	public void user_is_on_kayak_home_page() {
		getDriver();
	}*/

	@When("User click on car tab") // call from pageInitialize
	public void user_click_on_car_tab() {
		bkCarPg.clickCarTab();
	}

	@When("User should be navigated to car page")
	public void user_should_be_navigated_to_car_page() {
		bkCarPg.verifyCarPage();
	}

	@When("User scroll down to top {int} popular cities")
	public void user_scroll_down_to_top_popular_cities(Integer int1) {
		scrollToElement(bkCarPg.EightPopularCities); // method( page.destination)
	}

	@When("User should see the {int} slide and can click on each slide")
	public void user_should_see_the_slide_and_can_click_on_each_slide(Integer int1) {
		bkCarPg.clickCarCity();
	}

	@When("User click  the cities on the  slide")
	public void user_click_the_cities_on_the_slide() {
		bkCarPg.clickFLcity();
	}

	@Then("User able to see the list of rental car and show the pickup location is the same with the city in the slide")
	public void user_able_to_see_the_list_of_rental_car_and_show_the_pickup_location_is_the_same_with_the_city_in_the_slide() {
		bkCarPg.verifyRentalCarLocation();
	}

	// 4th test case

	@When("User select the small car")
	public void user_select_the_small_car() {
		bkCarPg.clickSmallCarTab();
	}

	@Then("User should see the check box for car type")
	public void user_should_see_the_check_box_for_car_type() {
		bkCarPg.verifyCheckBoxShown();
	}

	@When("User select the car type")
	public void user_select_the_car_type() {
		bkCarPg.carType();
	}

	@Then("User able to see the list of rental car the same as you select car type")
	public void user_able_to_see_the_list_of_rental_car_the_same_as_you_select_car_type() {
		bkCarPg.verifyCarTypeSelected();
	}

	// 1st test case

	@Then("User able to see the search rental car box")
	public void user_able_to_see_the_search_rental_car_box() {
		bkCarPg.verifySearchCarBoxShown();
	}

	@When("User enter a city and select  start\\/end date  and  click search button")
	public void user_enter_a_city_and_select_start_end_date_and_click_search_button() {

	//	bkCarPg.enterCarBookingInfo();
	
		
		
	}

	@Then("User able to see the rental car list and show band ,rental agency and the price")
	public void user_able_to_see_the_rental_car_list_and_show_band_rental_agency_and_the_price() {

	}

	@When("User click the car brand")
	public void user_click_the_car_brand() {

	}

	@Then("User able to see the offer from rental agency")
	public void user_able_to_see_the_offer_from_rental_agency() {

	}

}
