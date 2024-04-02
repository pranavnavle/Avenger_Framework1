package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DirectoryPage extends BasePage {
	
	public DirectoryPage() {
		super();
	}
	
	By directoryPage = By.linkText("Directory");
	By directoryPageText = By.xpath("//*[@id=\"app\"]//span/h6");
	
	
	public void clickOnDirectoryPage() {
		driver.findElement(directoryPage).click();
		Assert.assertEquals(getTextOfDirectoryPage(), "Directory");
	}

	public String getTextOfDirectoryPage() {
		String textOfDp = driver.findElement(directoryPage).getText();
		return textOfDp ;
	}
}
