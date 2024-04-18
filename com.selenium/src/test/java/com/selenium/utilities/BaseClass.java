package com.selenium.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
    protected WebDriver driver;
    SetupBrowser setup;
    
	
	public WebDriver setupBrowser() {
		setup=new SetupBrowser();
		String browserName=setup.getBrowser();
		if(browserName.equalsIgnoreCase("CHROME")) {
			driver=chromeSetup();
		}
		return driver;
	}

	private WebDriver chromeSetup() {
		String usrdir=System.getProperty("user.dir");
		System.out.println(usrdir);
	    System.setProperty("webdriver.chrome.driver", usrdir+"/Drivers/chromedriver.exe");
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    return driver;
	}

}
