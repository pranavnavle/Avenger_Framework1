package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.ClaimPage;

public class ClaimPageTest extends BasePage {
	
	LoginTest lt = new LoginTest();
	ClaimPage cp = new ClaimPage();
	
	@BeforeTest
	public void setUp () {
	 initialize();
	 lt.verifyloginSetup(); 
	}
	
	@Test
	public void verifyClickOnClaimPage() {
    
	 cp.clickOnClaimPage();
	}

}
