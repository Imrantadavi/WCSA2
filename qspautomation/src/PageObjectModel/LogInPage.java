package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	//Declaration
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkbox;
	@FindBy(xpath="//a[contains(text(),'Actimind')]") private WebElement linkActiTime;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	
	
	
	//Initialization
	
		public LogInPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
	
	
	//Utilization
	
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getLinkActiTime() {
		return linkActiTime;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	public WebElement getLogo() {
		return logo;
	}
	
	
	
	
	
	
	//Operational Method
	
	public void validLoginActiTime(String validUsername, String validPassword)
	{
		usn.sendKeys("admin");
		pass.sendKeys("manager");
		loginButton.click();
		
	}
	
	public void invalidActiTime(String invalidUsername, String invalidpassword) throws InterruptedException
	{
		usn.sendKeys("admin");
		pass.sendKeys("manager21");
		loginButton.click();
		Thread.sleep(3000);
		usn.clear();
	}

}