package WebPagePopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/tadav/OneDrive/Desktop/html/confirmation.html");
		
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		
		alt.accept();
		
		String txt = driver.findElement(By.id("demo")).getText();
		System.out.println(txt);
	}

}










