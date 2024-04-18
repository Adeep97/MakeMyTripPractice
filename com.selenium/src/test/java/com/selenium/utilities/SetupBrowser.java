package com.selenium.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class SetupBrowser {
	FileReader fileReader;
	Properties properties;
	
	public String getBrowser() {
		String userdir=System.getProperty("user.dir");
		try {
			fileReader = new FileReader(userdir+"/src/test/resources/browser.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		properties =new Properties();
		try {
			properties.load(fileReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String browserName = properties.getProperty("browser");
		return browserName;
	}

}
