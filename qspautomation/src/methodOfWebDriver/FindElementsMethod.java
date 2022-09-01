package methodOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shoes");
		Thread.sleep(2000);
		
		List<WebElement> webElementSuggestion = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		

		for(WebElement sugg:webElementSuggestion)
		{
			String Suggession = sugg.getText();
			System.out.println(Suggession);
		}
		}
	}
	
	

