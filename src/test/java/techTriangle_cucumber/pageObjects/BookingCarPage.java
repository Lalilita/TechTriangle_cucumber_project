package techTriangle_cucumber.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;

public class BookingCarPage extends CommonMethods {

	public void setUp() {
		getDriver();
	}

	// WebElement----- Kong
	@FindBy(xpath = "//div[@class='hsCY-menu-item-title hsCY-active']")
	public WebElement carBtn;

	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[1]/div/h2")
	public WebElement carPage;

//	@FindBy(xpath = "//div[normalize-space()='Top 8 popular cities']")
//		public WebElement scrollToElement; // ไม่จำเป็นต้องมี เพราะไม่ได้ใช้ที่ใหนเลย

	@FindBy(xpath = "//div[normalize-space()='Top 8 popular cities']")
	public WebElement EightPopularCities;

//	@FindBy(xpath="//*[@id='BZHB']/div/section/div/div/div/div[2]/div/a")
//	public WebElement EightCities;

	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[2]/div[1]/div[11]/div/section/div/div/div/div[2]//a")
	public List<WebElement> eightCities;

	@FindBy(xpath = "//h5[normalize-space()='Orlando, FL']")
	public WebElement FLcity;

	@FindBy(xpath = "//h5[normalize-space()='Small']")
	public WebElement smallCar;

	@FindBy(xpath = "//div[@aria-label='Car type']//div[@class='Qk4D-filter-head']")
	public WebElement checkBox;

	@FindBy(xpath = "//input[@id='valueSetFilter-VAN']")
	public WebElement selectCarType_VAN;
	
	@FindBy(xpath = "//input[@placeholder='From?']")  
	public WebElement carSearchBox;
	
//	@FindBy(xpath = "//input[@placeholder='From?']")  
//	public WebElement carLocationSearchBox;
	
	@FindBy(xpath = "//div[normalize-space()='Drive around in Sterling, VA']")  
	public WebElement departureInputs;
	

	
	
	
	
	
	///////////// methods-----Kong

	public void clickCarTab() {
		carBtn.click();
	}

	public void verifyCarPage() {
		String currentURL = driver.getCurrentUrl();
		// Assert.assertTrue(currentURL.contains("cars")));  // อันนี้ไม่ใช้ แต่ใช้ได้ใช่มั้ย
		Assert.assertEquals(currentURL, getProperty("carPageURL")); // ไปทบทวนด้วย
	}

//		public void clickScrollDown() {	
//			CommonMethods.scrollToElement(EightPopularCities);
//		}  // ไม่ต้องมีในส่วนของ method

	public List<WebElement> pictureSlide;

	public int getSlider() {
		return pictureSlide.size();
	}

	public void verifySlide() {
		Assert.assertTrue(getSlider() == 8);
	}

	public void clickCarCity() {
		System.out.println("CarCitySize" + eightCities.size());
		for (int i = 0; i <= eightCities.size(); i++) {
			eightCities.get(i).click();
			driver.navigate().back();
			System.out.println("click" + i); 

		}

	}

	public void clickFLcity() {
		FLcity.click();
	}

	public void verifyRentalCarLocation() {
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("cars/Orlando"));
	}

	public void clickSmallCarTab() {
		smallCar.click();
	}
	
	public void verifyCheckBoxShown() {
		smallCar.click();
		Assert.assertTrue(checkBox.isSelected());  
		System.out.println("checkBox shown");
	}
	public void carType() {
		selectCarType_VAN.click();
	}
	public void verifyCarTypeSelected() {
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("carclass=VAN"));
		System.out.println("Vans is displayed");
	}
	
	
	
	// method for 1st testCase
	public void verifySearchCarBoxShown() {
		carBtn.click();
		Assert.assertTrue(carSearchBox.isDisplayed());
		System.out.println("Search car box shown");
	}
	public void enterCarBookingInfo(String startDate,String endDate) {
		carSearchBox.clear();
		carSearchBox.sendKeys("washington., d.c.");
		homePage.startDateField.click();
		clickDate(startDate, homePage.navBar, homePage.nextBtn);
		
		homePage.endDateField.click();
		clickDate(endDate, homePage.navBar, homePage.nextBtn);
			
	}
	
	
	
	
}
