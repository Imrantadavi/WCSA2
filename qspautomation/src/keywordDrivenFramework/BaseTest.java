package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest implements IAutoConstant{
	static WebDriver driver;
	public void openBrowser() throws IOException //to open the browser
	{
		Flib flib = new Flib();
		
		//read the browser value
		  String browservalue = flib.readPropertyFile("./Data/config.properties","browser");
		
		//read url Value
		 String url = flib.readPropertyFile("./Data/config.properties", "url");
		 
		 if(browservalue.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			 
		 }
		 
		 else if (browservalue.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get(url );
			 
			
		}
		
	}

	
	//close all browser
	public void closeBrowser()
	{
		driver.quit();
	}
}
