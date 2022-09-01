package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/tadav/OneDrive/Desktop/html/checkbox.html");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='automation']"));
		checkbox.click();
		boolean select = checkbox.isSelected();
		System.out.println(select);
		
	}
	

}