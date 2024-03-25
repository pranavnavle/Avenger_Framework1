package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.HomePage;

public class HomePageTest extends BasePage {
	
	HomePage hp = new HomePage();
	LoginTest lp = new LoginTest();
	
	@BeforeTest
	public void setUp()
	{
		initialize();
		lp.verifyloginSetup();
		
	}

	@Test
	public void verifyHomePageText()
	{
		System.out.println("hp.getTextOfHp()");	
	}

}
