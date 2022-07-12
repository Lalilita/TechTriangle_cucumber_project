package techTriangle_cucumber.stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;
import techTriangle_cucumber.utilities.Constants;

public class BookingForHotelTest extends CommonMethods{
	@Given("user on the hotel search result page")
	public void user_on_the_hotel_search_result_page() {
	   System.out.println("User is in the search result page looking for booking");
	}

	
	@When("user scroll mouse to Conrad New York Midtown user should be able to see different booking providers")
	public void user_scroll_mouse_to_conrad_new_york_midtown_user_should_be_able_to_see_different_booking_providers() {
		 staysPage.findConradNewYorkMidtown();
	}

	@Then("user click on KAYAK booking link")
	public void user_click_on_kayak_booking_link() {
		staysPage.kayakBookingProvider();
	    
	}

	@Then("user should be navigated to the new window tap where user can select the room and do the booking process")
	public void user_should_be_navigated_to_the_new_window_tap_where_user_can_select_the_room_and_do_the_booking_process() {
	   staysPage.dealingWindow();
	}

	@Then("user fill in the booking information required")
	public void user_fill_in_the_booking_information_required() {
	   staysPage.bookingWindow();
	}

	@Then("user can also validate the booking Now button is enabled to be booked if all information required are filled.")
	public void user_can_also_validate_the_booking_now_button_is_enabled_to_be_booked_if_all_information_required_are_filled() {
	    staysPage.verifyBookButton();
	}

	@Then("user finish booking")
	public void user_finish_booking() {
		BaseClass.tearDown();
	 
	}

	
}
