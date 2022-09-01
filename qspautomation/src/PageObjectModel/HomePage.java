package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	
	@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropdown;
	@FindBy(xpath="(//a[contains(text(),'task')])[2]") private WebElement createNewTaskLink;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeButton;
	@FindBy(xpath = "//a[.=\"Logout\"]") private WebElement logout;
	
	//Initialization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	//Utilization
	
	public WebElement getEnterTimeTrackDropdown() {
		return enterTimeTrackDropdown;
	}
	
	public WebElement getCreateNewTaskLink() {
		return createNewTaskLink;
	}
	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
	}
	public WebElement getLogoutlink() {
		return getLogoutlink();
	}
	
	//Operational Method
	
	public void logoutActitime()
	{
		
		getLogoutlink().click();
	}
	
	

}
