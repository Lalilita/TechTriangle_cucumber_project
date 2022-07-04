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
	WebElement staysButton;
	
	public void clickStays() {
		click(staysButton);	
	}
	
	
	@FindBy (xpath = "//input[@placeholder='Enter a city, hotel, airport, address or landmark']")
	WebElement cityOfStay;
	
	@FindBy (xpath = "//span[@aria-label='Start date calendar input']//span[@class='svg']//*[name()='svg']")
	WebElement startDate;
	
	@FindBy (xpath = "//button[@aria-label='Next Month']//span[@class='svg tUEz-icon']//*[name()='svg']")
	WebElement nextMonthArrow;
	
	@FindBy (xpath = "(//div[@aria-label='September 3, 2022'])")
	WebElement checkInDate;
	
	@FindBy (xpath = "//span[@aria-label='End date calendar input']//span[@class='svg']//*[name()='svg']")
	WebElement endDate;
	@FindBy (xpath = "//div[@aria-label='September 9, 2022']")
	WebElement checkOutDate;
	
	@FindBy (xpath = "//span[@class='G2iq-userIcon']//span[@class='svg']//*[name()='svg']")
	WebElement roomNumAndGuestNum;
	
	@FindBy (xpath = "//div[@class='mH-s mH-s-a11y-focus-outlines']//div[1]//div[1]//button[2]//*[name()='svg']")
	WebElement addRoom;
	
	@FindBy (xpath = "//div[2]//div[1]//button[2]")
	WebElement addAdults;
	
	@FindBy (xpath = "//div[@class='xvRy xvRy-mod-radius-medium xvRy-mod-width-fit-content xvRy-visible']//div[3]//div[1]//button[2]//*[name()='svg']")
	WebElement addChildren;
	
	@FindBy (xpath = "//button[@aria-label='Search']//div[@class='Iqt3-button-content']//*[name()='svg']")
	WebElement searchButton;
	
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
	
	
	@FindBy (className = "wHSr-monthName")
	public WebElement monthName;
	
	@FindBy (xpath = "/html/body/div[13]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div")
	public List <WebElement> allDates;
	
	
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
	
		
		@FindBy (xpath = "//div[@aria-label='Click to reset filters']")
		public WebElement searchResult;
		
		
		public void verifySearchresultDisplay() {
			String text = searchResult.getText();
			System.out.println(text);
			Assert.assertTrue(searchResult.isDisplayed());
		}
		
		@FindBy (xpath = "//div[@class='fArK']//div//div[@aria-label='5']//div[@class='HNDy-label']")
		public WebElement hotelClass_FiveStars;
		
		@FindBy (xpath = "//div[@class='fArK']//div//div[@aria-label='8+']//div[@class='HNDy-label']")
		public WebElement reviewScore_EightPlus;
		
		
		public void furtherSearchresult() {
			String text = searchResult.getText();
		
			CommonMethods.wait(10);
			CommonMethods.click(hotelClass_FiveStars);
			CommonMethods.wait(Constants.standardwait_time);
			CommonMethods.wait(Constants.standardwait_time);
			CommonMethods.click(reviewScore_EightPlus);
			
			String newText = searchResult.getText();
			System.out.println(newText);
			
			Assert.assertTrue(searchResult.isDisplayed());
			Assert.assertFalse(newText.equals(text));
		}
		
		@FindBy (xpath = "/html/body/div[1]/div[1]/main/div[2]/div[2]/div[5]/div/div[2]/div[3]/div[3]/div[2]/div[2]/div/div")
		public List<WebElement> hotelFeatureList;
		
		@FindBy (xpath = "//*[@id=\"wF0Y\"]/div/div/div/div/div[3]/div[1]/div[1]/button/img")
		public List<WebElement> hotelImage;
		
		@FindBy (xpath = "//*[@id=\"wF0Y\"]/div/div/div/div/div[3]/div[2]/div[1]/div[1]/div[2]/a")
		public List<WebElement> hotelName;
		
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
	
	
		

	
	
	
	

}	
	