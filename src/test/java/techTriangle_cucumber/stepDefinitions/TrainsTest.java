package techTriangle_cucumber.stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techTriangle_cucumber.utilities.CommonMethods;

public class TrainsTest extends CommonMethods {

//	@Given("User is on KAYAK Home Page")
//	public void user_is_on_kayak_home_page() {
//		getDriver();
//	}

	@When("User click on theTrain and bus category tap")
	public void user_click_on_the_train_and_bus_category_tap() {
		homePage.trainsAndBusTab.click();
	}
	@Then("User should be navigated to the {string} and able to input search information in the provided fields")
	public void user_should_be_navigated_to_the_and_able_to_input_search_information_in_the_provided_fields(String page) throws InterruptedException {
		Assert.assertTrue(driver.getCurrentUrl().contains(page));
		
	}
	@Then("User select departure station from {string} and arrival station {string}")
	public void user_select_departure_station_from_and_arrival_station(String departure , String destination) throws InterruptedException {
		trainsPage.departureBox.click();
		trainsPage.departureInput.sendKeys(departure);
		Thread.sleep(1000);
		trainsPage.departureInput.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		trainsPage.destinationInput.sendKeys(destination);
		Thread.sleep(1000);
		trainsPage.destinationInput.sendKeys(Keys.ENTER);
	}
//	@Then("User select {string}  and {string}")
//	public void user_select_and(String startDate, String endDate) throws InterruptedException {
//		trainsPage.startDate.sendKeys(Keys.TAB);
//		Thread.sleep(1000);
//		trainsPage.endDate.sendKeys(Keys.TAB);
//		Thread.sleep(1000);
//		
//	}
	@Then("User click on train")
	public void user_click_on_train() {
		trainsPage.busChckBox.click();
	}
	
	@Then("User click search button")
	public void user_click_search_button() {
		trainsPage.searchBtn.click();
	}
	@Then("User should be able to see the number of trips as a result of the search displayed in different pages with trip duration and prices are displayed and the select button is clickable.")
	public void user_should_be_able_to_see_the_number_of_trips_as_a_result_of_the_search_displayed_in_different_pages_with_trip_duration_and_prices_are_displayed_and_the_select_button_is_clickable() {
	}
	@Then("user should also be able select departure trip and returned trip and navigate to the {string}")
	public void user_should_also_be_able_select_departure_trip_and_returned_trip_and_navigate_to_the(String string) {
	}




//	@Then("User should be able to see the number of trips as a result of the search displayed in different pages with trip duration and prices are displayed and the select button is clickable.")
//	public void user_should_be_able_to_see_the_number_of_trips_as_a_result_of_the_search_displayed_in_different_pages_with_trip_duration_and_prices_are_displayed_and_the_select_button_is_clickable() {
//		int i = 0;
//		for(i = 0; i <= trainsPage.tripList.size(); i++) {
//			Assert.assertTrue(trainsPage.tripList.get(i).isDisplayed());
//		}
//		System.out.println(trainsPage.pageList.size()+" pages are displayed");
//		System.out.println("And "+i+" trips displayed per page");
//		
//		for(int j = 1; j <= trainsPage.tripDetailList.size(); j+=2) {
//			Assert.assertTrue(trainsPage.tripDetailList.get(j).isDisplayed());
//		}
//	}
//
//	@Then("user should also be able select departure trip and returned trip and navigate to the booking page")
//	public void user_should_also_be_able_select_departure_trip_and_returned_trip_and_navigate_to_the_booking_page() {
//		trainsPage.DeptAndReturnBtn.click();
//		trainsPage.DeptAndReturnBtn.click();
//		trainsPage.bookBtn.click();
//		Assert.assertTrue(driver.getCurrentUrl().contains(getProperty("urlContains")));
//	}

}
