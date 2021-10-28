package Pages.Scenario_finalized_for_Automation_page.Automationpractice_pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(how = How.XPATH, using = "//a[@class='login']")
	public WebElement signin;
	@FindBy(how = How.ID_OR_NAME, using = "email")
	public WebElement Email;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	public WebElement password;
	@FindBy(how = How.XPATH, using = "//*[@id='SubmitLogin']")
	public WebElement box;
	
	@FindBys(@FindBy(how = How.XPATH, using = "//h3[@class='page-subheading']"))
	public List<WebElement> LoginPageVerificationHeading;
	

	public void clickSignin() {
		signin.click();
	}

	public void enterEmail(String name) {
		Email.sendKeys(name);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickSigninn() {
		box.click();
	}
	
	public  List<WebElement> getHeadingsOfLoginPage()
	{
		return LoginPageVerificationHeading;
	}
	

}