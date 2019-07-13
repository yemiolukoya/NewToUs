package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
	@FindBy(name = "outFlight")
	private WebElement Departure;
	
	@FindBy(name = "inFlight")
	private WebElement Return;
	
	@FindBy(name = "reserveFlights")
	private WebElement ContinueButton;
	
public SelectFlight (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	} 

public void SelectFlightPage() {
	Departure.click();
	Return.click();
	ContinueButton.click();
	
}

}
