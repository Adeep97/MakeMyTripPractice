package com.selenium.steps;

import org.openqa.selenium.WebDriver;

import com.selenium.pages.Login;
import com.selenium.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps extends BaseClass{
	BaseClass baseClass=new BaseClass();
	WebDriver driver=baseClass.setupBrowser();
	Login login;
	
	@Given("I navigate to MakeMyTrip page")
	public void i_navigate_to_make_my_trip_page() {
	    login=new Login(driver);
	    login.login();
	    
	}

	@Then("I validate the page")
	public void i_validate_the_page() {
	    login.validatePage();
	    driver.close();
	    
	}
	
	@Then("I validate the page for invalid scenario")
	public void i_validate_the_page_for_invalid_scenario() {
		login.invalidValidatePage();
		driver.close();
		
	}

}
