package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminPage extends BasePage{
	
	public AdminPage() {
		super();
	}
	
	By adminPage = By.linkText("Admin");
	
	
	public void clickOnAdminPage() {
		driver.findElement(adminPage).click();
		Assert.assertEquals(getTextOfAdminPage(), "Admin");

	}
	
	public String getTextOfAdminPage() {
		String apText = driver.findElement(adminPage).getText();
		return apText;
	}

}
