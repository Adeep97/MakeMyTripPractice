package com.selenium.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

import com.selenium.pages.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	WebDriver driver;
	Login login;
	
	@Given("I navigate to MakeMyTrip page")
	public void i_navigate_to_make_my_trip_page() {
		String usrdir=System.getProperty("user.dir");
		System.out.println(usrdir);
	    System.setProperty("webdriver.chrome.driver", usrdir+"/Drivers/chromedriver.exe");
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
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
