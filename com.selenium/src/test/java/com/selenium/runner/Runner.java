package com.selenium.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
glue="com.selenium.steps",
plugin={"pretty" ,"html:target/HtmlReports/report.html","json:target/JsonReports/report.json"},
tags="@ValidLogin",
dryRun=false,
monochrome=true)


public class Runner {

}
