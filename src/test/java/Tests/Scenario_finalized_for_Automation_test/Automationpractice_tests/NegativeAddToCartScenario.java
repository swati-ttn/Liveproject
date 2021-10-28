package Tests.Scenario_finalized_for_Automation_test.Automationpractice_tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Scenario_finalized_for_Automation_page.Automationpractice_pages.LoginPage;
import Pages.Scenario_finalized_for_Automation_page.Automationpractice_pages.PlaceOrderPage;
import Utills.BaseTest;

public class NegativeAddToCartScenario extends BaseTest 
{

	@Test
	public void NegativeOrderPlace() throws InterruptedException
	{
	LoginPage loginPage = new LoginPage(driver);
	loginPage.clickSignin();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	 PlaceOrderPage  orderplacepageObj = new PlaceOrderPage(driver) ;
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 orderplacepageObj.clickOnTshirtHyprLink();
	 orderplacepageObj.clickOnaddToCartBtn();
	 orderplacepageObj.clickOnproceedToCheckOutBtnAtPopUp();
	 orderplacepageObj.clickOnproceedToCheckOutAtshopping();
	 
	 String heading1 = loginPage.getHeadingsOfLoginPage().get(0).getText();
	 String heading2 = loginPage.getHeadingsOfLoginPage().get(1).getText();
	 
	 Assert.assertEquals(heading1, "CREATE AN ACCOUNT");
	 Assert.assertEquals(heading2,"ALREADY REGISTERED?");
	}
	
}
