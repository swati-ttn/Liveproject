package Pages.Scenario_finalized_for_Automation_page.Automationpractice_pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PlaceOrderPage 
{
	
	WebDriver driver;

	public PlaceOrderPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "(//a[@title='T-shirts'])[2]")
	public WebElement tshirtsHyperLink;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Add to cart']/parent::a")
	public WebElement addToCartBtn;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Proceed to checkout']")
	public WebElement proceedToCheckOutBtnAtPopUp; 
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Proceed to checkout']/parent::a")
	public WebElement proceedToCheckOutAtshopping; 
	
	
	
	@FindBy(how = How.XPATH, using = "//button[@name='processAddress']")
	public WebElement proceedToCheckOutAtAddressBtn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='cgv']")
	public WebElement checkBoxIAgree; 
	
	@FindBy(how = How.XPATH, using = "//button[@name='processCarrier']")
	public WebElement CheckOutAtShippingBtn;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Pay by bank wire']")
	public WebElement payByBankWirePaymentOption;
	
	@FindBy(how = How.XPATH, using = "//span[text()='I confirm my order']/parent::button")
	public WebElement iConfirmMyOrderbtn;
	
	@FindBy(how = How.XPATH, using = "//div[@id='contact-link']/a")
	public WebElement contactUsBTn;
	
	@FindBy(how = How.ID, using = "id_contact")
	public WebElement SubjectHeading;
	
	@FindBy(how = How.XPATH, using = "//select[@name='id_order']")
	public WebElement orderRefrenceID;
	
	@FindBy(how = How.XPATH, using = "//a[@title='View my customer account']")
	public WebElement userName;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Order history and details']/parent::a")
	public WebElement orderhistoryAndDetails;
	
	@FindBys(@FindBy(how = How.XPATH, using = "//a[@class='color-myaccount']"))
	public List<WebElement> orderId;
	
	@FindBy(how = How.ID, using = "message")
	public WebElement messageLoc;
	
	@FindBy(how = How.ID, using = "submitMessage")
	public WebElement submitMessageBtn;
	
	@FindBy(how = How.XPATH, using = "//p[@class='alert alert-success']")
	public WebElement complaintSuccessmsg;
	
	
	
	
	
	
	
	
	
	public void clickOnTshirtHyprLink()
	{
		tshirtsHyperLink.click();
	}
	
	public void clickOnaddToCartBtn() throws InterruptedException
	{
		Actions action = new Actions(driver);
	    action.moveToElement(addToCartBtn).build().perform();
		addToCartBtn.click();
		Thread.sleep(4000);
		
	}
	
	
	public void clickOnproceedToCheckOutBtnAtPopUp() throws InterruptedException
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", proceedToCheckOutBtnAtPopUp);
		Thread.sleep(4000);
	 // proceedToCheckOutBtn.click();           // call 3 times to the order place process
	}
	
	public void clickOnproceedToCheckOutAtshopping() throws InterruptedException
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", proceedToCheckOutAtshopping);
		Thread.sleep(4000);
	 // proceedToCheckOutBtn.click();           // call 3 times to the order place process
	}
	
	public void clickOnproceedToCheckOutAtAddressBtn() throws InterruptedException
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", proceedToCheckOutAtAddressBtn);
		Thread.sleep(4000);
	 // proceedToCheckOutBtn.click();           // call 3 times to the order place process
	}
	
	public void clickOncheckBoxIAgree()
	{
		checkBoxIAgree.click();          // after this again click on Proceed btn
	}
	
	public void clickOnproceedToCheckOutAtShippingBtn() throws InterruptedException
	{
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", CheckOutAtShippingBtn);
		Thread.sleep(4000);
		//CheckOutAtShippingBtn.click();          // after this again click on Proceed btn
	}
	
	
	
	public void clickOnpayByBankWirePaymentOption()
	{
		payByBankWirePaymentOption.click();          
	}
	
	public void clickOniConfirmMyOrderbtn()
	{
		iConfirmMyOrderbtn.click();          
	}
	
	public void clickOnuserName()
	{
		userName.click();          
	}
	
	public void clickOnorderhistoryAndDetails()
	{
		orderhistoryAndDetails.click();          
	}
	
	public void getOrderId()
	{
		String order_id_string = orderId.get(0).getText();
		System.out.println(order_id_string);
	}
	
	
	
	public void clickOncontactUsBTn()
	{
		contactUsBTn.click();          
	}
	
	public void clickOnSubjectHeading()
	{
		Select option = new Select(SubjectHeading);
		option.selectByValue("2");        
	}
	
	public void clickOnorderRefrenceID()
	{
		Select option = new Select(orderRefrenceID);
		option.selectByIndex(0);        
	}
	
	public void messageLoc(String msg)
	{
		messageLoc.sendKeys(msg);        
	}
	
	
	public void clickOnSubmitMsgbtn()
	{
		
		submitMessageBtn.click();
	}
	
	public String getComplainSuccessMsg()
	{
		
		return complaintSuccessmsg.getText();
	}
	
}
	
	
	
	
	


