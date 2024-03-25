package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.LoginPage;

public class LoginTest extends BasePage {

	LoginPage lp = new LoginPage();
	
	@BeforeTest
	public void setUp()
	{
		initialize();
	}
	
	
	@Test
	
//	public void verifyLogin() {
//		String userName= prop.getProperty("userName");
//		lp.enterUserName(userName);
//		
//		String passWord = prop.getProperty("password");
//			lp.enterPass(passWord);
//			
//			lp.clickOnLoginBttn();

//	}
	
	public void verifyloginSetup() //I write single method for user login instead of verifyLogin method
	{ 
		lp.getLogin("Admin","admin123");
		
	}
		
	}
	



