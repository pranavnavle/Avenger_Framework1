package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AdminPage;
import Pages.BasePage;
import Pages.PimPage;

public class PimPageTest extends BasePage{
	LoginTest  lpTxt = new LoginTest();
	AdminPage ap = new AdminPage();
	PimPage pimPage = new PimPage();
	
	@BeforeTest
	public void setUp() {
		initialize();
		lpTxt.verifyloginSetup();
	}
	
	@Test
	public void verifyClickOnPim()
	{
		pimPage.clickOnPimPage();
	}
}
