package techTriangle_cucumber.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;
import techTriangle_cucumber.utilities.Constants;

public class StaysPage extends CommonMethods{

	public StaysPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy (xpath = "//a[@aria-label='Search for hotels']")
	public WebElement staysButton;

	@FindBy (xpath = "//input[@placeholder='Enter a city, hotel, airport, address or landmark']")
	public WebElement cityOfStay;

	@FindBy (xpath = "//span[@aria-label='Start date calendar input']//span[@class='svg']//*[name()='svg']")
	public WebElement startDate;

	@FindBy (xpath = "//button[@aria-label='Next Month']//span[@class='svg tUEz-icon']//*[name()='svg']")
	public WebElement nextMonthArrow;

	@FindBy (xpath = "(//div[@aria-label='September 3, 2022'])")
	public WebElement checkInDate;

	@FindBy (xpath = "//span[@aria-label='End date calendar input']//span[@class='svg']//*[name()='svg']")
	public WebElement endDate;

	@FindBy (xpath = "//div[@aria-label='September 9, 2022']")
	public WebElement checkOutDate;

	@FindBy (xpath = "//span[@class='G2iq-userIcon']//span[@class='svg']//*[name()='svg']")
	public WebElement roomNumAndGuestNum;

	@FindBy (xpath = "//div[@class='mH-s mH-s-a11y-focus-outlines']//div[1]//div[1]//button[2]//*[name()='svg']")
	public WebElement addRoom;

	@FindBy (xpath = "//div[2]//div[1]//button[2]")
	public WebElement addAdults;

	@FindBy (xpath = "//div[@class='xvRy xvRy-mod-radius-medium xvRy-mod-width-fit-content xvRy-visible']//div[3]//div[1]//button[2]//*[name()='svg']")
	public WebElement addChildren;

	@FindBy (xpath = "//button[@aria-label='Search']//div[@class='Iqt3-button-content']//*[name()='svg']")
	public WebElement searchButton;

	@FindBy (className = "wHSr-monthName")
	public WebElement monthName;

	@FindBy (xpath = "/html/body/div[13]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div")
	public List <WebElement> allDates;

//	@FindBy (xpath = "//div[@aria-label='Click to reset filters']")
	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[2]/div[2]/div[5]/div/div[2]/div[3]/div[2]/div[5]/div/div/div[1]")
	public WebElement searchResult;

	@FindBy (xpath = "//div[@class='fArK']//div//div[@aria-label='5']//div[@class='HNDy-label']")
//	@FindBy (xpath = "//*[text()='5']")
//	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[2]/div[2]/div[5]/div/div[1]/div/div/div[1]/div/div/div/div/div/div[4]/div[2]/div[5]/div/div[1]")
	public WebElement hotelClass_FiveStars;

	@FindBy (xpath = "//div[@class='fArK']//div//div[@aria-label='8+']//div[@class='HNDy-label']")
//	@FindBy (xpath = "//*[text()='8+']")
	public WebElement reviewScore_EightPlus;

	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[2]/div[2]/div[5]/div/div[2]/div[3]/div[3]/div[2]/div[2]/div/div")
	public List<WebElement> hotelFeatureList;

	@FindBy (xpath = "//*[@id=\"wF0Y\"]/div/div/div/div/div[3]/div[1]/div[1]/button/img")
	public List<WebElement> hotelImage;

	@FindBy (xpath = "//*[@id=\"wF0Y\"]/div/div/div/div/div[3]/div[2]/div[1]/div[1]/div[2]/a")
	public List<WebElement> hotelName;

	//Booking functionality
	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[2]/div[2]/div[5]/div/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div[3]/div[2]/div[1]/div[1]/div[2]/a")
	public List<WebElement> nameOfHotel;

	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[2]/div[2]/div[5]/div/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div[3]/div[2]/div[2]")
	public List<WebElement> bookingProviders ;
	
	@FindBy (xpath = "(//span[@class='qSC7-show-more-label-text'])[2]")
	public WebElement dropDownBox;
	
	@FindBy (xpath = "/html/body/div[14]/div/div/div[1]/a/div[2]")
	public List<WebElement> listOfDropDown;
	
	@FindBy (xpath = "(//div[@class='ifcf-dropdownProviderName'])[3]")
//	@FindBy (xpath = "//*[text()='KAYAK']")
	public WebElement kayak;
	
	@FindBy (xpath = "(//h1[@class='c3xth-hotel-name'])[1]")
	public WebElement hotel;

	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div/div/div/div[6]/div/div[3]/div/div[2]/div/div/div/div[2]/div[3]/div/div/div[4]/div/button")
	public WebElement select;

	@FindBy (xpath = "//*[@id=\"travelers[0].firstName\"]")
	public WebElement firstName;

	@FindBy (xpath = "//*[@id=\"travelers[0].lastName\"]")
	public WebElement lastName;

