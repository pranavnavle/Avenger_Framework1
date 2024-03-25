package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PimPage extends BasePage {
	
	public PimPage() {
		super();
	}
	
	By pimPage = By.linkText("PIM");
	By pimText = By.xpath("//*[@id=\"app\"]//span/h6");
	
	public void clickOnPimPage() {
		driver.findElement(pimPage).click();
		Assert.assertEquals(getPimText(), "PIM");
	}
	
	public String getPimText() {
		String pimPageText = driver.findElement(pimPage).getText();
		return pimPageText;
	}

}
