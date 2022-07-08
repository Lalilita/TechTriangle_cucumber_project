package techTriangle_cucumber.stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;

public class SearchForHotel extends CommonMethods{

@Given("user on Kayak homepage")
public void user_on_kayak_homepage() {
	BaseClass.getDriver();
}

@Given("user click on the stay tab")
public void user_click_on_the_stay_tab() {
	staysPage.clickStays();   
}

@Given("user on the stays page")
public void user_on_the_stays_page() {
   System.out.println(" I am in Stays Page");
}

@When("user fill in searching criteria")
public void user_fill_in_searching_criteria() {
	
	staysPage.searchField();
   
}

@When("user click on search button")
public void user_click_on_search_button() {
	
	staysPage.search();
}

@Then("user should be able to see the search result is displayed")
public void user_should_be_able_to_see_the_search_result_is_displayed() {
    staysPage.verifySearchresultDisplay();
}
@Then("user click on Hotel class and Review score")
public void user_click_on_hotel_class_and_review_score() {
	 staysPage.furtherSearchresult();
}

@Then("user should be able to see new search results are displayed")
public void user_should_be_able_to_see_new_search_results_are_displayed() {
    staysPage.verifyImageAndHotelListIsDisplayed();
}
	
}
