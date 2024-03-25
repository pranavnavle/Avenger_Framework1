package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RecruitmentPage extends BasePage {

	public RecruitmentPage() {
		super();
	}
	
	By recruitmentPage = By.linkText("Recruitment");
	By textOfRp = By.xpath("(//span)[13]/h6");
	
	public void clickOnRecruitmentPage() {
		driver.findElement(recruitmentPage).click();
		Assert.assertEquals(getTextofRp(), "Recruitment");
	}
	
	public String getTextofRp() {
		String textRp = driver.findElement(recruitmentPage).getText();
		return textRp;
	}
}
