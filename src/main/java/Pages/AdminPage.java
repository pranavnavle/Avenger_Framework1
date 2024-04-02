package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AdminPage extends BasePage{

	public AdminPage() {
		super();
	}

	By adminPage = By.linkText("Admin");
	By aptext =By.xpath("//*[@id='app']//span/h6");
	By userNameText = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By userRole = By.xpath("(//*[@id=\"app\"]//div[2]/i)[1]");
    By selectUserRole = By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]");
    By employeeName = By.cssSelector("input[placeholder=\"Type for hints...\"]");
    By selectStatus = By.xpath("(//div[@class=\"oxd-select-text-input\"])[2]");
    By submitButton = By.xpath("//button[@type=\"submit\"]");
    		//By.cssSelector("button[type=\"submit\"]");
    //Locators for addUserAdmin
    By addAdminUser = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
    By selectUserRole1 = By.xpath("(//div[@id=\"app\"]//div[2]/i)[1]");
    By employeeName1 = By.cssSelector("input[placeholder=\"Type for hints...\"]");
    By selectStatus1 = By.xpath("(//*[@id=\"app\"]//div[2]/i)[2]");
    By userName  = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By password = By.xpath("(//input[@type=\"password\"])[1]");
    By confirmPassword = By.xpath("(//input[@type=\"password\"])[2]");
    By saveButton    = By.xpath("//button[@type=\"submit\"]");
    
	public void clickOnAdminPage() {
		driver.findElement(adminPage).click();
		Assert.assertEquals(getTextOfAdminPage(), "Admin");

	}

	public String getTextOfAdminPage() {
		String apText = driver.findElement(aptext).getText();
		return apText;
	}
	
	public void enterUsernameTextField () {
		driver.findElement(userNameText).sendKeys("Admin");
	}
	
	public void selectAdminuserRole() {
		driver.findElement(userRole).click();
		Actions action = new Actions(driver);
		action.keyDown(Keys.ARROW_DOWN);
		action.keyUp(Keys.ARROW_DOWN);
		action.keyDown(Keys.ENTER);;
		action.keyUp(Keys.ENTER).build().perform();;
	}

	public void enterEmployeeName() throws InterruptedException {
		driver.findElement(employeeName).sendKeys("Razeet");
		Thread.sleep(Duration.ofSeconds(5));
		Actions action = new Actions(driver);
		action.keyDown(Keys.ARROW_DOWN);
		action.keyUp(Keys.ARROW_DOWN);
		action.keyDown(Keys.ENTER);
		action.keyUp(Keys.ENTER).build().perform();;
	}
	
	public void selectStatus() {
		driver.findElement(selectStatus).click();
		Actions action = new Actions(driver);
		action.keyDown(Keys.ARROW_DOWN);
		action.keyUp(Keys.ARROW_DOWN);
		action.keyDown(Keys.ENTER);
		action.keyUp(Keys.ENTER).build().perform();;
		
	}
	public void clickOnsubmitButton() {
		driver.findElement(submitButton).click();
		
	}
	
	public void searchSystemUser() throws InterruptedException {
		enterUsernameTextField ();
		selectAdminuserRole();
		enterEmployeeName();
		selectStatus();
		clickOnsubmitButton();	
	}
	
	// This methods for add new user
	
	public void addUser() {
		driver.findElement(addAdminUser).click();
	}
	public void selectUserRole() {
		driver.findElement(selectUserRole1).click();
		Actions action = new Actions(driver);
		action.keyDown(Keys.ARROW_DOWN);
		action.keyUp(Keys.ARROW_DOWN);
		action.keyDown(Keys.ARROW_DOWN);
		action.keyUp(Keys.ARROW_DOWN);
		action.keyDown(Keys.ENTER);
		action.keyUp(Keys.ENTER).build().perform();
		
	}
	public void enterEmployeeName1() throws InterruptedException {
		driver.findElement(employeeName1).sendKeys("Ranga");
		Thread.sleep(Duration.ofSeconds(5));
		Actions action = new Actions(driver);
		action.keyDown(Keys.ARROW_DOWN);
		action.keyUp(Keys.ARROW_DOWN);
		action.keyDown(Keys.ENTER);
		action.keyUp(Keys.ENTER).build().perform();;
		
	}
	
	public void selectStatus1() {
		driver.findElement(selectStatus1).click();
		Actions action = new Actions(driver);
		action.keyDown(Keys.ARROW_DOWN);
		action.keyUp(Keys.ARROW_DOWN);
		action.keyDown(Keys.ARROW_DOWN);
		action.keyUp(Keys.ARROW_DOWN);
		action.keyDown(Keys.ENTER);
		action.keyUp(Keys.ENTER).build().perform();
		
	}
	
	public void enterUserName() {
		driver.findElement(userName).sendKeys("Pranav09");
		
	}
	
	public void enterPassword() {
		driver.findElement(password).sendKeys("OrangeHrm01");
	}
	
    public void enterConfirmPassword() throws InterruptedException {
    	Thread.sleep(Duration.ofSeconds(5));
    	driver.findElement(confirmPassword).sendKeys("OrangeHrm01");
    }
    
    public void clickOnSaveButton() {
    	driver.findElement(saveButton).click();
    }
    
    public void addUserSetup() throws InterruptedException {
    	addUser();
    	selectUserRole();
    	enterEmployeeName1();
    	selectStatus1();
    	enterUserName();
    	enterPassword();
    	enterConfirmPassword();
    	clickOnSaveButton();	
    }
}
