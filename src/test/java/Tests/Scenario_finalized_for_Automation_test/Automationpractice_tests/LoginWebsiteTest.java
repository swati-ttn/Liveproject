package Tests.Scenario_finalized_for_Automation_test.Automationpractice_tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Scenario_finalized_for_Automation_page.Automationpractice_pages.LoginPage;
import Pages.Scenario_finalized_for_Automation_page.Automationpractice_pages.PlaceOrderPage;
import Utills.BaseTest;
import java.util.concurrent.TimeUnit;


public class LoginWebsiteTest extends BaseTest {


	@Test(priority = 1)
	public void validLogin() throws InterruptedException {
		
		// Login to WebSite 
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickSignin();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		loginPage.enterEmail(prop.getProperty("email"));
		loginPage.enterPassword(prop.getProperty("password"));
		loginPage.clickSigninn();
		Assert.assertTrue(driver.getTitle().contains("My account - My Store"));
		
		// Place an Order
		
		 PlaceOrderPage  orderplacepageObj = new PlaceOrderPage(driver) ;
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 orderplacepageObj.clickOnTshirtHyprLink();
		 orderplacepageObj.clickOnaddToCartBtn();
		 orderplacepageObj.clickOnproceedToCheckOutBtnAtPopUp();
		 orderplacepageObj.clickOnproceedToCheckOutAtshopping();
		 orderplacepageObj.clickOnproceedToCheckOutAtAddressBtn();
		 orderplacepageObj.clickOncheckBoxIAgree();
		 orderplacepageObj.clickOnproceedToCheckOutAtShippingBtn();
		 orderplacepageObj.clickOnpayByBankWirePaymentOption();
		 orderplacepageObj.clickOniConfirmMyOrderbtn(); 

		 //Contact to customer Support
		 orderplacepageObj.clickOncontactUsBTn();
		 orderplacepageObj.clickOnSubjectHeading();
		 orderplacepageObj.clickOnorderRefrenceID();
		 orderplacepageObj.messageLoc("i have some issue with this Product");
		 orderplacepageObj.clickOnSubmitMsgbtn();
		 
		 String successMessage = orderplacepageObj.getComplainSuccessMsg();
		 System.out.println(successMessage);
		 
		 Assert.assertEquals(successMessage,"Your message has been successfully sent to our team.");
			
	}

}