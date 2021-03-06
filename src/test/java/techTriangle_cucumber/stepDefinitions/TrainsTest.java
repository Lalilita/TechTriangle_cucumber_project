package techTriangle_cucumber.stepDefinitions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techTriangle_cucumber.utilities.CommonMethods;

public class TrainsTest extends CommonMethods {

//	@Given("User is on KAYAK Home Page")
//	public void user_is_on_kayak_home_page() {
//		getDriver();
//	}
	
	@When("User click on theTrain and bus category tap")
	public void user_click_on_the_train_and_bus_category_tap() throws InterruptedException {
		homePage.trainsAndBusTab.click();
	}

	@Then("User should be navigated to the {string} and able to input search information in the provided fields")
	public void user_should_be_navigated_to_the_and_able_to_input_search_information_in_the_provided_fields(String page)
			throws InterruptedException {
		Assert.assertTrue(driver.getCurrentUrl().contains(page));

	}

	@Then("User select departure station from {string} and arrival station {string}")
	public void user_select_departure_station_from_and_arrival_station(String departure, String destination)
			throws InterruptedException {
		trainsPage.setDepartureAndDestination(departure, destination);
	}

	@Then("User select {string} and {string}")
	public void user_select_and(String deptDate, String reDate) {
		trainsPage.setDate(deptDate, reDate);
	}

	@Then("User click on train")
	public void user_click_on_train() throws InterruptedException {
		trainsPage.busChckBox.click();
	}

	@Then("User click search button")
	public void user_click_search_button() throws InterruptedException {
		trainsPage.searchBtn.click();
	}

	@Then("User should be able to see the number of trips as a result of the search displayed in different pages")
	public void user_should_be_able_to_see_the_number_of_trips_as_a_result_of_the_search_displayed_in_different_pages()
			throws InterruptedException {
		wait(5);
		int i = 1;
		for (i = 1; i < trainsPage.tripList.size(); i++) {
			Assert.assertTrue(trainsPage.tripList.get(i).isDisplayed());
		}
		System.out.println(trainsPage.pageList.size() + " pages are displayed");
		System.out.println("And " + i + " trips displayed per page");
	}

	@Then("user should also be able select departure trip and returned trip and navigate to the {string}")
	public void user_should_also_be_able_select_departure_trip_and_returned_trip_and_navigate_to_the(String bookingPage)
			throws InterruptedException {
		trainsPage.deptBtn.click(); 	//select departure btn
		wait(2);
		trainsPage.returnBtn.click();  //select return btn
		wait(2);
		switchToChildWindow();
		Assert.assertTrue(trainsPage.bookBtn.isDisplayed());  //go to book page
		System.out.println("book button is display");
	}

	@Then("User can close the browser")
	public void user_can_close_the_broswer() {
	    tearDown();
	}

}
