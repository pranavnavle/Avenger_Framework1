package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MaintenancePage extends BasePage {

	public MaintenancePage() 
	{
		super();
	}
	
	By maintenancePage = By.linkText("Maintenance");
	By maintenancePageText = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/h6");
	
	public void clickOnMaintenancePage () {
		driver.findElement(maintenancePage).click();
		Assert.assertEquals(textOfMaintenancePage(), "Administrator Access");
	}
	
	public String textOfMaintenancePage() {
		String text = driver.findElement(maintenancePageText).getText();
		return text;
	}
	
}
