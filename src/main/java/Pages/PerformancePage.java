package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PerformancePage extends BasePage {
	
	public PerformancePage() {
		super();
	}
	
	By performancePage = By.linkText("Performance");
	By performancePageText = By.xpath("(//span[@class=\"oxd-topbar-header-breadcrumb\"]//h6)[1]");

	
	public void clickOnPerformancePage() {
		driver.findElement(performancePage).click();
		Assert.assertEquals(getTextOfPp() , "Performance");
	}
	
	public String getTextOfPp() {
		String textpp = driver.findElement(performancePageText).getText();
		return textpp;
	}
}
