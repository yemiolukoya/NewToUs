package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(name = "userName")
	private WebElement userField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(name = "login")
	private WebElement submitButton;
	
	
	public Login (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void applicationLogin (String username, String password) {
		userField.sendKeys(username);
		passwordField.sendKeys(password);
		submitButton.click();
		
	}
	
	

}
