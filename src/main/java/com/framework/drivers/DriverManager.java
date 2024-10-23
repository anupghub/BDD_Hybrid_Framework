package com.framework.drivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
        	String projectPath = System.getProperty("user.dir");
        	System.out.println("Project path :" +projectPath);
        	System.getProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver(); 
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit(); 
            driver = null;
        }
    }
}
