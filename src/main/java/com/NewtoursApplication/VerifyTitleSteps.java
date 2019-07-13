package com.NewtoursApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyTitleSteps {
	
	WebDriver driver;

	
	@Given("^i am on linkedin website$")
	public void i_am_on_linkedin_website() throws Throwable {
		//System.setProperty("webDriver.chrome.driver", "chromedriver");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
	    
	}

	@When("^i enter email$")
	public void i_enter_email() throws Throwable {
		driver.findElement(By.id("login-email")).sendKeys("omoyemi.olukoya@hotmail.com");
	    
	}

	@When("^i enter password$")
	public void i_enter_password() throws Throwable {
	    driver.findElement(By.id("login-password")).sendKeys("olukoya");
	}

	@Then("^i click signin$")
	public void i_click_signin() throws Throwable {
		driver.findElement(By.id("login-submit")).click();
	    
	}

	@Then("^the title should be \\((\\d+)\\) LinkedIn$")
	public void the_title_should_be_LinkedIn(int arg1) throws Throwable {
		
		boolean homeIsVisible = driver.findElement(By.linkText("Home")).isDisplayed();
		Assert.assertTrue(homeIsVisible);
		
		
		String title = driver.getTitle();
		Assert.assertEquals("LinkedIn", title);
	    
	}

}
