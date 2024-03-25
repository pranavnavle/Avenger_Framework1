package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MyInfoPage extends BasePage {

	public MyInfoPage() {
		super();
	}
	
	By myinfoPage = By.linkText("My Info");
	By myinfoPageText = By.xpath("//span/h6");
	
	
	public void clickOnMyinfoPage() {
		driver.findElement(myinfoPage).click();
		Assert.assertEquals(getTextOfMyinfoPage(), "My Info");
	}
	
	public String getTextOfMyinfoPage() {
		String textMp = driver.findElement(myinfoPage).getText();
		return textMp;
		
	}
	

}
