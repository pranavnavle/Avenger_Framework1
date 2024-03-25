package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DashboardPage extends BasePage{
	
	public DashboardPage() {
		super();
		
	}
	
	By dashboardPage = By.linkText("Dashboard");
	By textOfDashboard = By.xpath("//*[@id=\"app\"]//span/h6");
	
	public void clickOnDashboard() {
		driver.findElement(dashboardPage).click();
		Assert.assertEquals(getTextOfDashboard(), "Dashboard");
	}
	
	public String getTextOfDashboard() {
	 String textDp = driver.findElement(textOfDashboard).getText();
	 return textDp; 
	}

}
