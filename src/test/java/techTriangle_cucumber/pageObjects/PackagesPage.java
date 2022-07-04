package techTriangle_cucumber.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;

public class PackagesPage extends CommonMethods{

	
	public PackagesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@aria-label='Search for packages']")
	public WebElement packagesTab;
	
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
	
	@FindBy(xpath = "//span[@aria-label='End date calendar input']")
	public WebElement endDateField;
	
	@FindBy(xpath = "//button[@aria-label='Search']")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//*[@class='yNPo-filtered']")
	public WebElement filterPackage;
	
	@FindBy(xpath = "//*[@class='yNPo-total']")
	public WebElement totalPackage;
	
	@FindBy(xpath = "//span[text()='See flight details']")
	public List <WebElement> seeFlightDetails;
	
	@FindBy(xpath = "//*[@class='HNDy-label' and text()='5']")
	public WebElement fifthStarBtn;
	
	@FindBy(xpath = "//*[@class='HNDy-label' and text()='8+']")
	public WebElement eightPlusBtn;
	
	@FindBy(xpath = "//*[@class='LR-R-best']")
	public WebElement hotelPriceResult;
	

}	
	