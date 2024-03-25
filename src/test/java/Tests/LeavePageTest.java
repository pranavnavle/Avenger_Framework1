package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.LeavePage;

public class LeavePageTest extends BasePage {
	LoginTest lp = new LoginTest();
	LeavePage leavePage = new LeavePage();
	
	@BeforeTest
	
	public void setUp() {
		initialize() ;
		lp.verifyloginSetup();
		
	}
	
	@Test
	public void VerifyClickOnLeavePage() {
		leavePage.clickOnLeavePage();
	}
	

}
