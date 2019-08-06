package com.betabreakers.website_automation_test2;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

//import cucumber.api.PendingException;


public class stepDefinitions {
	
	protected WebDriver driver;
	
	@Before
		public void setup() {
        	driver = new FirefoxDriver();
	}
	
	@Given("^I navigate to Betabreakers\\.com$")
	public void i_navigate_to_Betabreakers_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Accessing Betabreakers.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.betabreakers.com/");
		//driver.quit();
	}
	
	
	// From art of testing.com 
	/* 
	@When("^I enter \"([^\"]*)\" in search textbox$")
	public void I_enter_in_search_textbox(String additionTerms) {
		//Write term in google textbox
		WebElement googleTextBox = driver.findElement(By.id("gbqfq"));
		googleTextBox.sendKeys(additionTerms);
					
		//Click on searchButton
		WebElement searchButton = driver.findElement(By.id("gbqfb"));
		searchButton.click();
	 * 
	 */

	@When("^I navigate to the Services page$")
	public void i_navigate_to_the_Services_page() throws Throwable {
		System.out.println("Clicking on the Services Page link");
		driver.findElement(By.id("menu-item-31")).click();
		//driver.findElement(By.linkText("Services"));
		//WebElement services_dropdown=driver.findElement(By.id("menu-item-31"));
		//Select service_menu_item = new Select(dropdown);
		//menu_item.selectById("menu-item-132");
	}

	@Then("^the page services should be visible$")
	public void the_page_services_should_be_visible() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checking page for Services area");
		driver.findElement(By.id("service-section"));
		System.out.println("Found Services area");
		driver.quit();
	}
}
