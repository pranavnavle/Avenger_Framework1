package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {
	 public Properties prop ;
	  static WebDriver driver;
	  
	public BasePage () {

		String filePath =System.getProperty("user.dir")+"\\src\\main\\resources\\config.Properties";
				//"C:\\Users\\Admin\\eclipse-workspace\\Avenger\\src\\main\\resources\\config.Properties";
	        	// This is the path of the config,properties
		try {
			FileInputStream fis = new FileInputStream(filePath);//Used For data read in prop file
		 prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error in Path");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File Loading Error");
		}
		
	}

public void initialize()  // Create method for initialize for browser
{
	String browser = prop.getProperty("browser");
	
	if(browser.equalsIgnoreCase(browser)) 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}else if(browser.equalsIgnoreCase(browser))
	{
		driver = new EdgeDriver();
	}

	
	String url = prop.getProperty("url"); //Create an object for Access url in config.prop file
	driver.get(url);
// WE can also add maximize screen implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
}
}
