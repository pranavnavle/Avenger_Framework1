package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.DirectoryPage;

public class DirectoryPageText extends BasePage{
	LoginTest lt = new LoginTest();
	DirectoryPage dp = new DirectoryPage();
	
	@BeforeTest
	public void setUp() {
		initialize();
		lt.verifyloginSetup();
	}
	
	@Test
	public void verifyClickOnDirectoryPage() {
		
		dp.clickOnDirectoryPage();
	}
	

}
