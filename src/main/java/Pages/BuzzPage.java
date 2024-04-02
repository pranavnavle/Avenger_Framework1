package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuzzPage extends BasePage{

	public BuzzPage() {
		super();
	}
	
	By buzzPage = By.linkText("Buzz");
	By textBuzz = By.xpath("//*[@id='app']//span/h6");
	
	public void clickOnBuzz() {
		driver.findElement(buzzPage).click();
		Assert.assertEquals(textOfBuzzPage (),"Buzz");
		
	}
	
	public String textOfBuzzPage () {
		String textBuzz = driver.findElement(buzzPage).getText();
		return textBuzz;
	}
}