	@FindBy (xpath = "//*[@id=\"travelers[0].emailAddress\"]")
	public WebElement emailAddress;

	@FindBy (xpath = "//*[@id=\"travelers[0].shortPhoneNumber\"]")
	public WebElement phoneNumber;

	@FindBy (xpath = "//*[@id=\"cc[0].cc_name\"]")
	public WebElement nameOnCard;

	@FindBy (xpath = "//*[@id=\"cc[0].cc_number\"]")
	public WebElement cardNumber;

	@FindBy (xpath = "//*[@id=\"cc[0].cc_expires\"]")
	public WebElement expiredDate;

	@FindBy (xpath = "//*[@id=\"cc[0].cc_securitycode\"]")
	public WebElement securityCode;

	@FindBy (xpath = "//*[@id=\"cc[0].billing_streetaddress1\"]")
	public WebElement billingAddress1;

	@FindBy (xpath = "//*[@id=\"cc[0].billing_zip\"]")
	public WebElement zipCode;

	@FindBy (xpath = "//*[@id=\"cc[0].billing_city\"]")
	public WebElement city;

	@FindBy (xpath = "//*[@id=\"cc[0].billing_state\"]")
	public WebElement state;

	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[1]/div/section/div/div/div/div[1]/div/div[2]/div/div[2]/section/div[3]/button")
	public WebElement bookNowButton;
	
	//Sliders Functionality
	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[2]/div[1]/div[14]/div/section/div/div/div/div[2]/div/a")        
	public List<WebElement> listOfCitiesImage;

	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[2]/div[1]/div[14]/div/section/div/div/div/div[2]/div/a/div[2]")
	public List<WebElement> cityNames;

//	@FindBy (xpath = "(//div[@class='KzeV-title'])[8]")
	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[2]/div[1]/div[14]/div/section/div/header/div/div/div[1]")
	public WebElement popularCities;

	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[2]/div[1]/div[14]/div/section/div/div/div/div[3]")
	public WebElement forwardArrow;

	@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[2]/div[1]/div[14]/div/section/div/div/div/div[1]")
	public WebElement backArrow;
		

	public void clickStays() {
		click(staysButton);	
	}

	public void searchField() {
		CommonMethods.wait(Constants.standardwait_time);
		CommonMethods.click(cityOfStay);
		CommonMethods.sendText(cityOfStay, BaseClass.getProperty("stayCity"));
		CommonMethods.getJSObject();
		CommonMethods.wait(Constants.standardwait_time);
		checkInDate("September 2022", "3");
		CommonMethods.wait(Constants.standardwait_time);
		checkOutDate("September 2022", "9");
		CommonMethods.wait(Constants.standardwait_time);
		CommonMethods.click(roomNumAndGuestNum);
		CommonMethods.click(addRoom);
		CommonMethods.wait(Constants.standardwait_time);
		CommonMethods.click(addAdults);
		CommonMethods.wait(Constants.standardwait_time);
		CommonMethods.click(addAdults);	
	}

	public void search() {
		CommonMethods.click(searchButton);
	}

	public void checkInDate(String month, String checkIn_date) {
		CommonMethods.waitForClickability(startDate);
		CommonMethods.click(startDate);
		while(true) {
			String text = monthName.getText();
			if(text.equals(month)) {
				break;
			}else {
				CommonMethods.click(nextMonthArrow);
			}
		}
		CommonMethods.wait(Constants.standardwait_time);
		CommonMethods.selectCalendarDate(allDates, checkIn_date);	
	}

	public void checkOutDate(String month, String checkOut_date) {
		CommonMethods.waitForClickability(endDate);
		CommonMethods.click(endDate);
		while(true) {
			String text = monthName.getText();
			if(text.equals(month)) {
				break;
			}else {
				CommonMethods.click(nextMonthArrow);
			}
		}
		CommonMethods.wait(Constants.standardwait_time);
		CommonMethods.selectCalendarDate(allDates, checkOut_date);
	}

	public void verifySearchresultDisplay() {
		String text = searchResult.getText();
		System.out.println(text);
		Assert.assertTrue(searchResult.isDisplayed());
	}

	public void furtherSearchresult() {
		String text = searchResult.getText();
		CommonMethods.wait(10);
		CommonMethods.click(hotelClass_FiveStars);
		CommonMethods.wait(Constants.standardwait_time);
		CommonMethods.wait(Constants.standardwait_time);
		CommonMethods.click(reviewScore_EightPlus);
		CommonMethods.wait(Constants.standardwait_time);
		String newText = searchResult.getText();
		System.out.println(newText);
		Assert.assertTrue(searchResult.isDisplayed());
		Assert.assertFalse(newText.equals(text));
	}

