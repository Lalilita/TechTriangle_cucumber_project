package techTriangle_cucumber.stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;

public class ThisIsSample extends CommonMethods{


	@Given("User is on Home Page")
	public void user_is_on_home_page() throws Throwable {
		BaseClass.getDriver();
	}

	@When("User click on th Sign in tab")
	public void user_click_on_th_sign_in_tab() {
//		homePage.clickSignInTab();
	}
	@Then("User should be on My Account page with Create an account header")
	public void user_should_be_on_my_account_page_with_create_an_account_header() {
//	    Assert.assertTrue(myAccPage.authenHeader.isDisplayed());
	}
	@When("User enter email address and click on Create an account")
	public void user_enter_email_address_and_click_on_create_an_account() {
//	    myAccPage.newRegister();
	}
	@Then("User should be on account creation page with create an account header")
	public void user_should_be_on_account_creation_page_with_create_an_account_header() {
//		Assert.assertTrue(createPage.createAccHeader.isDisplayed());
		
	}
}
