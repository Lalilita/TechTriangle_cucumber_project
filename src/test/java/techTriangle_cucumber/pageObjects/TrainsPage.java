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


	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div[1]/div/div/div[1]/div/div/section[2]/div[2]/div/div[2]/div/form/div[1]/div/div[1]/div/div[1]/div/div")
	public WebElement departureBox;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div[1]/div[1]/input")
	public WebElement departureInput;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div[1]/div[1]/input") 
	public WebElement destinationInput;
	
	@FindBy(xpath = "/html/body/div[5]/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]")
	public WebElement startDate;
	
	@FindBy(xpath = "//*[contains(@id,'-dateRangeInput-display-end']")
	public WebElement endDate;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div[1]/div/div/div[1]/div/div/section[2]/div[2]/div/div[2]/div/form/div[2]/div[2]/span/span/input")
	public WebElement busChckBox;
	
	@FindBy(xpath = "//*[@aria-label='Next month']")
	public WebElement nextBtn;
	
	@FindBy(xpath = "//*[@class='fieldBlock buttonBlock'][1]")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//*[@class='resultInner keel-grid']")
	public List <WebElement> tripList;
	
	@FindBy(xpath = "//*[@class='page-Numbers']/span")
	public List <WebElement> pageList;
	
	@FindBy(xpath = "//*[@class='keel-grid v-c-p']")
	public List <WebElement> tripDetailList; //show odd index
	
	@FindBy(xpath = "//*[@class='col col-best']")
	public WebElement DeptAndReturnBtn;
	
	@FindBy(xpath = "//*[@id='AsG0-booking']")
	public WebElement bookBtn;
	

}	
	