	public void verifyImageAndHotelListIsDisplayed() {
		for(WebElement listFearture:hotelFeatureList) {
			Assert.assertTrue(listFearture.isDisplayed());
		}
		for(WebElement listImage:hotelImage) {
			Assert.assertTrue(listImage.isDisplayed());
			Assert.assertTrue(listImage.isEnabled());
		}
		for(WebElement listName:hotelName) {
			String name = listName.getText();
			System.out.println(name);
			Assert.assertTrue(listName.isDisplayed());
			Assert.assertTrue(listName.isEnabled());
		}
	}

	public void findConradNewYorkMidtown() {
		for (int i = 0; i<nameOfHotel.size(); i++) {
			WebElement hotelList = nameOfHotel.get(i);
			WebElement providerList = bookingProviders.get(i);
			String str = providerList.getText();
			String name =hotelList.getText();
			String targetHotel = "Conrad New York Midtown";
			if(name.equals(targetHotel)) {
				System.out.println(name);
				System.out.println(str);
				Assert.assertTrue(hotelList.isDisplayed());
				Assert.assertTrue(providerList.isDisplayed());
				break;
			}
		}
	}

	public void kayakBookingProvider() {
		CommonMethods.scrollToElement(dropDownBox);
		CommonMethods.jsClick(dropDownBox);
		CommonMethods.wait(Constants.standardwait_time);
		for (WebElement list:listOfDropDown) {
			String bookingName = list.getText();
			System.out.println(bookingName);
			if(list.getText().equals("KAYAK")) {
				System.out.println("pass");
				CommonMethods.click(list);
				break;
			}
		}
	}
	
	public void dealingWindow() {
		CommonMethods.switchToChildWindow();
		String currentUrl = BaseClass.getDriver().getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertTrue(hotel.isDisplayed());
		CommonMethods.wait(Constants.standardwait_time);
		CommonMethods.waitForVisibility(select);
		CommonMethods.ScrolByPixel(200);
		CommonMethods.click(select);
	}

	public void bookingWindow() {
		CommonMethods.switchToMultipleWindow();
		String currentUrl2 = BaseClass.getDriver().getCurrentUrl();
		System.out.println(currentUrl2);
		firstName.sendKeys(BaseClass.getProperty("firstName"));
		lastName.sendKeys(BaseClass.getProperty("lastName"));
		emailAddress.sendKeys(BaseClass.getProperty("lastName"));
		phoneNumber.sendKeys(BaseClass.getProperty("phoneNumber"));
		nameOnCard.sendKeys(BaseClass.getProperty("nameOnCard"));
		cardNumber.sendKeys(BaseClass.getProperty("cardNumber"));
		expiredDate.sendKeys(BaseClass.getProperty("expiredDate"));
		securityCode.sendKeys(BaseClass.getProperty("securityCode"));
		billingAddress1.sendKeys(BaseClass.getProperty("billingAddress1"));
		zipCode.sendKeys(BaseClass.getProperty("zipCode"));
		city.sendKeys(BaseClass.getProperty("city"));
		state.sendKeys(BaseClass.getProperty("state"));
	}

	public void verifyBookButton() {
		Assert.assertTrue(bookNowButton.isEnabled());
	}

	public void scrollToPopularCities() {
		CommonMethods.ScrolByPixel(800);
		Assert.assertTrue(popularCities.isDisplayed());
	}
	
	public void slidersAndImagesCount() {
		int imageNum;
		imageNum= listOfCitiesImage.size();
		System.out.println("The number of image on this popular cities section is "+imageNum);
		int slideNum=1;
		for (int j =1; j<=listOfCitiesImage.size(); j++) {		
		if (forwardArrow.isDisplayed()) {
			CommonMethods.click(forwardArrow);
			slideNum++;
		}else {
			break;
			}
		}
		System.out.println("The number of slide on this popular cities section is "+slideNum);
		int imageNumPerSlide;
		imageNumPerSlide = imageNum/slideNum;
		System.out.println("Number of image per slide is "+imageNumPerSlide);
		Assert.assertEquals(imageNumPerSlide, 2);
	}
	
	public void verifyImagesClickable() {
		CommonMethods.wait(Constants.standardwait_time);
		for (int k =1; k<=listOfCitiesImage.size(); k++) {		
			if (backArrow.isDisplayed()) {
				CommonMethods.click(backArrow);
			}else {
				break;
			}
		}	
		for (int i = 1; i <listOfCitiesImage.size(); i++) {
			WebElement listOfImage = listOfCitiesImage.get(i);
			Assert.assertTrue(listOfImage.isEnabled());
		}	
	}

	public void verifyCityName() {
		for (int j =1; j<=listOfCitiesImage.size(); j++) {	
			if (forwardArrow.isDisplayed()) {
				for (WebElement city : cityNames) {
					String str = city.getText();
					System.out.println(str);
				}
				CommonMethods.click(forwardArrow);
				CommonMethods.wait(Constants.standardwait_time);

			}else {
				for (WebElement city : cityNames) {
					String str = city.getText();
					System.out.println(str);
				}
				break;
			}
		}
	}

	
	

	
}	
