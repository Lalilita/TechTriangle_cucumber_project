package techTriangle_cucumber.pageObjects;

import org.openqa.selenium.support.PageFactory;

import techTriangle_cucumber.utilities.BaseClass;
import techTriangle_cucumber.utilities.CommonMethods;

public class HomePage extends CommonMethods{

	
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
//	@FindBy(xpath = " ")
//	public WebElement ;

}	
	