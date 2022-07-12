package techTriangle_cucumber.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;

public class FlightPage extends CommonMethods {

	public FlightPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@class='flight-number-link active ']")
	public WebElement flightNumberTab;

	@FindBy(xpath = "//div[@class='track-form-container']")
	public WebElement flightTrackerForm;

	// Flight number
	@FindBy(xpath = "//input[@placeholder='Airline']")
	public WebElement airlineInput;

	@FindBy(xpath = "//input[@placeholder='Flight Number']")
	public WebElement flightInput;

	@FindBy(xpath = "//*[contains(@id,'flightNumberTrackForm-airline-smartbox-dropdown')]/ul/li")
	public WebElement airLineFirstOption;

	@FindBy(xpath = "//*[contains(@id,'lightNumberTrackForm-submit') and @type='submit']")
	public WebElement trackFlightBtn;

	@FindBy(xpath = "//*[@class='errorContent']")
	public WebElement errorContent;

	@FindBy(xpath = "//*[contains(@class,' errorDialogCloseButton')]")
	public WebElement dismissContent;

	@FindBy(xpath = "//*[@class='col col-6-12']")
	public WebElement flightHeader;

	@FindBy(xpath = "//*[@class='map']")
	public WebElement flightMap;

	// Airport
	@FindBy(linkText = "Airport")
	public WebElement airportTab;

	@FindBy(xpath = "//input[@placeholder='Airport (required)']")
	public WebElement airportInput;

	@FindBy(xpath = "//*[contains(@id,'airportTrackForm-airport-smartbox-dropdown')]/ul/li")
	public WebElement airportFirstOption;

	@FindBy(xpath = "//input[@placeholder='Airline (optional)']")
	public WebElement airportAirlineInput;

	@FindBy(xpath = "//*[contains(@id,'airportTrackForm-airline-smartbox-dropdown')]/ul/li")
	public WebElement airlineAirportFirstOption;

	@FindBy(xpath = "//*[contains(@id,'airportTrackForm-submit')]")
	public WebElement airportTrackFlightBtn;

	// --------------method--------------------//

	public void enterAirline(String airline) {
		flightPage.airlineInput.sendKeys(airline);
		flightPage.airlineInput.click();
		flightPage.airLineFirstOption.click();
	}
	
	public void enterFlightNumber(String flightnumber) {
		flightInput.sendKeys(flightnumber);
	}
	
	public void enterAirport(String airport) {
		flightPage.airportInput.sendKeys(airport);
		flightPage.airportInput.click();
		flightPage.airportFirstOption.click();
	}

	public void enterAirlineAirport(String airline) {
		flightPage.airportAirlineInput.sendKeys(airline);
		flightPage.airportAirlineInput.click();
		flightPage.airlineAirportFirstOption.click();
	}
}
