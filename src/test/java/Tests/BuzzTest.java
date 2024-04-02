package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.BuzzPage;

public class BuzzTest extends BasePage{

  LoginTest lt = new LoginTest();
   BuzzPage bp = new BuzzPage();
	
	@BeforeTest
	public void setUp() {
		initialize();
		lt.verifyloginSetup();
	}
	
	@Test
	public void verifyClickOnBuzzPage() {
		bp.clickOnBuzz();
	}
}
