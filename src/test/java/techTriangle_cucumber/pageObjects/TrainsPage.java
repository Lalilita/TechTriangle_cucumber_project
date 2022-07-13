package techTriangle_cucumber.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath = "(//div[@data-placeholder='To'])[1]") 
	public WebElement destinationBox;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div[1]/div[1]/input") 
	public WebElement destinationInput;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div[1]/div/div/div[1]/div/div/section[2]/div[2]/div/div[2]/div/form/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div/div") //(//div[@data-placeholder='Depart'])[1]") 
	public WebElement BusTrainDepart;
	
	@FindBy(xpath = "//div[@class='weeks ']/div/div") 
	public List <WebElement> calendarWeek;
	
	@FindBy(xpath = "//div[@class='weeks ']/div/div")
	public List <WebElement> startDates;
	
	@FindBy(xpath = "//div[@class='weeks ']/div/div")
	public List <WebElement> endDates;
	
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
	
	@FindBy(xpath = "//*[contains(@id,'-best') and @type='button'][1]") //*[@class='col col-best'][1]")
	public WebElement deptBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div/div[2]/div[4]/div/div[2]/div/div[4]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/div[3]/div/div/div/div/div")
	public WebElement returnBtn;
	
	@FindBy(xpath = "//*[contains(@id,'-booking')]")
	public WebElement bookBtn;
	
	
	//---------------method-------------------//
	public void setDepartureAndDestination(String departure , String destination2) throws InterruptedException {
		departureBox.click();
		departureInput.sendKeys(departure);
		Thread.sleep(1000);
		departureInput.sendKeys(Keys.ARROW_DOWN);
		departureInput.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		destinationInput.sendKeys(destination2);
		Thread.sleep(1000);
		destinationInput.sendKeys(Keys.ENTER);
	}	
	
	public void setDate(String deptDate, String reDate) {
		destinationInput.sendKeys(Keys.ENTER);
	    BusTrainDepart.click();
		List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='weeks ']/div/div"));
        
 		for(WebElement ele:allDates){
 			String date=ele.getText();
 			if(date.equalsIgnoreCase(deptDate))	{
 				ele.click();
 				break;
 			}
 		}
 		
 		List<WebElement> allDates2=driver.findElements(By.xpath("//div[@class='weeks ']/div/div"));
        
 		for(WebElement ele:allDates2){
 			String date=ele.getText();
 			if(date.equalsIgnoreCase(reDate))	{
 				ele.click();
 				break;
 			}
 		}
	}
 		
}
	
	 		
	 		
	 		
	 		
	


	