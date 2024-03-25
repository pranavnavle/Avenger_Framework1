package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.RecruitmentPage;

public class RecruitmentPageTest extends BasePage{
	
	LoginTest lp = new LoginTest();
	RecruitmentPage rp = new RecruitmentPage();
	
	@BeforeTest
	public void setUp() {
		initialize();
		lp.verifyloginSetup();
	}
	
	@Test
	public void verifyClickOnRecruitmentPage() {
		
		rp.clickOnRecruitmentPage();
	}

}
