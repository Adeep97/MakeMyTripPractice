package com.selenium.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

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
	

}