package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	 driver.findElement(By.name("username")).sendKeys("imran");
	 driver.findElement(By.name("password")).sendKeys("123456");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).submit();
		

}
	

}
