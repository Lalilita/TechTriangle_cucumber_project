package stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;
import utilities.CommonMethods;

public class SliderFunctionalityTest extends CommonMethods{


	@When("use scroll mouse to Top eight popular cities")
	public void use_scroll_mouse_to_top_eight_popular_cities() {
		staysPage.scrollToPopularCities();
	
	}

	@Then("user should be able to see number of sliders and number of image per slide")
	public void user_should_be_able_to_see_number_of_sliders_and_number_of_image_per_slide() {
		staysPage.slidersAndImagesCount();

	}

	@Then("user should be able click on each images")
	public void user_should_be_able_click_on_each_images() {
		
		staysPage.verifyImagesClickable();

	}

	@Then("user should be able to see the name city attaches with image")
	public void user_should_be_able_to_see_the_name_city_attaches_with_image() {
		staysPage.verifyCityName();
	}

	@Then("user close the window")
	public void user_close_the_window() {
	   BaseClass.tearDown();
	}

}
