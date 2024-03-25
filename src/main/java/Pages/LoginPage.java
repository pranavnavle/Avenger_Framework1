package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BasePage {

	public LoginPage()
	{
		super();
	}
	HomePage hp = new HomePage();
	
	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//div[2]/form/div[3]/button");
	
	
	public void enterUserName(String un){
		driver.findElement(username).sendKeys(un);
	}
	
	public void enterPass(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLoginBttn() {
		driver.findElement(loginButton).click();
	}
	
	public void getLogin(String un,String pwd) {
		enterUserName(un);
		enterPass(pwd);
		clickOnLoginBttn();
		Assert.assertEquals(hp.getTextOfHp(), "Dashboard");
		
		
	}

}
