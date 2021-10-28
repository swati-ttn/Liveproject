package Pages.Scenario_finalized_for_Automation_page.QA_click_jet_pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NegativeTestBookFlightPage 
{

	WebDriver driver;

	public NegativeTestBookFlightPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
	public WebElement fromDropDown;
	
	@FindBy(how = How.XPATH, using = "//select[@id='ctl00_mainContent_ddl_destinationStation1']")
	public WebElement ToDropDown;
	
	
	
	public void SelectOriginCity(String arrivalCity) throws InterruptedException
	{
		Thread.sleep(4000);
		fromDropDown.sendKeys(arrivalCity);
		
	
	}
	
	public List<WebElement> returnListOfDestinationCities()
	{
		Select option = new Select(ToDropDown);
		return option.getOptions();
		
	}
}
