package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;
import utilities.CommonMethods;

public class PackagesPage extends CommonMethods{

	
	public PackagesPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
//	@FindBy(xpath = "//*[@class='yNPo-filtered']")
//	public WebElement filterPackage;
//	
//	@FindBy(xpath = "//*[@class='yNPo-total']")
//	public WebElement totalPackage;
	
	@FindBy(xpath = "//*[@class='iRhY']")
	public List <WebElement> hotelsOnPageList;
	
//	@FindBy(xpath = "//span[text()='See flight details']")
//	public List <WebElement> seeFlightDetails;
	
	@FindBy(xpath = "//*[text()='5']")
	public WebElement fifthStarBtn;
	
	@FindBy(xpath = "//*[text()='8+']")
	public WebElement eightPlusBtn;
	
	@FindBy(xpath = "//div[@role='slider' and @aria-label='Minimum price']")
	public WebElement leftSlider;
	
	@FindBy(xpath = "//*[@role='button' and @class='MpuP-min']")
	public WebElement minPrice;
	
	@FindBy(xpath = "//*[@class='LR-R-best']")
	public List <WebElement> hotelPriceResult;
	

}	
	