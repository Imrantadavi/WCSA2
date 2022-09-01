package frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameString {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/tadav/OneDrive/Desktop/html/frame.html");
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("un")).sendKeys("imran");
		
		driver.switchTo().frame("frid");
		
		
		driver.findElement(By.id("pwd")).sendKeys("password");
	}

}
