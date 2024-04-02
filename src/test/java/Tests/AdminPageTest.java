package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AdminPage;
import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;

public class AdminPageTest extends BasePage{
	
	LoginTest  lpTxt = new LoginTest();
	AdminPage ap = new AdminPage();
	
	@BeforeTest
	public void setUp() {
		initialize();
		lpTxt.verifyloginSetup();
	}
	
	@Test
	public void verifyAdminPageText(){
		ap.clickOnAdminPage();
	}
	
	@Test
	public void verifySearchSystemUsers() throws InterruptedException{
 		ap.clickOnAdminPage();
		ap.searchSystemUser();
//		ap.selectAdminuserRole();
//		ap.enterEmployeeName();
//		ap.selectStatus();
//		ap.clickOnsubmitButton();
//		
	}
    @Test
    public void addUserRole() throws InterruptedException {
    	ap.clickOnAdminPage();
    	ap.addUserSetup();
//    	ap.addUser();
//    	ap.selectUserRole();
//    	ap.enterEmployeeName1();
    }
}
