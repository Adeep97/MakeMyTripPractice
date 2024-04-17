package com.selenium.pages;

import org.openqa.selenium.WebDriver;

import com.selenium.utilities.Utility;

public class Login {
	WebDriver driver;
	Utility utility;
	
	public Login(WebDriver driver){
		this.driver=driver;
		
	}

	public void login() {
		utility=new Utility(driver);
		String url =utility.navigateToUrl();
		driver.get(url);
		
	}

	public void validatePage() {
		String expectedTitle="MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		utility.titleValidation(expectedTitle);
		
	}

	public void invalidValidatePage(){
		String expectedTitle="MyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		utility.invalidTitleValidation(expectedTitle);
		
	}

}
