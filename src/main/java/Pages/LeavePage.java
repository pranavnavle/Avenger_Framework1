package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LeavePage extends BasePage {
	
   public LeavePage()
	{
		super();
	}

	By leavePage = By.linkText("Leave");
	By leavePageText = By.xpath("//span/h6");
	
	public void clickOnLeavePage() {
		driver.findElement(leavePage).click();
		Assert.assertEquals(LeavePageText(), "Leave");
	}
	public String LeavePageText() {
		String lpText = driver.findElement(leavePage).getText();
		return lpText;
	}
   
}
