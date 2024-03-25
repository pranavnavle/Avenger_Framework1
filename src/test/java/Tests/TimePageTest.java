package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.TimePage;

public class TimePageTest extends BasePage {
	LoginTest lt = new LoginTest();
	TimePage tp = new TimePage();
	
	@BeforeTest
	public void setUp() 
	{
		initialize();
		lt.verifyloginSetup();
	}
	
	@Test
	public void VerifyClickOnTimePage() {
		tp.clickOnTime();
		
		
	}

	
}
