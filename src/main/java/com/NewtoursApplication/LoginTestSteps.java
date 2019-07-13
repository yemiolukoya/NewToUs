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
import cucumber.api.java.en.When;
import pages.Login;

public class LoginTestSteps {
	
	Login lp;
	
	// 1
	WebDriver driver;
	
	//Hook
	@Before
	public void openBrowser() {
		// To open the browser
		System.setProperty("webDriver.chrome.driver", "chromedriver");
		//driver = new ChromeDriver();	
		}
	
	//Hook
	@After
	public void closeBrowser() {
		// To close the browser
		//driver.close();
		}
	
	@Given("^the user is on newtours application website$")
	public void the_user_is_on_newtours_application_website() throws Throwable {
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    
	}

	@When("^the user enter valid username$")
	public void the_user_enter_valid_username() throws Throwable {
		lp.applicationLogin("mercury", "mercury");
		//driver.findElement(By.name("userName")).sendKeys("mercury");
	    
	}

	@When("^the user enters valid password$")
	public void the_user_enters_valid_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("mercury");

	}
	
	@When("^he clicked submit button$")
	public void he_clicked_submit_button() throws Throwable {
		driver.findElement(By.name("login")).click();

	    
	}

	@Then("^he must see the SIGN-OFF option$")
	public void he_must_see_the_SIGN_OFF_option() throws Throwable {
		boolean signOffIsVisible = driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
		Assert.assertTrue(signOffIsVisible);
		
		String title = driver.getTitle();
		Assert.assertEquals("Find a Flight: Mercury Tours:", title);
		
	}
	
	

	@Then("^he must see the SIGN-ON option$")
	public void he_must_see_the_SIGN_ON_option() throws Throwable {
		boolean signOnIsVisible = driver.findElement(By.linkText("SIGN-ON")).isDisplayed();
		Assert.assertTrue(signOnIsVisible);

	}
	
	@When("^the user enter valid \"([^\"]*)\"$")
	public void the_user_enter_valid(String arg1) throws Throwable {
	    driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^the user enters invalid \"([^\"]*)\"$")
	public void the_user_enters_invalid(String arg1) throws Throwable {
	    driver.findElement(By.name("password")).sendKeys(arg1);
 
		}
	
	

	}
