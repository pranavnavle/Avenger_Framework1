package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class TimePage extends BasePage {

	public TimePage() {
		super();
	}
	
	By timePage = By.linkText("Time");
	By timepageText = By.xpath("(//span//h6)[2]");
	
	public void clickOnTime() {
		driver.findElement(timePage).click();
		Assert.assertEquals(getTextOfTimePage(), "Time");
	}
	
	public String getTextOfTimePage() {
		String textOfTime = driver.findElement(timePage).getText();
		return textOfTime;
	}

}
