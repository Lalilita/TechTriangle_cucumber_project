package techTriangle_cucumber.pageObjects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;

public class HomePage extends CommonMethods{

	
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@aria-label='Search for packages']")
	public WebElement packagesTab;
	
	@FindBy(xpath = "//a[@aria-label='Search for trains']")
	public WebElement trainsAndBusTab;
	
	@FindBy(xpath = "//span[@class='svg S9tW-chevron-icon-wrapper']")
	public WebElement travellersDropDown;
	
	@FindBy(xpath = "//*[@class='wJ5y'][1]//button[2]")
	public WebElement addAdultBtn;
	
	@FindBy(xpath = "//input[@placeholder='From']")
	public WebElement fromField;
	
	@FindBy(xpath = "//input[@placeholder='Enter destination or airport']")
	public WebElement toField;
	
	@FindBy(xpath = "//span[@aria-label='Start date calendar input']")
	public WebElement startDateField;
	
	@FindBy(xpath = "//*[@class='onx_-days']/div")
	public List <WebElement> dateList;
	
	@FindBy(xpath = "//span[@aria-label='End date calendar input']")
	public WebElement endDateField;
	
	@FindBy(xpath = "//button[@aria-label='Search']")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//div[@class='wHSr-monthName']")
	public WebElement navBar;
	
	@FindBy(xpath = "//button[@aria-label='Next Month']")
	public WebElement nextBtn;
	

}	
	