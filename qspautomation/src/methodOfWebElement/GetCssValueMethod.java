package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.faceboook.com/");
	 WebElement loginButton = driver.findElement(By.name("login"));
	 String cssvalue = loginButton.getCssValue("position");
				System.out.println(cssvalue);
	
		
	}
	
	}