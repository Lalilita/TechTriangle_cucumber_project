package techTriangle_cucumber.stepDefinitions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

	@Then("User click and select the the airport of departure \\(IAD) and select the city of destination \\(Paris)")
	public void user_click_and_select_the_the_airport_of_departure_iad_and_select_the_city_of_destination_paris() {
	    sendText(homePage.toField, getProperty("destination"));
	    homePage.toField.sendKeys(Keys.RETURN);
	}
	@Then("User select the departure date and arrival date")
	public void user_select_the_departure_date_and_arrival_date() {
		homePage.startDateField.click();
		checkInDate(homePage.startDateField, homePage.webMonthYear, homePage.webDayList, homePage.nextMonthArrow, 
				getProperty("startYear"), getProperty("startMonth"),getProperty("startDate"));
//		checkOutDate(getProperty("endYear"), getProperty("endMonth"),getProperty("endDate"));
	}
	@Then("User click on search button")
	public void user_click_on_search_button() {
		homePage.searchBtn.click();
	}
	@Then("User should be able to see {int} out of all recommended hotels on the page with the flight details also displayed when hovering on it.")
	public void user_should_be_able_to_see_out_of_all_recommended_hotels_on_the_page_with_the_flight_details_also_displayed_when_hovering_on_it(Integer int1) {
		Assert.assertEquals(packagesPage.hotelsOnPageList.size(), Integer.parseInt(getProperty("hotelAmountOnPage")));
		for(int i = 0; i<= packagesPage.hotelsOnPageList.size();i++) {
		hover(packagesPage.seeFlightDetails.get(i));
		System.out.println(getJSObject());
		}
	}
	@When("User click on the five stars button")
	public void user_click_on_the_five_stars_button() {
		packagesPage.fifthStarBtn.click();
	}
	@When("User click on {int}+ review score button")
	public void user_click_on_review_score_button(Integer int1) {
		packagesPage.eightPlusBtn.click();
	}
	@When("User select  price at ${double}")
	public void user_select_price_at_$(Double double1) {
		jsClick(packagesPage.rightSlider);
		dragAndDropBy(packagesPage.rightSlider, 100, 125);
	}
	@Then("User should be able to see only one hotel with a price ${double} and related information displayed.")
	public void user_should_be_able_to_see_only_one_hotel_with_a_price_$_and_related_information_displayed(Double double1) {
		Assert.assertTrue(getPrice(packagesPage.hotelPriceResult) <= Integer.parseInt(getProperty("priceSelect")));
	}






}
