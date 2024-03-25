package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.DashboardPage;

public class DashboardTest extends BasePage {
	
	LoginTest lt = new LoginTest();
	DashboardPage dp = new DashboardPage();
	
    @BeforeTest
    public void setUp() {
    	initialize();
    	lt.verifyloginSetup();	
    }
    
    @Test
    public void verifyClickOnDp() {
    	dp.clickOnDashboard();
    	
    }
}
