package techTriangle_cucumber.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;

public class TrainsPage extends CommonMethods{

	
	public TrainsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id='XiD9-switch-list']")
	public WebElement roundTripDropdown;
	
	@FindBy(xpath = "//*[@class='keel-grid v-c-p ']")
	public WebElement travellerDropdown;
	
	@FindBy(xpath = "//*[@id='rtdN']")
	public WebElement addAdultBtn;
	
	@FindBy(xpath = "//*[@id='It1R-transportCheckboxBus']")
	public WebElement busChckBox;
	
	@FindBy(xpath = "//*[@class='resultInner keel-grid']")
	public List <WebElement> tripList;
	
	@FindBy(xpath = "//*[@class='keel-grid v-c-p']")
	public List <WebElement> tripDetailList; //show odd index
	
	@FindBy(xpath = "//*[@class='col col-best']")
	public WebElement DeptAndReturnBtn;
	
	@FindBy(xpath = "//*[@id='AsG0-booking']")
	public WebElement bookBtn;

}	
	