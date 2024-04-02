package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.MaintenancePage;

public class MaintenanceTest extends BasePage {
	
	LoginTest lt = new LoginTest();
	MaintenancePage mp = new MaintenancePage();
	
	@ BeforeTest
	public void loginSetup() {
		initialize();
		lt.verifyloginSetup();
	}
	
	@Test
	public void verifyClickOnMaintenancePage() {
		mp.clickOnMaintenancePage();
		
	}
	

}
