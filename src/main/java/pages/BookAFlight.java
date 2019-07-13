package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookAFlight {
	@FindBy(name = "passFirst0")
	private WebElement FirstNameField;
	
	@FindBy(name = "passLast0")
	private WebElement LastNameField;
	
	@FindBy(name = "pass.0.meal")
	private WebElement MealDropDown;
	
	@FindBy(name = "creditCard")
	private WebElement CardType;
	
	@FindBy(name = "creditnumber")
	private WebElement CreditNumber;
	
	@FindBy(name = "cc_exp_dt_mn")
	private WebElement ExpireMonth;
	
	@FindBy(name = "cc_exp_dt_yr")
	private WebElement ExpireYear;
	
	@FindBy(name = "buyFlights")
	private WebElement SubmitButton;
	
	
	
	
	
public BookAFlight (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	} 

public void BookAFlightPage(String firstName, String lastName, String cardNumber) {
	FirstNameField.sendKeys(firstName);
	LastNameField.sendKeys(lastName);
	Select mealDropDown = new Select (MealDropDown);
	mealDropDown.selectByIndex(2);
    Select cardTypeDropDown = new Select (CardType);
    cardTypeDropDown.selectByIndex(2);
    CreditNumber.sendKeys(cardNumber);
    Select expireMonthDropDown = new Select (ExpireMonth);
    expireMonthDropDown.selectByIndex(2);
    Select expireYearDropDown = new Select (ExpireYear);
    expireYearDropDown.selectByIndex(2);
    SubmitButton.click();
    
    
    
    
    
    
	
	
}
	

}
