package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BasePage {
	
	public HomePage()
	{
		super();
		
	}

	By searchBox = By.xpath("//input[@class=\"oxd-input oxd-input--active\"]");
	By homePageText = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");
	
	public void clickOnSearchbox() {
		  driver.findElement(searchBox);
		 
	}
	
	public String getTextOfHp()// get text for HomePage
	{
		String text=driver.findElement(homePageText).getText();
		return text;
	}
	
		
	}
	
	
	


