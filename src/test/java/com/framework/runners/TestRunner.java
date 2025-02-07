package com.framework.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"com.framework.stepdefinitions"},monochrome=true,
    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/JSONReport/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    tags = "@OrderProduct or @ProductSort or @Invalidlogin or @SmokeTest"  
  
)
public class TestRunner  
{
    
}
