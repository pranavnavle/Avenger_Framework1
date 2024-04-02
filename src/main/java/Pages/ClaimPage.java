package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ClaimPage extends BasePage {
	
	public ClaimPage () {
		super();
	}

	By claimPage = By.linkText("Claim");
	By TextCp = By.xpath("//*[@id='app']//span/h6");
	
	
	public void clickOnClaimPage() {
		driver.findElement(claimPage).click();
		Assert.assertEquals(getTextOfClaimPage(), "Claim");
	}
	
	public String getTextOfClaimPage() {
		String cpText = driver.findElement(TextCp).getText();
		return cpText;
	}
}
