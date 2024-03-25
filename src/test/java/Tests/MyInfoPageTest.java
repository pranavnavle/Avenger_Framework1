package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.MyInfoPage;

public class MyInfoPageTest extends BasePage {

	LoginTest lp = new LoginTest();
	MyInfoPage mip = new MyInfoPage();
 
	@BeforeTest
	public void setup() {
		initialize();
		lp.verifyloginSetup();	
	}
	
	@Test 
	public void verifyClickOnMyInfoPage() {
		mip.clickOnMyinfoPage();
		
	}
	
	
}
