package com.selenium.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
    protected WebDriver driver=setupBrowser();
	public Properties properties;
	public FileReader file;
	
	private WebDriver setupBrowser() {
		String userdir=System.getProperty("user.dir");
		
		try{
			file=new FileReader(userdir+"/src/test/resources/browser.properties");
		}catch(Exception e) {
			e.getStackTrace();
		}
		properties=new Properties();
		try{
			properties.load(file);
		}catch(IOException e) {
			e.getStackTrace();
		}
		System.out.println(properties.getProperty("browser"));
		
		String Browser=properties.getProperty("browser");
		System.out.println("Current Browser used"+" "+Browser);
		if(Browser.equalsIgnoreCase("Chrome")) {
			chromeSetup();
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
	    return driver;
	}

}
