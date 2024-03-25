package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.PerformancePage;

public class PerformancePageTest extends BasePage{
	
	LoginTest lt = new LoginTest();
	PerformancePage pp = new PerformancePage();
	
	@BeforeTest
	public void verifyClickOnPerformancePage() {
		initialize();
		lt.verifyloginSetup();
		
	}
	
	@Test
	public void verifyClickOnPp() {
		pp.clickOnPerformancePage();
		
	}
	

}
