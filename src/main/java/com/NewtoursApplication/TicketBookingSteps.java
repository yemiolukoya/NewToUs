package com.NewtoursApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.BookAFlight;
import pages.FlightFinder;
import pages.Login;
import pages.SelectFlight;

public class TicketBookingSteps {
	
	private WebDriver driver;
	private Login lp;
	private FlightFinder ff;
	private SelectFlight sf;
	private BookAFlight bf;
	
	@Before
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Given("^the user has logged in the the application successfully$")
	public void the_user_has_logged_in_the_the_application_successfully() throws Throwable {
		
		//driver = new ChromeDriver();
		lp = new Login(driver);
		lp.applicationLogin("mecury", "mecury");
	    
	}

	@Given("^he select the flight details on the flight finder page$")
	public void he_select_the_flight_details_on_the_flight_finder_page() throws Throwable {
		
		ff = new FlightFinder(driver);
		ff.flightFinderPage();
	    
	}

	@Given("^he selects the departure and return flight on select flight page$")
	public void he_selects_the_departure_and_return_flight_on_select_flight_page() throws Throwable {
	    sf = new SelectFlight(driver);
	    sf.SelectFlightPage();
	}

	@Given("^he enters all the mandatory details on the book a flight page$")
	public void he_enters_all_the_mandatory_details_on_the_book_a_flight_page() throws Throwable {
		bf = new BookAFlight(driver);
		bf.BookAFlightPage("Yemi", "oluko", "1234567890");
	    
	}

	@Then("^he must be able to get a successful message at the end$")
	public void he_must_be_able_to_get_a_successful_message_at_the_end() throws Throwable {
		
		boolean ConfirmationText = driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(1) > td > img")).isDisplayed();
		Assert.assertTrue(ConfirmationText);
		
		String ActualConfirmationText = driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")).getText();
	    String ExpectedConfirmationText = "Your itinerary has been booked!";
	    Assert.assertEquals(ExpectedConfirmationText, ActualConfirmationText);
	}
	@After
	public void closeBrowser() {
		driver.close();
		
	}
	}

	
	


