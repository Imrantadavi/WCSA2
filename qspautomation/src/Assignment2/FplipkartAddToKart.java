package Assignment2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FplipkartAddToKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("APPLE iPhone 13 Pro (Gold, 512 GB)");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Set<String> allHandle = driver.getWindowHandles();
		for (String tab : allHandle) {
			
			if (!parentHandle.equals(tab)) {
				driver.switchTo().window(tab);
			}
		}
		driver.findElement(By.xpath("//a[@class='kmlXmn qaAL3J']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='256 GB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nZz3kj _1hNI6F']/descendant::div[.='Remove']")).click();
		
		
		
	
		
	}

}
