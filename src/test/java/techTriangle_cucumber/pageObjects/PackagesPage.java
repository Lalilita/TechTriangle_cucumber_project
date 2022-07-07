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
	
	@FindBy(xpath = "//*[@class='yNPo-filtered']")
	public WebElement filterPackage;
	
	@FindBy(xpath = "//*[@class='yNPo-total']")
	public WebElement totalPackage;
	
	@FindBy(xpath = "//*[@class='iRhY']")
	public List <WebElement> hotelsOnPageList;
	
	@FindBy(xpath = "//span[text()='See flight details']")
	public List <WebElement> seeFlightDetails;
	
	@FindBy(xpath = "//*[@class='HNDy-label' and text()='5']")
	public WebElement fifthStarBtn;
	
	@FindBy(xpath = "//*[@class='HNDy-label' and text()='8+']")
	public WebElement eightPlusBtn;
	
	@FindBy(xpath = "//div[@role='slider' and @aria-label='Maximum price']")
	public WebElement rightSlider;
	
	@FindBy(xpath = "//*[@class='LR-R-best']")
	public WebElement hotelPriceResult;
	

}	
	