package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScWebElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		
		
		File src = loginbutton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/webelement.jpg");
		
		Files.copy(src, dest);
		
		
	}

}
