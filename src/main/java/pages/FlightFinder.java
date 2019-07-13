package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	@FindBy(css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > b > font > input[type=\"radio\"]:nth-child(1)")
	private WebElement roundTripRadioButton;
	
	@FindBy(name = "passCount")
	private WebElement PassengersCount;
	
	@FindBy(name = "fromPort")
	private WebElement DepartingFrom;
	
	@FindBy(css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=\"radio\"]:nth-child(4)")
	private WebElement FirstClass;
	
	@FindBy(name = "findFlights")
	private WebElement ContinueButton;
	
	
public FlightFinder (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	} 

public void flightFinderPage() {
	roundTripRadioButton.click();
	
	Select dropdown = new Select(PassengersCount);  
	dropdown.selectByIndex(3);
	
	Select dropdown2 = new Select(DepartingFrom);
	dropdown2.selectByValue("London");
	
	FirstClass.click();
	
	ContinueButton.click();
	
}
	
	

}
