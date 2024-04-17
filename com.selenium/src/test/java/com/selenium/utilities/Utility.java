package com.selenium.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Utility {
	WebDriver driver;
	FileReader fileReader;
	Properties properties;
	
	
    public Utility(WebDriver driver) {
		this.driver=driver;
	}
    
    public String navigateToUrl() {
    	String userdir=System.getProperty("user.dir");
    	System.out.println(userdir+"from utility");
    	try {
			fileReader=new FileReader(userdir+"/src/test/resources/browser.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	properties = new Properties();
    	try {
			properties.load(fileReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	String url=properties.getProperty("url");
    	
    	return url;
    }
    
    public void titleValidation(String expectedTitle) {
    	String actualTitle=driver.getTitle();
		Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
    
    public void invalidTitleValidation(String expectedTitle) {
    	String actualTitle=driver.getTitle();
		try {
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("title is correct");
		}else {
			throw new Exception("Title not correct");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
    }
	

}